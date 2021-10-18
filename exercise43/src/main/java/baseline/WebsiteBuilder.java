package baseline;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WebsiteBuilder {
    private String authorName;
    private String websiteName;
    private boolean hasCSS;
    private boolean hasJS;
    Scanner input = new Scanner(System.in);
    //Ask the user for the website name and their author name
    void askForCredentials(){
        System.out.print("What is the name of your site?: ");
        this.websiteName = input.nextLine();
        System.out.print("Who is the author of your site?: ");
        this.authorName = input.nextLine();
        File dir = new File ("./website/"+websiteName);
        dir.mkdirs();
    }

    //Asks for JS Folder, if yes, creates it using Folder creator
    void askForFolderJS(){
        System.out.print("Would you like a JS Folder? Y/N: ");
        String response = input.next();
        if(response.equals("Y")){
            FolderCreator("./website/js/");
            this.hasJS = true;
        }
    }
    //Asks for CSS Folder, if yes, creates it using Folder creator
    void askForCSS(){
        System.out.print("Would you like a CSS Folder? Y/N: ");
        String response = input.next();
        if(response.equals("Y")){
            FolderCreator("./website/css/");
            this.hasCSS = true;
        }
    }
    //Creates the directory
    void FolderCreator(String path){
        File dir = new File(path);
        dir.mkdir();
    }
    //Creates the HTML Document
    void HTMLCreation(){
        try{
            File dir = new File("./website/"+websiteName+"/index.html");
            FileWriter writer = new FileWriter(dir.getPath());
            writer.write("<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "<head>\n" +
                    "<title>"+this.websiteName+"</title>\n" +
                    "</head>\n"+
                    "<head>\n"+"<meta name = \"author\" content=\""+this.authorName+"\">\n"+"" +
                    "</head>\n");
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    void printResults(){
        String currentCheck;
        File dir = new File("./website/"+this.websiteName+"/js");
        File dir2 = new File("./website/"+this.websiteName+"/css");
        System.out.println("Created ./website/"+this.websiteName);
        System.out.println("Created ./website/"+this.websiteName+"/index.html");
        if(hasJS){
            System.out.println("Created ./website/"+this.websiteName+"/js");
        }

        if(hasCSS){
            System.out.println("Created ./website/"+this.websiteName+"/css");
        }
    }
}
