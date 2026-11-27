package solutions.week09_inheritance_AnimalKingdom.apps;

import solutions.week09_inheritance_AnimalKingdom.entities.Animal;
import solutions.week09_inheritance_AnimalKingdom.entities.Dog;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class DogTestBed {
    static void main(String[] args) {
        // Create a Dog using the all-args constructor
        Dog myPet = new Dog("Kelly", 4, LocalDate.of(2025, 11, 10), "Labrador", "happy");
        // Display the information to confirm it was added correctly
        System.out.println("My pet's details: " + myPet);
        // Check the calcAge method works correctly
        System.out.println("My pet's age is: " + myPet.calcAge());
        // Check the display method works correctly.
        myPet.display();

        // Make a second Dog with a null personality
        Dog wildDog = new Dog("Lassie", 10, LocalDate.of(2021, 10, 20), "Schnowzer", null);
        // Display the new animal's details
        wildDog.display();

        // Test equals to see if it works
        if (myPet.equals(wildDog)) {
            System.out.println("My pet and the wild dog are equal");
        }else{
            System.out.println("My pet and the wild dog are different");
        }

        Dog anotherWildDog = new Dog("Lassie", 10, LocalDate.of(2021, 10, 20), "Schnowzer", null);
        anotherWildDog.display();

        // Test equals to see if it works
        if (wildDog.equals(anotherWildDog)) {
            System.out.println("The first wild dog and the second wild dog are equal");
        }else{
            System.out.println("The first wild dog and the second wild dog are different");
        }

        Animal myDog = new Dog("AnimalDog", 5, LocalDate.of(2024, 10, 31), "Terrier", "Yappy");
        ArrayList<Animal> animals = new ArrayList<>(Arrays.asList(myPet, wildDog, anotherWildDog, myDog));
        Animal demoAnimal = new Animal("Fluffy", 100, LocalDate.of(2018, 6, 15));
        animals.add(demoAnimal);

        for (Animal animal : animals) {
            animal.display();
            if(animal instanceof Dog doggie){
                doggie.bark();
            }
        }
    }
}
