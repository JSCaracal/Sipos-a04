package baseline;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCounter {
    Map<String, Integer> wordStorage;

    public ArrayList<String> getWordList() {
        return wordList;
    }

    ArrayList<String>wordList;
    public WordCounter(){
        wordStorage = new HashMap<>();
        wordList = new ArrayList<>();
    }

    //Read File
    public void fileReader(){
        File file = new File("./data/exercise46_input.txt");
        //Use Scanner to read Line by line
        try {
            Scanner lineReader = new Scanner(file);
            Scanner wordReader = null;
            //User another scanner to read word by word
            while (lineReader.hasNextLine()){
                String line = lineReader.nextLine();
                String[] words = line.split(" ");
                for(String word:words){
                    if(!wordStorage.containsKey(word)){
                        wordStorage.put(word,1);
                        wordList.add(word);
                    }
                    else{
                       Integer count = wordStorage.get(word);
                       count++;
                       wordStorage.remove(word);
                       wordStorage.put(word,count);
                    }
                }
            }
            //If word does not exist, add it to the map, else find the value and add plus one
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    //Print the data to the screen
    public void sortData(){
            //Sort by Highest to lowest
        Map<String,Integer>sorted = new HashMap<>();
        int highest = 0;
        String highestWord = "";
        for(String word:this.wordList){
            if(this.wordStorage.get(word) > highest){
                highestWord = word;
                highest = this.wordStorage.get(word);
            }
        }
        System.out.print(highestWord+": ");
        for(int i = 0; i < highest;i++){
            System.out.print("*");
        }
        System.out.println("");
        wordList.remove(highestWord);
        highest = 0;
        highestWord = "";

        for(String word:this.wordList){
            if(this.wordStorage.get(word) > highest){
                highestWord = word;
                highest = this.wordStorage.get(word);
            }
        }
        System.out.print(highestWord+": ");
        for(int i = 0; i < highest;i++){
            System.out.print("*");
        }
        System.out.println("");
        wordList.remove(highestWord);
        highest = 0;
        highestWord = "";
        wordList.remove(highestWord);
        for(String word:this.wordList){
            if(this.wordStorage.get(word) > highest){
                highestWord = word;
                highest = this.wordStorage.get(word);
            }
        }
        System.out.print(highestWord+": ");
        for(int i = 0; i < highest;i++){
            System.out.print("*");
        }

    }
    public Map<String, Integer> getWordStorage() {
        return wordStorage;
    }

    public void setWordStorage(Map<String, Integer> wordStorage) {
        this.wordStorage = wordStorage;
    }
}

