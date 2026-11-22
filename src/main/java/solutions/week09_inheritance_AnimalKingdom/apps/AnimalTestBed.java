package solutions.week09_inheritance_AnimalKingdom.apps;

import solutions.week09_inheritance_AnimalKingdom.entities.Animal;

import java.time.LocalDate;

public class AnimalTestBed {
    static void main(String[] args) {
        // Create an Animal using the all-args constructor
        Animal myPet = new Animal("Kelly", 4, LocalDate.of(2025, 11, 10));
        // Display the information to confirm it was added correctly
        System.out.println("My pet's details: " + myPet);
        // Check the calcAge method works correctly
        System.out.println("My pet's age is: " + myPet.calcAge());
        // Check the display method works correctly.
        myPet.display();

        // Make a new animal using a different constructor
        Animal wildAnimal = new Animal(10, LocalDate.of(2021, 10, 20));
        // Display the new animal's details
        wildAnimal.display();

        // Test equals to see if it works
        if (myPet.equals(wildAnimal)) {
            System.out.println("My pet and the wild animal are equal");
        }else{
            System.out.println("My pet and the wild animal are different");
        }
    }
}
