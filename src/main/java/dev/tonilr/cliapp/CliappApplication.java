	package dev.tonilr.cliapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

import dev.tonilr.cliapp.client.CurrencyApiClient;
import dev.tonilr.cliapp.client.DadJokeClient;

@SpringBootApplication
public class CliappApplication{

	
	public static void main(String[] args) {
		
    ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
    messageSource.setBasenames("lang/messages");
    messageSource.setDefaultEncoding("UTF-8");
    //System.out.println(messageSource.getMessage("hello", null, Locale.ITALIAN));
	//System.out.println(messageSource.getMessage("hello", null, cliappconfig.getLang()));
	//System.out.println(cliappconfig.getLang());


	
		SpringApplication.run(CliappApplication.class, args);
	}

	@Bean
	DadJokeClient dadJokeClient(){
		WebClient client = WebClient.builder().baseUrl("https://icanhazdadjoke.com").defaultHeader("Accept", "application/json").build();


	HttpServiceProxyFactory factory = HttpServiceProxyFactory.builder(WebClientAdapter.forClient(client)).build();
			return factory.createClient(DadJokeClient.class);
	}

	@Bean
	CurrencyApiClient currencyApiClient(){
		WebClient client = WebClient.builder().baseUrl("https://www.amdoren.com").defaultHeader("Accept", "application/json").build();
 

	HttpServiceProxyFactory factory = HttpServiceProxyFactory.builder(WebClientAdapter.forClient(client)).build();
			return factory.createClient(CurrencyApiClient.class);
	}
}
