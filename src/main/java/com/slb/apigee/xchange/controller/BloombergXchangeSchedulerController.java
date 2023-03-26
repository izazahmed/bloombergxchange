package com.slb.apigee.xchange.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.slb.apigee.xchange.client.BloombergGetDataService;
import com.slb.apigee.xchange.client.BloombergGetHistoryService;
import com.slb.apigee.xchange.entity.Currency;
import com.slb.apigee.xchange.service.CurrencyService;
import com.slb.apigee.xchange.task.ScheduleTaskService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;

@Api
@RestController
@RequestMapping
// @Validated
public class BloombergXchangeSchedulerController {

	private static final String EQUITY = "Equity";

	private static final String CMAN = "CMAN";

	private static final String MM_DD_YYYY = "MM/dd/yyyy";

	private static final Logger LOG = LoggerFactory.getLogger(BloombergXchangeSchedulerController.class);

	@Value("${bloomberg.cman.usernumber}")
	private int usernumber;
	
	@Autowired
	private BloombergGetDataService getDataService;

	@Autowired
	private BloombergGetHistoryService bloombergGetHistoryService;
	
	@Autowired
	private ScheduleTaskService  scheduleTaskService;
	
	@Autowired
	private CurrencyService currencyService;

	/**
	 * REST api to pull all currencies exchange rates from Bloomberg and update
	 * in database.
	 * 
	 * Usually this action is Scheduled daily but can use this api to invoke
	 * manually
	 * 
	 * @return
	 * @throws Exception
	 */
	@GetMapping(path = { "/update" })
	public ResponseEntity<String> getDailyExchangeRates() throws Exception {
		
		List<Currency> currencyList = currencyService.getAll();
		 
		List<Currency> NormalList = new ArrayList<Currency>();
	    List<Currency> CMANList = new ArrayList<Currency>();
	    List<Currency> EquityList = new ArrayList<Currency>();
	    // get size of the list
	    int size = currencyList.size();
	    // process each element of the list and find out the type of currency
	    for (int i = 0; i < size; i++)
	    {
	    	Currency currency = currencyList.get(i);
	        if (currency.getCurrency().contains(CMAN)  	)
	        	CMANList.add(currencyList.get(i));
	        else if(currency.getCurrency().contains(EQUITY))
	        	EquityList.add(currencyList.get(i));
	    	else
	        	NormalList.add(currencyList.get(i));
	    }
		
		try {
			
			if(NormalList.size() > 0)
				getDataService.execute(NormalList,null,"Ticker");
			
			if(CMANList.size()>0)
				getDataService.execute(CMANList,usernumber,CMAN);
			
			if(EquityList.size()>0)
				getDataService.execute(EquityList,usernumber,EQUITY);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		//getDataService.execute(currencyList);

		return new ResponseEntity<>("OPERATION EXECUTED SUCCESSFULLY", HttpStatus.OK);
	}
	
	@GetMapping(path = { "/updateSchedulerJobs" })
	public ResponseEntity<String> updateSchedulerJobs() throws Exception {
		
		//Remove all the scheduler jobs
		scheduleTaskService.removeAllTaskFromSchedule();
		
		//Re-create all the scheduler jobs
		scheduleTaskService.contextRefreshedEvent();
		
		return new ResponseEntity<>("OPERATION EXECUTED SUCCESSFULLY", HttpStatus.OK);
	}

	@GetMapping(path = { "/getHistoricalDataByTickerSymbols" })
	public ResponseEntity<String> getHistoricalDataByTickerSymbols(
			@RequestParam(value = "ticker-symbol", required = false) List<String> tickerSymbol,
			@RequestParam(value = "from-date", required = true) @ApiParam(value = MM_DD_YYYY) @DateTimeFormat(pattern = MM_DD_YYYY) final Date fromDate,
			@RequestParam(value = "to-date", required = true) @ApiParam(value = MM_DD_YYYY) @DateTimeFormat(pattern = MM_DD_YYYY) final Date toDate,
			@RequestParam(value = "source-data-date", required = true) @ApiParam(value = "yyyy-MM-dd") @DateTimeFormat(pattern = "yyyy-MM-dd") final Date sourceDataDate

	) throws Exception {
		LOG.info("##### Getting historical Rates for tickers [ {} ], form:{}  to:{}  sourceDataDate:{} ", tickerSymbol, fromDate, toDate,sourceDataDate);

		ExecutorService executor = Executors.newSingleThreadExecutor();
		executor.submit(() -> {

			try {
				LOG.info("##### Invoking REST api to update HistoricalData exchange rates");
				bloombergGetHistoryService.executeHistoricalRates(tickerSymbol, fromDate, toDate,sourceDataDate);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		return new ResponseEntity<>("OPERATION EXECUTED SUCCESSFULLY", HttpStatus.OK);
	}

	@GetMapping(path = { "/getHistoricalDataForAllCurrencies" })
	public ResponseEntity<String> getHistoricalDataForAllCurrencies(
			@RequestParam(value = "no-of-currencies-per-cycle", defaultValue = "100", required = false) int currencyPerCycle,
			@RequestParam(value = "from-date", required = true) @ApiParam(value = MM_DD_YYYY) @DateTimeFormat(pattern = MM_DD_YYYY) final Date fromDate,
			@RequestParam(value = "to-date", required = true) @ApiParam(value = MM_DD_YYYY) @DateTimeFormat(pattern = MM_DD_YYYY) final Date toDate,
			@RequestParam(value = "source-data-date", required = true) @ApiParam(value = "yyyy-MM-dd") @DateTimeFormat(pattern = "yyyy-MM-dd") final Date sourceDataDate

	) throws Exception {
		LOG.info("##### Getting historical Rates for  [ {} ] ticker each time, form {} to {}  sourceDataDate {} ", currencyPerCycle,
				fromDate, toDate,sourceDataDate);

		ExecutorService executor = Executors.newSingleThreadExecutor();
		executor.submit(() -> {

			try {
				LOG.info("##### Invoking REST api to update HistoricalData exchange rates");
				bloombergGetHistoryService.fetchHistoricalData(fromDate, toDate, sourceDataDate, currencyPerCycle);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		return new ResponseEntity<>("OPERATION EXECUTED SUCCESSFULLY", HttpStatus.OK);
	}

	@GetMapping(path = "/healthcheck")
	public final ResponseEntity<String> healthcheck() {
		return new ResponseEntity<>("UP", HttpStatus.OK);
	}

}
