package com.slb.apigee.xchange.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.aggregations.bucket.terms.Terms;
import org.elasticsearch.search.aggregations.bucket.terms.TermsAggregationBuilder;
import org.elasticsearch.search.aggregations.metrics.tophits.ParsedTopHits;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.slb.apigee.xchange.entity.Currency;

@Repository
public class CurrencyRepository {

	private static final Logger LOGGER = LoggerFactory.getLogger(CurrencyRepository.class);

	private RestHighLevelClient client;

	private ObjectMapper objectMapper;

	@Value("${elasticsearch.currency.index.name}")
	private String INDEX;
	
	private static final String TYPE = "_doc";

	public CurrencyRepository(ObjectMapper objectMapper, RestHighLevelClient restHighLevelClient) {
		this.objectMapper = objectMapper;
		this.client = restHighLevelClient;
	}

	public List<Currency> search(String currency) throws Exception {
		SearchRequest searchRequest = buildSearchRequest(INDEX, TYPE);
		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
		if (currency != null) {
			if (currency.contains("*"))
				searchSourceBuilder.query(QueryBuilders.wildcardQuery("currency.keyword", currency)).size(10000);
			else
				searchSourceBuilder.query(QueryBuilders.matchQuery("currency", currency)).size(10000);
			;
		} else
			searchSourceBuilder.query(QueryBuilders.matchAllQuery()).size(10000);
		searchRequest.source(searchSourceBuilder);

		SearchResponse searchResponse = client.search(searchRequest, RequestOptions.DEFAULT);
		return getSearchResult(searchResponse);
	}

	private SearchRequest buildSearchRequest(String index, String type) {
		SearchRequest searchRequest = new SearchRequest();
		searchRequest.indices(index);
		searchRequest.types(type);
		return searchRequest;
	}

	private List<Currency> getSearchResult(SearchResponse response) {
		SearchHit[] searchHit = response.getHits().getHits();
		List<Currency> list = new ArrayList<>();
		for (SearchHit hit : searchHit) {
			list.add(objectMapper.convertValue(hit.getSourceAsMap(), Currency.class));
		}
		return list;
	}

	/*GET bloomberg_currencies/_search?size=0
	{
	  "aggs": {
	    "group_by_cron_expression": {
	      "terms": {
	        "field": "cronexpression.keyword",
	        "size": 10
	      },
	      "aggs": {
	        "top_currency_hits": {
	          "top_hits": {
	            "_source": {
	              "includes": [ "currency" ]
	            },
	            "size": 1000
	          }
	        }
	      }
	    }
	  }
	}*/

	/**
	 * Method to get the tickers/currencies from Elastic search , group by 
	 * cron expression string. 
	 * 
	 * @return Map<String, List<Currency>>
	 * @throws Exception
	 */
	public Map<String, List<Currency>>  getCurrencyGroupByCronExpression() throws Exception {
		Map<String, List<Currency>> currencyMap = new HashMap<String, List<Currency>>();		 

		SearchRequest searchRequest = buildSearchRequest(INDEX, TYPE);

		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
		searchSourceBuilder.from(0);
		searchSourceBuilder.size(0);

		TermsAggregationBuilder termsAggregationBuilder = AggregationBuilders.terms("group_by_cron_expression")
				.field("cronexpression.keyword").size(100);
		termsAggregationBuilder.subAggregation(AggregationBuilders.topHits("top_currency_hits").size(10000)
				.fetchSource(new String[] { "currency" }, null));
		searchSourceBuilder.aggregation(termsAggregationBuilder);
		searchRequest.source(searchSourceBuilder);

		SearchResponse searchResponse = client.search(searchRequest, RequestOptions.DEFAULT);
		
		if (searchResponse.getAggregations() != null) {
			Terms agg = searchResponse.getAggregations().get("group_by_cron_expression");

			for (Terms.Bucket bucket : agg.getBuckets()) {
				List<Currency> currencyList = new ArrayList<Currency>();
				
				ParsedTopHits parsedTopHits = bucket.getAggregations().get("top_currency_hits");
				 for (SearchHit hit : parsedTopHits.getHits().getHits()) {
					 Map<String, Object> sourceAsMap = hit.getSourceAsMap(); 	
					 Currency currency = new Currency();
					 currency.setCurrency(String.valueOf(sourceAsMap.get("currency")));
					 currency.setCurrency(String.valueOf(sourceAsMap.get("cronexpressions")));					 
					 currencyList.add(new Currency());
				 }
				 currencyMap.put(bucket.getKeyAsString(), currencyList);
			}
		}
		return currencyMap;		 
	}
}
