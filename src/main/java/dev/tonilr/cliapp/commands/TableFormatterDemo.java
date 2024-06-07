package dev.tonilr.cliapp.commands;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.table.ArrayTableModel;
import org.springframework.shell.table.BorderStyle;
import org.springframework.shell.table.CellMatchers;
import org.springframework.shell.table.TableBuilder;
import org.springframework.shell.table.TableModel;

import dev.tonilr.cliapp.configuration.ShellHelper;

@ShellComponent
public class TableFormatterDemo {

    @Autowired
    ShellHelper shellHelper;
    

} 