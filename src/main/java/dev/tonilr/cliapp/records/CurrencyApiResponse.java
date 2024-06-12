package dev.tonilr.cliapp.records;

public record CurrencyApiResponse(String api_key, String fromCurrency, String toCurrency, Double amount) {

}
