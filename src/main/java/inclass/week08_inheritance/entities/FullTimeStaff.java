package inclass.week08_inheritance.entities;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FullTimeStaff {
    private String staffId;
    private String firstName;
    private String lastName;
    private String department;
    private double salary;
    private ArrayList<String> benefits;

    public FullTimeStaff(String id, String first, String last, String dept, double salary, ArrayList<String> benefits){
        this.staffId = id;
        this.firstName = first;
        this.lastName = last;
        this.department = dept;
        this.salary = salary;
        this.benefits = benefits;
    }

    public String generateEmail(){
        return firstName + "." + lastName + "@" + department + ".com";
    }

    public boolean addBenefit(String benefit){
        if(benefits.contains(benefit)){
            return false;
        }

        benefits.add(benefit);
        return true;
    }
}
