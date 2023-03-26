package com.slb.apigee.xchange.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slb.apigee.xchange.entity.Currency;
import com.slb.apigee.xchange.repository.CurrencyRepository;

@Service
public class CurrencyService {
 
	@Autowired
	private CurrencyRepository currencyRepository;

	public List<Currency> findByCurrency(String currency) throws Exception {
		return currencyRepository.search(currency);
	}
	
	public List<Currency> getAll() throws Exception {
		return currencyRepository.search(null);
	}
	
	public Map<String, List<Currency>> getCurrencyGroupByCronExpression() throws Exception {
		return currencyRepository.getCurrencyGroupByCronExpression();
	}
}
