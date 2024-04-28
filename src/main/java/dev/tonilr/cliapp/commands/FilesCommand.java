package dev.tonilr.cliapp.commands;

import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

import dev.tonilr.cliapp.configuration.VariablesConfiguration;

@ShellComponent
public class FilesCommand {
        VariablesConfiguration cliappconfig = new VariablesConfiguration();
    
    @ShellMethod(key = {"DisplayDir","Displaydir","displayDir","displaydir"},value ="hello")
    public void listFilesUsingFilesList(String[] args) {
        String path = String.join(" ", args);
        System.out.println(args.length);

    }

}
