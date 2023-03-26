package com.slb.apigee.xchange.client;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.XMLGregorianCalendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bloomberg.services.datalicense.dlws.ps._20071001.HistData;
import com.bloomberg.services.datalicense.dlws.ps._20071001.HistInstrumentData;
import com.bloomberg.services.datalicense.dlws.ps._20071001.PerSecurityWS;
import com.bloomberg.services.datalicense.dlws.ps._20071001.RetrieveGetHistoryRequest;
import com.bloomberg.services.datalicense.dlws.ps._20071001.RetrieveGetHistoryResponse;
import com.slb.apigee.xchange.entity.BloombergXchangeRate;
import com.slb.apigee.xchange.entity.BloombergXchangeRateEntity;
import com.slb.apigee.xchange.entity.Currency;
import com.slb.apigee.xchange.repository.XChangeRatesRepository;
import com.slb.apigee.xchange.service.CurrencyService;

@Component
public class BloombergGetHistoryService extends BloombergSoapService {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private XChangeRatesRepository xrepo;
	
	@Autowired
	private CurrencyService currencyService;
	
	SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
	
	/**
	 * One time usage method to fetch all the currencies 
	 * data from Bloomberg 
	 * 
	 * @throws Exception
	 * @throws ParseException
	 */
	public void fetchHistoricalData(Date fromDate, Date toDate, Date sourceDataDate, int currencyPerCycle) throws Exception, ParseException {
		List<Currency> currencyList = currencyService.getAll();

		List<String> tickerSymbols = null;

		// finding last page records count
		int remainder = currencyList.size() % currencyPerCycle;
		int finalPage = currencyList.size() - remainder;

		for (int i = 0; i < currencyList.size(); i++) {

			if (i != 0 && i % currencyPerCycle == 0) {
				int j = i - currencyPerCycle;
				LOG.info("##### Processing List " + i + "-----------" + j);

				List<Currency> cList = currencyList.subList(j, i);
				LOG.info("#####-----cList------" + cList);
				tickerSymbols = new ArrayList<String>();
				for (Currency currency : cList) {
					tickerSymbols.add(currency.getCurrency());
				}
				if (tickerSymbols != null && tickerSymbols.size() > 0) {
					this.executeHistoricalRates(tickerSymbols, fromDate, toDate,sourceDataDate);
				}

			} else if (i > finalPage) {
				LOG.info("##### Processing final List " + (i - 1) + "-----------" + currencyList.size());
				List<Currency> cList = currencyList.subList(i - 1, currencyList.size());
				LOG.info("#####-----cList final-----" + cList);
				tickerSymbols = new ArrayList<String>();
				for (Currency currency : cList) {
					tickerSymbols.add(currency.getCurrency());
				}
				if (tickerSymbols != null && tickerSymbols.size() > 0){
					this.executeHistoricalRates(tickerSymbols, fromDate, toDate,sourceDataDate);
				}

				break;
			}

		}

	}

	/**
	 * 
	 * Method to get the provided ticker values for for given date range from
	 * Bloomberg and update the same in ElasticSearch
	 * 
	 * @param tickerSymbolsList
	 * @param fromDate
	 * @param toDate
	 * @throws Exception
	 * 
	 */
	public void executeHistoricalRates(List<String> tickerSymbolsList, Date fromDate, Date toDate, Date sourceDataDate) throws Exception {
	
		List<BloombergXchangeRate> existingBloombergXchangeRateList = xrepo.search(tickerSymbolsList, null, null, null,
				sourceDataDate, null);
		
		LOG.info("##### existingBloombergXchangeRateList .... {}", existingBloombergXchangeRateList);
		 
		if (existingBloombergXchangeRateList != null && existingBloombergXchangeRateList.size() > 0) {

			List<BloombergXchangeRateEntity> historyRatesList = this
					.getHistoricalExchangeRates(existingBloombergXchangeRateList, tickerSymbolsList, fromDate, toDate);

			LOG.info("##### Updating to database with historical Data ....");

			xrepo.bulkPushtoELK(historyRatesList);
		} else {
			LOG.warn("$$$$$ Didn't found ticker details -----------------");
			tickerSymbolsList.forEach(System.out::println);
			LOG.warn("-------------------------------------------------");
		}

	}

	public String submitGetHistoryRequest(BloombergHistoryRequest request) {
		String responseId = null;
		try {
			PerSecurityWS port = getPerSecurityWS();

			port.submitGetHistoryRequest(request.getHeaders(), request.getFields(), request.getInstruments(),
					request.getStatusCode(), request.getRequestId(), request.getResponseId());

			responseId = request.getResponseId().value;
			System.out.println("submitGetHistoryRequest: The response id is " + responseId);
			LOG.info("submitGetHistoryRequest: Response Id: " + responseId);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			LOG.info("submitGetHistoryRequest: Error:" + e.getMessage());

		}
		return responseId;
	}

	/**
	 * Call bloomberg service to get the response
	 * 
	 * @param responseId
	 * @return
	 */
	public RetrieveGetHistoryResponse retrieveGetHistoryResponse(String responseId) {

		RetrieveGetHistoryResponse response = null;
		try {
			PerSecurityWS port = getPerSecurityWS();

			RetrieveGetHistoryRequest request = new RetrieveGetHistoryRequest();
			request.setResponseId(responseId);

			response = port.retrieveGetHistoryResponse(request);

			int responseStatusCode = response.getStatusCode().getCode();
			int maxRetries = 10;
			int retryCount = 0;
			int timeoutMinutes = 10;
			while (responseStatusCode == 100 && retryCount < maxRetries) {
				retryCount++;
				TimeUnit.MINUTES.sleep(timeoutMinutes);
				response = port.retrieveGetHistoryResponse(request);
				System.out.println(response);
				responseStatusCode = response.getStatusCode().getCode();

				if (timeoutMinutes < 3) {
					timeoutMinutes = 2;
				} else {
					timeoutMinutes = timeoutMinutes - 2;
				}
			}
			LOG.info("retrieveGetHistoryResponse: responseId = " + responseId
					+ " response: Instrument Data received size = "
					+ response.getInstrumentDatas().getInstrumentData().size() + " Attempts = " + retryCount);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			LOG.info("retrieveGetHistoryResponse: responseId = " + responseId + " Error: " + e.getMessage());

		}

		return response;
	}

	DateFormat format = new SimpleDateFormat("MM/dd/yyyy");

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

	public List<BloombergXchangeRateEntity> parseRetrieveGetHistoryRequestResponse(
			List<BloombergXchangeRate> existingBloombergXchangeRateList, RetrieveGetHistoryResponse response) {

		List<BloombergXchangeRateEntity> list = new ArrayList<BloombergXchangeRateEntity>();

		List<HistInstrumentData> instrumentDataList = response.getInstrumentDatas().getInstrumentData();
		HistInstrumentData instrumentData = null;

		for (int i = 0; i < instrumentDataList.size(); i++) {

			try {

				instrumentData = instrumentDataList.get(i);
				List<HistData> data = instrumentData.getData();
				BloombergXchangeRate existingBloombergXchangeRate = null;

				String instrumentId = instrumentData.getInstrument().getId();
				// Split ticker and fxpricingsourcecode like 'USDCOP TRM'
				String instrumentIdtickers[] = instrumentId.split(" ");
				String pricingSourCode = "";

				// Find the existing rate object
				for (int j = 0; j < existingBloombergXchangeRateList.size(); j++) {
					BloombergXchangeRate rateObject = existingBloombergXchangeRateList.get(j);

					if (instrumentIdtickers.length == 2) {
						if (instrumentIdtickers[0].equalsIgnoreCase(rateObject.getTicker())
								&& instrumentIdtickers[1].equalsIgnoreCase(rateObject.getPricingSourceCode())) {
							existingBloombergXchangeRate = rateObject;
							pricingSourCode = instrumentIdtickers[1];
							LOG.info("##### existingBloombergXchangeRate, pricingSourCode={}   {} ", pricingSourCode,
									existingBloombergXchangeRate.toString());
							break;
						}
					} else if (instrumentIdtickers.length == 1) {
						if (instrumentIdtickers[0].equalsIgnoreCase(rateObject.getTicker())) {
							existingBloombergXchangeRate = rateObject;
							LOG.info("##### existingBloombergXchangeRate  : {} ",
									existingBloombergXchangeRate.toString());
							break;
						}
					}
				}

				BloombergXchangeRateEntity bloombergXchangeRate = new BloombergXchangeRateEntity();
				// 2020-03-09
				XMLGregorianCalendar xmlGrogerianCalendar = instrumentData.getDate();
				xmlGrogerianCalendar.setTimezone(DatatypeConstants.FIELD_UNDEFINED);

				Date rateDate = xmlGrogerianCalendar.toGregorianCalendar().getTime();

				bloombergXchangeRate.setTicker(existingBloombergXchangeRate.getTicker());
				bloombergXchangeRate.setDate(rateDate);
				bloombergXchangeRate.setLastUpdateDt(rateDate);
				bloombergXchangeRate.setLastUpdate("");
				bloombergXchangeRate.setFxPricingSource(pricingSourCode.length() > 0 ? pricingSourCode
						: existingBloombergXchangeRate.getPricingSourceCode());

				bloombergXchangeRate.setRateName(existingBloombergXchangeRate.getName());
				bloombergXchangeRate.setIdbbGlobal(existingBloombergXchangeRate.getIdBBGlobal());
				bloombergXchangeRate.setSecurityTyp(existingBloombergXchangeRate.getSecurityType());
				bloombergXchangeRate.setPxMid(data.get(0).getValue());
				bloombergXchangeRate.setPxLast(data.get(1).getValue());
				bloombergXchangeRate.setPxAsk(data.get(2).getValue());
				bloombergXchangeRate.setPxBid(data.get(3).getValue());
				bloombergXchangeRate.setPxHigh(data.get(4).getValue());
				bloombergXchangeRate.setPxLow(data.get(5).getValue());

				bloombergXchangeRate.setQuoteFactor(existingBloombergXchangeRate.getQuoteFactor());
				bloombergXchangeRate.setPricingSource(existingBloombergXchangeRate.getPricingSource());

				LOG.info("##### {}. Adding rates entry to list  : {} ", i, bloombergXchangeRate.toString());
				list.add(bloombergXchangeRate);
			} catch (Exception ex) {
				LOG.error("$$$$ Exception for ticker {} ", instrumentData.getInstrument().getId(), ex);
			}
		}
		return list;
	}

	public List<BloombergXchangeRateEntity> getHistoricalExchangeRates(
			List<BloombergXchangeRate> existingBloombergXchangeRateList, List<String> tickerSymbols, Date fromDate,
			Date toDate) {
		BloombergHistoryRequest request = new BloombergHistoryRequest();
		request.setHistoryHeaders(fromDate, toDate);
		request.setFields();
		request.setInstruments(tickerSymbols);

		String responseId = submitGetHistoryRequest(request);
		RetrieveGetHistoryResponse response = retrieveGetHistoryResponse(responseId);
		List<BloombergXchangeRateEntity> bloombergXchangeRates = parseRetrieveGetHistoryRequestResponse(
				existingBloombergXchangeRateList, response);
		return bloombergXchangeRates;

	}
	
	 

}
