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

    @ShellMethod(key = {"MoveFile","Movefile","moveFile","movefile"},value ="Move a file or a folder to a target url *Note: Use /*")
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

    @ShellMethod(key = {"DeleteFile","Deletefile","deleteFile","deletefile"},value ="Delete a file or a folder to a target url *Note: Use /*")
    public void deleteFile(@ShellOption({"-N", "--fromUrl"}) String Url) throws IOException {
            File fileToDelete = new File(Url);

            boolean success = fileToDelete.delete();

            if (success) {
                System.out.println("Folder or file deleted successfully");
            }else{
                System.out.println("Error on deleting the file or folder");

            }
    }

    @ShellMethod(key = {"UpdateFile","updatefile","updateFile","updatefile"},value ="Update a file or a folder name *Note: Use /*")
    public void updateFile(@ShellOption({"-N", "--Url"}) String Url,@ShellOption({"-N", "--NewFileName"}) String NewFileName) throws IOException {
        Integer finalpath = Url.lastIndexOf("/");
        Path temp = Files.move(Paths.get(Url),Paths.get(Url.substring(0,finalpath)+"/"+NewFileName));

        System.out.println(Url.substring(0,finalpath)+"/"+NewFileName);
        if(temp != null)
        {
            System.out.println("File updated successfully");
        }
        else
        {
            System.out.println("Failed to update the file");
        }
  }

  @ShellMethod(key = {"createFile","createfile","createFile","createfile"},value ="Create a file or a folder name *Note: Use /*")
  public void createFile(@ShellOption({"-N", "--Url"}) String Url) throws IOException {
    Path newFilePath = Paths.get(Url);
    Path temp = Files.createFile(newFilePath);

    if(temp != null)
    {
        System.out.println("File created successfully");
    }
    else
    {
        System.out.println("Failed to created the file");
    }

    }
}
