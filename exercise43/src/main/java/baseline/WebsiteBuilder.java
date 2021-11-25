package baseline;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WebsiteBuilder {
    private String s = "./website/";
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
        File dir = new File (s +websiteName);
        dir.mkdirs();
    }

    //Asks for JS Folder, if yes, creates it using Folder creator
    void askForFolderJS(){
        System.out.print("Would you like a JS Folder? Y/N: ");
        String response = input.next();
        if(response.equals("Y")){
            folderCreator("./website/js/");
            this.hasJS = true;
        }
    }
    //Asks for CSS Folder, if yes, creates it using Folder creator
    void askForCSS(){
        System.out.print("Would you like a CSS Folder? Y/N: ");
        String response = input.next();
        if(response.equals("Y")){
            folderCreator("./website/css/");
            this.hasCSS = true;
        }
    }
    //Creates the directory
    public  void folderCreator(String path){
        File dir = new File(path);
        dir.mkdir();
    }
    //Creates the HTML Document
    void htmlcreation(){
        try{
            File dir = new File(s+websiteName+"/index.html");
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
        System.out.println("Created"+s+this.websiteName);
        System.out.println("Created"+s+this.websiteName+"/index.html");
        if(hasJS){
            System.out.println("Created"+s+this.websiteName+"/js");
        }

        if(hasCSS){
            System.out.println("Created"+s+this.websiteName+"/css");
        }
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setWebsiteName(String websiteName) {
        this.websiteName = websiteName;
    }
}
