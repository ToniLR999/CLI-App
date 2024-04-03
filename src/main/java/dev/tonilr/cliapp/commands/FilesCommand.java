package dev.tonilr.cliapp.commands;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class FilesCommand {
    
    @ShellMethod(key = {"DisplayDir","Displaydir","displayDir","displaydir"},value ="Displays all the files of the dir you indicate")
    public void listFilesUsingFilesList(String[] args) {
        String path = String.join(" ", args);
        System.out.println(args.length);

        /*if (!(dir.startsWith("\"") && dir.endsWith("\""))) {
            // Si contiene espacios y no está rodeada por comillas, añadir comillas al principio y al final
            dir = "\"" + dir + "\"";
            System.out.println("Entro en el If 1");
        }    

        System.out.println(dir);

        try (Stream<Path> stream = Files.list(Paths.get(dir))) {
         
            return stream
            .filter(file -> !Files.isDirectory(file))
            .map(Path::getFileName)
            .map(Path::toString)
            .collect(Collectors.toSet());
        }*/
    }

}
