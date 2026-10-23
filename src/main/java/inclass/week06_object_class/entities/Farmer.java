package inclass.week06_object_class.entities;

import java.time.LocalDate;

public class Farmer {
    private String name;
    private String farm;
    private LocalDate dateOfBirth;

    public Farmer(String name, String farm, LocalDate dob){
        if(name == null || name.isBlank()){
            System.out.println("FARMER HAS NO NAME! ASSIGNING DEFAULT");
            name = "Farmer Joe";
        }

        if(farm == null || farm.isBlank()){
            System.out.println("FARM IS BLANK! ASSIGNING DEFAULT");
            farm = "Sheep farm";
        }

        this.name = name;
        this.farm = farm;
        this.dateOfBirth = dob;
    }

    public String getName(){
        return this.name;
    }

    public String getFarm(){
        return this.farm;
    }

    public LocalDate getDateOfBirth(){
        return this.dateOfBirth;
    }

    public String toString(){
        return "Farmer{name="+ name + ", farm=" + farm + ", dateOfBirth="+dateOfBirth+"}";
    }

    public void display(){
        System.out.println(name + " has a " + farm);
    }
}
