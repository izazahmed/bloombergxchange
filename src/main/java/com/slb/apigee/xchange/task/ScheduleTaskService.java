package com.slb.apigee.xchange.task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TimeZone;
import java.util.concurrent.ScheduledFuture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.support.CronSequenceGenerator;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Service;

import com.slb.apigee.xchange.client.BloombergGetDataService;
import com.slb.apigee.xchange.entity.Currency;
import com.slb.apigee.xchange.service.CurrencyService;

@Service
public class ScheduleTaskService {

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	private static final String EQUITY = "Equity";
	private static final String CMAN = "CMAN";

	@Value("${bloomberg.cman.usernumber}")
	private int usernumber;
	
	@Autowired
	private CurrencyService currencyService;

	@Autowired
	private BloombergGetDataService getDataService;

	// Task Scheduler
	TaskScheduler scheduler;

	// A map for keeping scheduled tasks
	Map<Integer, ScheduledFuture<?>> jobsMap = new HashMap<>();

	public ScheduleTaskService(TaskScheduler scheduler) {
		this.scheduler = scheduler;
	}

	// Schedule Task to be executed every night at 00 or 12 am
	public void addTaskToScheduler(int id, Runnable task, String cronExpression) {
		LOGGER.info("addTaskToScheduler id={}", id);
		String cronExp = cronExpression.substring(0,cronExpression.lastIndexOf("?") + 1);
	    String timezone = cronExpression.substring(cronExpression.lastIndexOf("?") + 1);
	    if(timezone !=null && timezone.length() == 0 )
			timezone = "UTC";
	    LOGGER.info("cronExp={}  timezone={}", cronExp,timezone);
		/*ScheduledFuture<?> scheduledTask = scheduler.schedule(task,
				new CronTrigger(cronExpression, TimeZone.getTimeZone(TimeZone.getDefault().getID())));
		*/
		ScheduledFuture<?> scheduledTask = scheduler.schedule(task,
				new CronTrigger(cronExp.trim(),  TimeZone.getTimeZone(timezone.trim())));
		
		jobsMap.put(id, scheduledTask);
	}

	// Remove scheduled task
	public void removeTaskFromScheduler(int id) {
		LOGGER.info("removeTaskFromScheduler id={}", id);
		ScheduledFuture<?> scheduledTask = jobsMap.get(id);
		if (scheduledTask != null) {
			scheduledTask.cancel(true);
			jobsMap.put(id, null);
		}
	}

	// Remove scheduled task
	public void removeAllTaskFromSchedule() {
		for (Entry<Integer, ScheduledFuture<?>> entry : jobsMap.entrySet()) {
			LOGGER.info("removeTaskFromScheduler id={}", entry.getKey());
			ScheduledFuture<?> scheduledTask = entry.getValue();
			if (scheduledTask != null) {
				scheduledTask.cancel(true);
				jobsMap.put(entry.getKey(), null);
			}
		}
	}

	private Runnable createRunnable(final Entry<String, List<Currency>> entry) {

		Runnable aRunnable = new Runnable() {
			public void run() {
				LOGGER.info("##### Task executing for cron job: {} with tickers size: {}", entry.getKey(),
						entry.getValue().size());
				List<Currency> currencyList = entry.getValue();


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
			}
		};

		return aRunnable;

	}

	// A context refresh event listener
	// Get all tasks from ELK and reschedule them in case of context
	// restarted
	@EventListener({ ContextRefreshedEvent.class })
	public void contextRefreshedEvent() {
		LOGGER.info("##### contextRefreshedEvent... updating scheduler tasks based on tikcers....");
		try {
			Map<String, List<Currency>> currencyMap = new HashMap<String, List<Currency>>();
			// currencyService.getCurrencyGroupByCronExpression();
			List<Currency> currencies = currencyService.getAll();
			for (Currency currency : currencies) {
				if (currency.getCronexpressions() == null) {
					LOGGER.info("##### CURRENCY :: {}", currency.toString());
				}
				for (String cronExpression : currency.getCronexpressions()) {
					if (currencyMap.containsKey(cronExpression)) {
						currencyMap.get(cronExpression).add(currency);
					} else {
						LOGGER.info("##### Cron Expression :: {}", cronExpression);
						String cronExp = cronExpression.substring(0,cronExpression.lastIndexOf("?") + 1).trim();
 					    
						//Validate CRON expression 
						if (!CronSequenceGenerator.isValidExpression(cronExp)) {
							LOGGER.error("Invalid cron expression for={} , cronExp ={}" + currency.toString(),cronExp);
							continue;
						}
						List<Currency> list = new ArrayList<Currency>();
						list.add(currency);

						currencyMap.put(cronExpression, list);
					}
				}

			}

			int id = 6666; // Some number to start ID
			for (Entry<String, List<Currency>> entry : currencyMap.entrySet()) {

				Runnable runnable = createRunnable(entry);
				LOGGER.info("##### Creating scheduler job for id:{} , cron: {} Currency List count: {}", id,
						entry.getKey(), entry.getValue().size());
				this.addTaskToScheduler(id++, runnable, entry.getKey());

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}