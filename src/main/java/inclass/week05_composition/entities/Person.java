package inclass.week05_composition.entities;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate dateOfBirth;

    public Person(String name, LocalDate dateOfBirth){
        if(name == null || name.isBlank()){
            name = "ANONYMOUS";
        }

        if(dateOfBirth == null){
            // Default to today's date
            dateOfBirth = LocalDate.now();
        }

        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName(){
        return this.name;
    }

    public LocalDate getDateOfBirth(){
        return dateOfBirth;
    }

    public String toString(){
        return "Person{name:" + this.name + ", dateOfBirth:" + this.getDateOfBirth() + "}";
    }
}
