package solutions.week06.constructors_encapsulation_static.entities;

public class Employee {
    private static int employeeCount = 0;

    private int id;
    private String firstName;
    private String lastName;
    private double salary;
    private String jobTitle;

    public Employee(String firstName, String lastName, double salary, String jobTitle) {
        Employee.employeeCount++;
        this.id = Employee.employeeCount;

        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public Employee(){
        Employee.employeeCount++;
        this.id = Employee.employeeCount;

        this.firstName = "firstName";
        this.lastName = "lastName";
        this.salary = 20000;
        this.jobTitle = "jobTitle";
    }

    public static int getEmployeeCount(){
        return Employee.employeeCount;
    }

    @Override
    public String toString(){
        return "Employee{id=" + this.id + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", salary" +
                "=€" + this.salary + ", jobTitle=" + this.jobTitle + "}";
    }
}
