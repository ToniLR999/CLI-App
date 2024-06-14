package dev.tonilr.cliapp.commands;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import dev.tonilr.cliapp.client.CurrencyApiClient;
import dev.tonilr.cliapp.configuration.VariablesConfiguration;
import dev.tonilr.cliapp.records.CurrencyApiResponse;

@ShellComponent
public class CurrencyApiCommand {

    private final String api_key = "GfPbVqeMcnRrBJpSpsLgkMPLwy238s";

    VariablesConfiguration cliappconfig = new VariablesConfiguration();

    private final CurrencyApiClient currencyApiClient;

    public CurrencyApiCommand(CurrencyApiClient CurrencyApiClient){
        this.currencyApiClient = CurrencyApiClient;
    }
   
    @ShellMethod(key = {"ConvertCurrency","convertcurrency","Convertcurrency","convertCurrency"},value = "I will convert an amount from a currency to another")
    public Double getCurrencyConversion(@ShellOption({"-N", "--fromCurrency"}) String fromCurrency,@ShellOption({"-N", "--toCurrency"}) String toCurrency,@ShellOption({"-N", "--amount"}) double amount){
        CurrencyApiResponse conversion = currencyApiClient.CurrencyApi(this.api_key,fromCurrency,toCurrency,amount);

        return conversion.amount();
    }
}
