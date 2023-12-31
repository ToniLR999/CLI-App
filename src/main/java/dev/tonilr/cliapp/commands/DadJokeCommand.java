package dev.tonilr.cliapp.commands;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

import dev.tonilr.cliapp.client.DadJokeClient;
import dev.tonilr.cliapp.records.DadJokeResponse;

@ShellComponent
public class DadJokeCommand {
    
    private final DadJokeClient dadJokeClient;

    public DadJokeCommand(DadJokeClient dadJokeClient){
        this.dadJokeClient = dadJokeClient;
    }
   
    @ShellMethod(key = "RandomJoke",value ="I will say a random dad joke")
    public String getRandomDadJoke(){
        DadJokeResponse random = dadJokeClient.RandomDadJoke();

        return random.joke();
    }

} 