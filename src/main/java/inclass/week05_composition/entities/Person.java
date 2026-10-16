package inclass.week05_composition.entities;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate dateOfBirth;

    /**
     * Creates a Person with a given nme and date of birth.
     * If the name is null or blank, it defaults to "ANONYMOUS"
     * If the date of birth is null, it defaults to today
     *
     * @param name the name of the Person being created
     * @param dateOfBirth the date of birth of the Person being created
     */
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
