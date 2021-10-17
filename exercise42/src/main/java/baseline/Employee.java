package baseline;

public class Employee {
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(String fName,String lName,int salary){
        this.firstName = fName;
        this.lastName = lName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }
}
