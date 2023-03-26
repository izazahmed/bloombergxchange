package com.slb.apigee.xchange.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slb.apigee.xchange.entity.BloombergXchangeRateEntity;
import com.slb.apigee.xchange.repository.XChangeRatesRepository;

@Service
public class XChangeRatesService {
 
	@Autowired
	private XChangeRatesRepository xchangeRatesRepository;
	
	public boolean pingELK() throws IOException {
		return xchangeRatesRepository.pingELK();
	}

	public void bulkPushtoELK(List<BloombergXchangeRateEntity> elasticDataList)
			throws IOException, InterruptedException {
		xchangeRatesRepository.bulkPushtoELK(elasticDataList);
	}

}
