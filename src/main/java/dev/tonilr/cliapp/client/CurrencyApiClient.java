package dev.tonilr.cliapp.client;

import org.springframework.web.service.annotation.GetExchange;

import dev.tonilr.cliapp.records.CurrencyApiResponse;

public interface CurrencyApiClient {
  @GetExchange("/")
    CurrencyApiResponse CurrencyApi();
}
