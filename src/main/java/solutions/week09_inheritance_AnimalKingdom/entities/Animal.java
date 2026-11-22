package solutions.week09_inheritance_AnimalKingdom.entities;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Animal {
    protected String name;
    protected double weight;
    protected LocalDate dob;

    public Animal(String name, double weight, LocalDate dob) {
        // Name validation
        if(name == null || name.isBlank()){
            String defaultName = "DEFAULT_Timmy";
            System.out.println("NAME MUST CONTAIN REAL DATA - RESETTING TO DEFAULT (" + defaultName + ")");
            name = defaultName;
        }

        // Weight validation
        if(weight <= 0){
            double defaultWeight = 5;
            System.out.println("WEIGHT CANNOT BE <= 0. RESETTING TO DEFAULT (" + defaultWeight + ")");
            weight = defaultWeight;
        }

        // Date of birth validation
        LocalDate today = LocalDate.now();
        if(dob == null || dob.isAfter(today)){
            System.out.println("CANNOT HAVE A DATE OF BIRTH AFTER CURRENT DATE. RESETTING TO TODAY AS DEFAULT (" + today + ")");
            dob = today;
        }

        // VALIDATION COMPLETE
        // Store validated information
        this.name = name;
        this.weight = weight;
        this.dob = dob;
    }

    public Animal(double weight, LocalDate dob){
        this("Fido", weight, dob);
    }

    @Override
    // Be careful with generating equals - it can be generated as final, meaning it can't be overridden in subclasses!
    public boolean equals(Object o) {
        if (!(o instanceof Animal animal)) {
            return false;
        }

        return Double.compare(weight, animal.weight) == 0
                && name.equalsIgnoreCase(animal.name)
                && dob.equals(animal.dob);
    }

    @Override
    public int hashCode() {
        int result = name.toLowerCase().hashCode();
        result = 31 * result + Double.hashCode(weight);
        result = 31 * result + dob.hashCode();
        return result;
    }

    @Override
    public String toString() {
        // Use the relative class name (i.e. the class that it was created as)
        // not the name of the class this method is created within
        return this.getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", dob=" + dob +
                '}';
    }

    public int calcAge(){
        LocalDate today = LocalDate.now();
        return (int) ChronoUnit.YEARS.between(this.dob, today);
    }

    public void display(){
        System.out.println(this.name + " was born on " + this.dob + " and weighs " + this.weight + " kg.");
    }

    public String getName(){
        return this.name;
    }

    public double getWeight(){
        return this.weight;
    }
}
