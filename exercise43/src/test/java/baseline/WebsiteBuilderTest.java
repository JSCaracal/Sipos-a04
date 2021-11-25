package baseline;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class WebsiteBuilderTest {
    WebsiteBuilder webBuilder = new WebsiteBuilder();
    @Test
    void folderCreator() {
        File test = new File("./src/test/resources/testfolder");
        webBuilder.folderCreator("./src/test/resources/testfolder");
        boolean results = test.exists();
        assertEquals(true,results);

    }
    

    static void removeFiles(File file){
        for (File subfile : file.listFiles()) {
            if (subfile.isDirectory()) {
                removeFiles(subfile);
            }
            subfile.delete();
        }
    }
    @AfterAll
   static void remove(){
        File file = new File("./src/test/resources/testfolder");
        removeFiles(file);
        File html = new File("./src/test/resources/website/testSite/index.html");
    }
}