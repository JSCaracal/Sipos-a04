package baseline;

import java.util.ArrayList;

public class DataParsing {
    private String unParsedInputString;
    private ArrayList<Employee> Employees;

    //Method Reads data from file
    ArrayList<Employee> readData(String fileName){
        //Try
            //Declare file and scanner Objects

            //Take in data

            //call PraseData()

            //Add the returned data to the arrayList
        //Catch

        //Return arrayList
        return;
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

}
