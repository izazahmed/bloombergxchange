package com.slb.apigee.xchange;

import java.io.File;
import java.text.SimpleDateFormat;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.slb.apigee.xchange.client.BloombergGetHistoryService;

@SpringBootApplication
@EnableScheduling
@ComponentScan("com.slb")
public class BloombergXchangeSchedulerApplication {
	private static final Logger LOG = LoggerFactory.getLogger(BloombergXchangeSchedulerApplication.class);

	public static String WSDL_LOCATION = "";
	public static String P12FILEPATH = "";
	public static String P12PWD = "";

	@Value("${wsdl.location}")
	private String wsdlLocation;

	@Value("${p12.file.path}")
	private String p12FilePath;

	@Value("${p12.pwd}")
	private String p12Pwd;

	@Autowired
	private BloombergGetHistoryService bloombergGetHistoryService;

	

	@PostConstruct
	private void init() {
		try {

			String cwd = new File("").getAbsolutePath();
			WSDL_LOCATION = "file:///" + cwd + wsdlLocation;

			LOG.info("##### WSDL file Location : " + WSDL_LOCATION);

			P12FILEPATH = p12FilePath;
			P12PWD = p12Pwd;

			/* one time execute logic to get historical data */
			
			 
			/*SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
			bloombergGetHistoryService.fetchHistoricalData(formatter.parse("01/01/2017"),
					formatter.parse("04/06/2020"),50);*/
			
			/* end of one time logic invocation */

		} catch (Exception e) {
			LOG.error("Exception on initialize " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	 
	
	 

	

	public static void main(String[] args) {
		SpringApplication.run(BloombergXchangeSchedulerApplication.class, args);
	}

}