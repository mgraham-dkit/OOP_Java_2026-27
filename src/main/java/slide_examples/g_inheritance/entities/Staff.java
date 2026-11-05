package slide_examples.g_inheritance.entities;

public class Staff {
    protected String firstName;
    protected String lastName;
    protected String department;

    public Staff(String firstName, String lastName, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
    }

    public String generateEmail(){
        String dept = this.department.replace(" ", "_");
        return this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + dept.toLowerCase() + ".com";
    }
}
