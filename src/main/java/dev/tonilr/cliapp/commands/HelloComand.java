package dev.tonilr.cliapp.commands;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import dev.tonilr.cliapp.configuration.VariablesConfiguration;

@ShellComponent
public class HelloComand {

    VariablesConfiguration cliappconfig = new VariablesConfiguration();

    @ShellMethod(key = "hello",value ="I will say hello")
    public String hello(@ShellOption(defaultValue = "World") String arg){
        return "Hello "+arg;
    }

    @ShellMethod(key = "goodbye",value ="I will say goodbye")
    public void goodbye(@ShellOption(defaultValue = "World") String arg){
        System.out.println("Goodbye "+arg);
        System.exit(0);
        
    }

}
