package baseline;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {
    private ArrayList<Products> invenList;
    final Scanner input = new Scanner(System.in);
    public Inventory(){
        this.invenList = new ArrayList<>();
    }
    //Reads Json file
    public void readJson() {
        //Read file from Directory
        try {
            File file = new File("./data/exercise44_input.json");
            //fix up the json string so it can be read
            StringBuilder sb = new StringBuilder();
            Scanner jsonFixer = new Scanner(file);
            while(jsonFixer.hasNextLine()){
                sb.append(jsonFixer.nextLine());
            }
            sb.delete(0,15);
            sb.delete(sb.length()-1,sb.length());
            //Gson reader
            Gson gson = new Gson();
            jsonFixer.close();
            invenList = gson.fromJson(sb.toString(),new TypeToken<ArrayList<Products>>(){}.getType());
                    }catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }
    //Search for product
    public Products isInInventory(String name){
        //Loop through until name is found, if it is, return item
        for(Products item:invenList){
            if(item.getName().equals(name)){
                return item;
            }
        }
        return null;
    }
    //Input handling
    public void mainProgram(){
        do{
            System.out.print("What is the name of the product: ");
            Products item = isInInventory(input.next());
            if(item!= null){
                System.out.println("Name: "+item.getName());
                System.out.println("Price: "+item.getPrice());
                System.out.println("Quantity: "+item.getQuantity());
                break;
            }else {
                System.out.println("Sorry, item was not in our inventory");
            }
        }while (true);
    }

    public ArrayList<Products> getInvenList() {
        return invenList;
    }
}
