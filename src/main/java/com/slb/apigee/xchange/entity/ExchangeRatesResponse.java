package com.slb.apigee.xchange.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExchangeRatesResponse {

  private List<BloombergXchangeRate> exchangeRates;
  private Integer pageNum;
  private Integer totalPages;

}
