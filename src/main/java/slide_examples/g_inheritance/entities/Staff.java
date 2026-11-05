package slide_examples.g_inheritance.entities;

import java.util.Objects;

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

    public boolean equals(Object object){
        if(!(object instanceof Staff staff)){
            return false;
        }

        if(!this.firstName.equals(staff.firstName)){
            return false;
        }

        if(!this.lastName.equals(staff.lastName)) {
            return false;
        }

        if(!this.department.equals(staff.department)){
            return false;
        }

        return true;
    }

    public int hashCode(){
        return Objects.hash(this.firstName, this.lastName, this.department);
    }

    @Override
    public String toString() {
        return "Staff{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
