	package dev.tonilr.cliapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

import dev.tonilr.cliapp.client.DadJokeClient;

@SpringBootApplication
public class CliappApplication {

	public static void main(String[] args) {
		SpringApplication.run(CliappApplication.class, args);
	}

	@Bean
	DadJokeClient dadJokeClient(){
		WebClient client = WebClient.builder().baseUrl("https://icanhazdadjoke.com").defaultHeader("Accept", "application/json").build();


	HttpServiceProxyFactory factory = HttpServiceProxyFactory.builder(WebClientAdapter.forClient(client)).build();
			return factory.createClient(DadJokeClient.class);
	}
}
