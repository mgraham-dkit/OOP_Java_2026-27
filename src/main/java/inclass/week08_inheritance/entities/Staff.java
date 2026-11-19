package inclass.week08_inheritance.entities;

public class Staff {
    private String staffId;
    private String firstName;
    private String lastName;
    private String department;

    public Staff(String id, String first, String last, String dept){
        this.staffId = id;
        this.firstName = first;
        this.lastName = last;
        this.department = dept;
    }

    public String generateEmail(){
        return firstName + "." + lastName + "@" + department + ".com";
    }

    public String toString(){
        // Include the package name and the name of the class this was created as
        return this.getClass().getName() + "{staffId=" + this.staffId + ", firstName=" + this.firstName +  ", " +
                "lastName=" + this.lastName +
                ", department=" + this.department;
    }
}
