package solutions.week09_inheritance_AnimalKingdom.apps;

import solutions.week09_inheritance_AnimalKingdom.entities.Animal;

import java.time.LocalDate;

public class AnimalTestBed {
    static void main(String[] args) {
        Animal myPet = new Animal("Kelly", 4, LocalDate.of(2025, 11, 10));
        System.out.println("My pet's details: " + myPet);
    }
}
