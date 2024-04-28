package dev.tonilr.cliapp.commands;

import java.util.Locale;
import org.jline.reader.LineReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

import dev.tonilr.cliapp.configuration.VariablesConfiguration;

@ShellComponent
public class VariablesCommands {

    VariablesConfiguration cliappconfig = new VariablesConfiguration();
	

    @Autowired
    @Lazy
    private LineReader lineReader;

        @ShellMethod(key = {"ChangeLanguage","Changelanguage","changelanguage","changeLanguage"},value ="Displays all the avaible languages to change all the app languague")
    public void ChangeAppLanguage() {
        System.out.println("=============================\r\n" + //
                        "English       [1] \r\n" + //
                        "Italian [2]\r\n" + //
                        "Exit                      [3]\r\n" + //
                        "=============================");   
        

                        String selection = this.lineReader.readLine();
                        switch (selection) {
                            case "1": 
                                System.out.println("English On");
                                cliappconfig.setLang(Locale.ENGLISH);

                            break; 
                            case "2":  
                            System.out.println("Italian On");
                            cliappconfig.setLang(Locale.ITALIAN);

                            break; 
                            default:
                            System.out.println("Exit");
                        }
    
                    }

}
