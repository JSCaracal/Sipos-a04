package baseline;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WordFinder {
    private String rawText;

    public WordFinder(){
        //throw new UnsupportedOperationException();
    }

    public void readFile(){
        try {
            //Read File
            File file = new File("./data/exercise45_input.txt");
            this.rawText = new String(Files.readAllBytes(Paths.get(file.toString())));
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void writeFile(String fileName){
        //Give option for file name use replace method
        File file = new File("./data/"+fileName+".txt");
        String newText = rawText.replace("utilize","use");
        try {
            FileWriter writer = new FileWriter(file);
            writer.write(newText);
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public String getRawText() {
        return rawText;
    }
}
