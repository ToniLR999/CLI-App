package dev.tonilr.cliapp.commands;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class HelloComand {
    
    @ShellMethod(key = "hello",value ="I will say hello")
    public String hello(@ShellOption(defaultValue = "World") String arg){
        return "Hello "+arg;
    }

    @ShellMethod(key = "goodbye",value ="I will say goodbye")
    public String goodbye(@ShellOption(defaultValue = "World") String arg){
        return "Goodbye "+arg;
    }

}
