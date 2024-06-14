package dev.tonilr.cliapp.client;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;

import dev.tonilr.cliapp.records.CurrencyApiResponse;

public interface CurrencyApiClient {

    

    @GetExchange("/api/currency.php")
    CurrencyApiResponse CurrencyApi(@RequestParam String api_key,@RequestParam String from,@RequestParam String to,@RequestParam double amount);

}
