package com.slb.apigee.xchange.client;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.bloomberg.services.datalicense.dlws.ps._20071001.Data;
import com.bloomberg.services.datalicense.dlws.ps._20071001.InstrumentData;
import com.bloomberg.services.datalicense.dlws.ps._20071001.MarketSector;
import com.bloomberg.services.datalicense.dlws.ps._20071001.PerSecurityWS;
import com.bloomberg.services.datalicense.dlws.ps._20071001.RetrieveGetDataRequest;
import com.bloomberg.services.datalicense.dlws.ps._20071001.RetrieveGetDataResponse;
import com.slb.apigee.xchange.entity.BloombergXchangeRateEntity;
import com.slb.apigee.xchange.entity.Currency;
import com.slb.apigee.xchange.service.CurrencyService;
import com.slb.apigee.xchange.service.XChangeRatesService;

@Service
public class BloombergGetDataService extends BloombergSoapService {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	
	@Autowired
	private CurrencyService currencyService;

	@Autowired
	private XChangeRatesService xchangeRatesService;

	DateFormat format = new SimpleDateFormat("MM/dd/yyyy");

	DateFormat formatDatetime = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");


	public void execute(List<Currency> currencyList, Integer usernumber, String type) throws Exception {

		// Logic to check ping ELK is success before
		// proceeding further.
		boolean pingResponse = Boolean.FALSE;
		int retryCount = 0;
		while (!pingResponse && retryCount < 5) {
			retryCount++;
			try {
				pingResponse = xchangeRatesService.pingELK();
				LOG.info("##### ping response {} ", pingResponse);

			} catch (IOException e) {
				LOG.warn("$$$$$ Exception while checking ELK PING for the no#{}, {} ", retryCount, e.getMessage());

			}
		}

		// call bloomberg soap service and get a response id
		String responseId = submitGetDataRequest(currencyList,usernumber,type);		 

		try {
			// wait for 2 minutes
			LOG.info("Submitted Request for Rates, waiting for 2min to Get data.");
			TimeUnit.MINUTES.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		LOG.info("##### Retriving data response");
		// call bloomberg soap service with the response id
		RetrieveGetDataResponse response = retrieveGetDataResponse(responseId);

		LOG.info("##### Preparing Xchange entity list");
		// parse the response from bloomberg
		List<BloombergXchangeRateEntity> responseList = parseRetrieveGetDataRequestResponse(response);

		LOG.info("##### Updating to ELK ....");
		// persist in oracle db with today's date. If exits updates the recored
		// or else inserts the data.

		if (responseList != null)
			xchangeRatesService.bulkPushtoELK(responseList);
		
		LOG.info("##### Exchange Rates Data loaded to ELK successfully");

	}

	/**
	 * All data needed for cache
	 * 
	 * @return
	 */
	public String submitGetDataRequest(List<Currency> currencyList, Integer usernumber,String type) {

		String responseId = null;
		try {
			// apache CXF/Jaxb generated classes from WSDL to Java
			PerSecurityWS port = getPerSecurityWS();

			if (currencyList != null && currencyList.size() > 0) {
				BloombergServiceRequest request = new BloombergServiceRequest(currencyList,usernumber,type);

				port.submitGetDataRequest(request.getHeaders(), request.getFieldsets(), request.getFields(),
						request.getInstruments(), request.getStatusCode(), request.getRequestId(),
						request.getResponseId());

				responseId = request.getResponseId().value;
				LOG.info("submitGetDataRequest: The response id is " + responseId);
			} else {
				throw new Exception("Empty curriencs List");
			}

		} catch (Exception e) {
			LOG.error(e.getMessage());
			e.printStackTrace();
		}
		return responseId;

	}

	 

	/**
	 * Call bloomberg service to get the response
	 * 
	 * @param responseId
	 * @return
	 */
	public RetrieveGetDataResponse retrieveGetDataResponse(String responseId) {

		RetrieveGetDataResponse response = null;
		try {
			PerSecurityWS port = getPerSecurityWS();

			RetrieveGetDataRequest request = new RetrieveGetDataRequest();
			request.setResponseId(responseId);

			response = port.retrieveGetDataResponse(request);

			int responseStatusCode = response.getStatusCode().getCode();
			int maxRetries = 5;
			int retryCount = 0;
			while (responseStatusCode == 100 && retryCount < maxRetries) {
				retryCount++;
				LOG.info("Retry-" + retryCount + ", will try after 2 min....");
				TimeUnit.MINUTES.sleep(2);
				response = port.retrieveGetDataResponse(request);
				responseStatusCode = response.getStatusCode().getCode();
			}
			LOG.info("retrieveGetDataResponse: responseId = " + responseId
					+ " response: Instrument Data received size = "
					+ response.getInstrumentDatas().getInstrumentData().size() + " Attempts = " + retryCount);

		} catch (Exception e) {
			e.printStackTrace();
			LOG.error(e.getMessage());

		}

		return response;
	}

	public List<BloombergXchangeRateEntity> parseRetrieveGetDataRequestResponse(RetrieveGetDataResponse response)
			throws ParseException {
		List<BloombergXchangeRateEntity> list = new ArrayList<BloombergXchangeRateEntity>();
		List<InstrumentData> instrumentDataList = response.getInstrumentDatas().getInstrumentData();
		LOG.info("##### Processing Xchange Rates Total count = {} " + instrumentDataList.size());
		for (int i = 0; i < instrumentDataList.size(); i++) {

			InstrumentData instrumentData = instrumentDataList.get(i);
			List<Data> data = instrumentData.getData();
			
			

			// If Primary key TICKER is null then skip adding entity to list.
			if (data.get(1).getValue() != null && data.get(1).getValue().length() > 0) {

				BloombergXchangeRateEntity bloombergXchangeRate = new BloombergXchangeRateEntity();							
                 
				String fxPricingSource = "N.A.";
				if (data.get(14).getValue() != null && data.get(14).getValue().length() > 0) {
					fxPricingSource = data.get(14).getValue();
				} else {
					LOG.warn("##### fxPricingSource is null for  = {} " + data.get(1).getValue());
				}

				bloombergXchangeRate.setFxPricingSource(fxPricingSource);
				if (instrumentData.getInstrument().getYellowkey().equals(MarketSector.COMDTY))
					bloombergXchangeRate.setTicker(data.get(1).getValue()+" Comdty");
				else if (instrumentData.getInstrument().getYellowkey().equals(MarketSector.EQUITY))
					bloombergXchangeRate.setTicker(instrumentData.getInstrument().getId()+" Equity");
				else
					bloombergXchangeRate.setTicker(data.get(1).getValue());
				
				bloombergXchangeRate.setLastUpdateDt(isValidDate(data.get(11).getValue()));
				bloombergXchangeRate.setDate(formatDatetime.parse(formatDatetime.format(new Date())));
 
				bloombergXchangeRate.setRateName(data.get(0).getValue());
				bloombergXchangeRate.setIdbbGlobal(data.get(2).getValue());
				bloombergXchangeRate.setSecurityTyp(data.get(3).getValue());
				bloombergXchangeRate.setPxMid(data.get(4).getValue());
				bloombergXchangeRate.setPxLast(data.get(5).getValue());
				bloombergXchangeRate.setPxAsk(data.get(6).getValue());
				bloombergXchangeRate.setPxBid(data.get(7).getValue());
				bloombergXchangeRate.setPxHigh(data.get(8).getValue());
				bloombergXchangeRate.setPxLow(data.get(9).getValue());
				bloombergXchangeRate.setLastUpdate(data.get(10).getValue());
				bloombergXchangeRate.setQuoteFactor(data.get(12).getValue());
				bloombergXchangeRate.setPricingSource(data.get(13).getValue());
				
				 
				if (data.get(15).getValue() != null && data.get(15).getValue().length() > 0) {
					bloombergXchangeRate.setBsTier1CapRatio(data.get(15).getValue());
				} else {
					bloombergXchangeRate.setBsTier1CapRatio("");
				}
				

				LOG.info("##### {}. Adding rates entry to list  : {} ", i, bloombergXchangeRate.toString());
				list.add(bloombergXchangeRate);

			} else {
				LOG.warn("##### {}. Rates Primary values are NULL/EMPTY : {}", i);
			}
		}
		return list;
	}

	/**
	 * 
	 * Method to check whether given dateStr is in valid date format or not. If
	 * not it will return current date.
	 * 
	 * @param dateStr
	 * @return
	 */
	public Date isValidDate(String dateStr) {

		Date dt = null;
		try {
			dt = format.parse(dateStr);

		} catch (ParseException e) {
			LOG.info("##### Date " + dateStr + " is not valid according to " + ((SimpleDateFormat) format).toPattern()
					+ " pattern so updating current date");
			try {
				dt = format.parse(format.format(new Date()));
			} catch (ParseException e1) {
				LOG.error("##### Failed to create new date ", e1.getMessage());
			}
		}
		return dt;

	}

}