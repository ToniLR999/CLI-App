package dev.tonilr.cliapp.client;

import org.springframework.web.service.annotation.GetExchange;

import dev.tonilr.cliapp.records.DadJokeResponse;

public interface DadJokeClient {
    
    @GetExchange("/")
    DadJokeResponse RandomDadJoke();
}
