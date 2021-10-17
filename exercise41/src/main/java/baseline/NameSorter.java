package baseline;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NameSorter {
    //Declare Name List
    private ArrayList<String> Names;

    //Read the File and return the Name List
    ArrayList<String> readNames(String fileName){
        ArrayList<String> temp = new ArrayList<String>();
        File inputFile = new File(fileName);
        try {
            Scanner inputReader = new Scanner(inputFile);
            while(inputReader.hasNextLine()){
                String tempName = inputReader.nextLine();
                temp.add(tempName);
            }
        }catch (FileNotFoundException e){
            System.out.println("No File found");
            e.printStackTrace();
        }
        this.Names = temp;
        return temp;
    }

    //Sort the names in the List
    void sortNames(){

        Collections.sort(this.Names);
    }

    void printNames(){
        System.out.printf("Total of %d names\n-----------------\n",this.Names.size());
        for (String name:Names) {
            System.out.println(name);
        }
        System.out.println();
    }


    //Write the Names to a file
    void writeNames(String fileName){

        try{
            File output = new File(fileName);
            if(output.createNewFile()){
                System.out.println("File has been created");
            }
        }catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("The number of people are "+this.Names.size()+"\n-----------------\n");
            for (String name:this.Names) {
                writer.write(name+"\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
