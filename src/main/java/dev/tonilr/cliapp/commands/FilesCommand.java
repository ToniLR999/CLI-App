package dev.tonilr.cliapp.commands;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class FilesCommand {
    
    @ShellMethod(key = {"DisplayDir","Displaydir","displayDir","displaydir"},value ="Displays all the files of the dir you indicate *Note: Use /*")
    public void listFilesUsingFilesList(@ShellOption({"-N", "--url"}) String url)  throws IOException {

    //Creating a File object for directory
      File directoryPath = new File(url);
      //List of all files and directories
      String contents[] = directoryPath.list();
      System.out.println("List of files and directories in the specified directory:");
      for(int i=0; i<contents.length; i++) {
         System.out.println(contents[i]);

    }
}

    @ShellMethod(key = {"MoveFile","Movefile","moveFile","movefile"},value ="Move a file to a target url *Note: Use /*")
    public void moveFiles(@ShellOption({"-N", "--fromUrl"}) String fromUrl,@ShellOption({"-N", "--targetUrl"}) String targetUrl)  throws IOException {
        Integer finalpath = fromUrl.lastIndexOf("/");
      Path temp = Files.move(Paths.get(fromUrl),Paths.get(targetUrl+""+fromUrl.substring(finalpath, fromUrl.length())));

      if(temp != null)
      {
          System.out.println("File moved successfully");
      }
      else
      {
          System.out.println("Failed to move the file");
      }
    }


}
