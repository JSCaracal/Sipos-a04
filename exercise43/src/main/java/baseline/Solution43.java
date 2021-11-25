package baseline;

public class Solution43 {
    public static void main(String[] args) {
        WebsiteBuilder builder = new WebsiteBuilder();
        builder.askForCredentials();
        builder.askForFolderJS();
        builder.askForCSS();
        builder.htmlcreation();
        builder.printResults();

    }
}
