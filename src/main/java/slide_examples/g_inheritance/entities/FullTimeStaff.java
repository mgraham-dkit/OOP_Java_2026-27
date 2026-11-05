package slide_examples.g_inheritance.entities;

import java.util.ArrayList;

public class FullTimeStaff extends Staff{
    private double salary;
    private ArrayList<String> benefits;

    public FullTimeStaff(String firstname, String lastname,
                         String dept, double salary, ArrayList<String> benefits){
        super(firstname, lastname, dept);
        this.salary = salary;

        this.benefits = new ArrayList<>();
        if(benefits != null){
            for (String benefit : benefits) {
                this.benefits.add(benefit.toLowerCase());
            }
        }
    }

    public boolean addBenefit(String newBenefit){
        if(newBenefit == null || newBenefit.isBlank()){
            return false;
        }

        newBenefit = newBenefit.toLowerCase();
        if(benefits.contains(newBenefit)){
            return false;
        }

        benefits.add(newBenefit);
        return true;
    }

    public void displayBenefits(){
        StringBuilder benefitOutput = new StringBuilder();
        for (int i = 0; i < benefits.size(); i++) {
            String benefit = benefits.get(i);
            benefitOutput.append(benefit);

            if(i < benefits.size()-1){
                benefitOutput.append(", ");
            }
        }
        System.out.println(super.firstName + " " + super.lastName + " benefits: " + benefitOutput.toString());
    }
}
