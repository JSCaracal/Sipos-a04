package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
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

    void writeData()

}
