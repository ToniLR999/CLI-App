package dev.tonilr.cliapp.commands;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import dev.tonilr.cliapp.configuration.ShellHelper;

@ShellComponent
public class TableFormatterDemo {

    @Autowired
    ShellHelper shellHelper;
    

} 