package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
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

    }

    void printNames(){
        System.out.println(Names.get(0));
    }


    //Write the Names to a file
    void writeNames(String fileName){

    }
}
