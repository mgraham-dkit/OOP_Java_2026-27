package inclass.week08_inheritance.entities;

import java.util.ArrayList;

public class InheritingFullTimeStaff extends Staff{
    private double salary;
    private ArrayList<String> benefits;

    public InheritingFullTimeStaff(String id, String first, String last, String dept, double salary, ArrayList<String> benefits){
        super(id, first, last, dept);
        this.salary = salary;
        this.benefits = benefits;
    }

    public boolean addBenefit(String benefit){
        if(benefits.contains(benefit)){
            return false;
        }

        benefits.add(benefit);
        return true;
    }
}
