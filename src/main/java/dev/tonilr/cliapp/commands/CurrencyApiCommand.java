package dev.tonilr.cliapp.commands;

import org.springframework.shell.standard.ShellMethod;

import dev.tonilr.cliapp.client.CurrencyApiClient;
import dev.tonilr.cliapp.configuration.VariablesConfiguration;
import dev.tonilr.cliapp.records.CurrencyApiResponse;

public class CurrencyApiCommand {
    VariablesConfiguration cliappconfig = new VariablesConfiguration();

    //String final shellmethodValue = "I will say a random dad joke";
    private final CurrencyApiClient currencyApiClient;

    public CurrencyApiCommand(CurrencyApiClient CurrencyApiClient){
        this.currencyApiClient = CurrencyApiClient;
    }
   
    @ShellMethod(key = {"ConvertCurrency","convertcurrency","Convertcurrency","convertCurrency"},value = "I will convert an amount from a currency to another")
    public Double getCurrencyConversion(){
        CurrencyApiResponse conversion = currencyApiClient.CurrencyApi();

        return conversion.amount();
    }
}
