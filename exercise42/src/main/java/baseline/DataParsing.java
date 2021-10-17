package baseline;

import javax.imageio.stream.FileImageOutputStream;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DataParsing {
    private String unParsedInputString;
    private ArrayList<Employee> Employees;

    //Method Reads data from file
    ArrayList<Employee> readData(String fileName){
        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        //Try
        try {
            //Declare file and scanner Objects
            File inputFile = new File(fileName);
            Scanner inputReader = new Scanner(inputFile);
            String unParsedData;
            //Take in data
            while(inputReader.hasNextLine()){
                unParsedData = inputReader.nextLine();
                //call PraseData()
                //Add the returned data to the arrayList
                employeeList.add(parseData(unParsedData));
            }
        }
        //Catch
        catch (FileNotFoundException e){
            System.out.println("Error");
            e.printStackTrace();
        }
        //Return arrayList
        this.Employees = employeeList;
        return employeeList;
    }
    Employee parseData(String data){
        int salary;

        //Deliminate the data into the variables
        String[] parsedData = data.split(",");
        salary = Integer.parseInt(parsedData[2]);
        //Create a new Employee object
        Employee temp = new Employee(parsedData[0],parsedData[1],salary);
        //Return the object.
        return temp;
    }

    void printData(){
        System.out.format("%10s%15s%15s\n","Last","First","Salary");
        System.out.println("----------------------------------------");
        for (Employee e:this.Employees) {
            System.out.format("%10s%15s%15d\n",e.getLastName(),e.getFirstName(),e.getSalary());

        }
    }

    void writeData(String fileName){
        try{
            File outputFile = new File(fileName);
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write("Last\t\tFirst\t\tSalary\n");
            for (Employee e:this.Employees) {
                fileWriter.write(e.getLastName()+"\t\t"+e.getFirstName()+"\t\t"+e.getSalary()+"\n");

            }
            fileWriter.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
