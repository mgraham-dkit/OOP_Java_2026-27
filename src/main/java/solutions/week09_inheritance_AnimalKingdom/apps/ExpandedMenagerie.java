package solutions.week09_inheritance_AnimalKingdom.apps;

import solutions.week09_inheritance_AnimalKingdom.entities.Animal;
import solutions.week09_inheritance_AnimalKingdom.entities.Cat;
import solutions.week09_inheritance_AnimalKingdom.entities.Dog;

import java.sql.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ExpandedMenagerie {
    static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();

        Animal myPet = new Animal("Kelly", 3, LocalDate.of(2025, 6, 24));
        Animal mySecondPet = new Animal("Zach", 7, LocalDate.of(2025, 12, 16));
        Animal myThirdPet = new Animal("Slater", 11, LocalDate.of(2025, 9, 1));

        animals.add(myPet);
        animals.add(mySecondPet);
        animals.add(myThirdPet);

        for (int i = 0; i < 2; i++) {
            Animal userAnimal = createAnimal();
            animals.add(userAnimal);
        }

        Dog dog1 = new Dog("Lassie", 18, LocalDate.of(2021, 10, 20), "Schnowzer", null);
        Dog dog2 = new Dog("Frasier", 44, LocalDate.of(1989, 5, 20), "Terrier", "yappy");
        Dog dog3 = new Dog("Roz", 11, LocalDate.of(2002, 1, 2), "Poodle", "bossy");
        Dog dog4 = new Dog("Niles", 23, LocalDate.of(1994, 8, 16), "Greyhound", "anxious");
        animals.add(dog1);
        animals.add(dog2);
        animals.add(dog3);
        animals.add(dog4);

        ArrayList<String> cat1Vaccinations = new ArrayList<>(Arrays.asList("feline herpesvirus", "calicivirus"));
        Cat cat1 = new Cat("Trixie", 3.5, LocalDate.of(2025, 2, 27), "long", cat1Vaccinations);
        ArrayList<String> cat2Vaccinations = new ArrayList<>(cat1Vaccinations);
        cat2Vaccinations.add("feline panleukopenia");

        Cat cat2 = new Cat("Annabelle", 2.7, LocalDate.of(2024, 11, 30), "short", cat2Vaccinations);

        animals.add(cat1);
        animals.add(cat2);

        Collections.shuffle(animals);

        displayAnimals(animals);
        displayAnimalsBelowAge(animals, 2);

        ArrayList<Dog> dogsOnly = extractAllDogs(animals);
        Dog heaviest = findHeaviestDog(dogsOnly);
        if(heaviest != null){
            heaviest.display();;
        }

        // Find all cats with feline panleukopenia vaccination
        String targetVaccination = "feline panleukopenia";
        ArrayList<Animal> vaccinatedCats = hasVaccination(animals, targetVaccination);

        System.out.println("Animals with \"feline panleukopenia\" vaccination:");
        displayAnimals(vaccinatedCats);
    }

    // Use a method to create an animal from user input
    // This makes the code cleaner and easier to work with
    public static Animal createAnimal(){
        Scanner input = new Scanner(System.in);

        // Take in name
        System.out.print("Name: ");
        String name = input.nextLine();

        // Take in weight
        System.out.print("Weight: ");
        double weight = input.nextDouble();

        // Clear buffer after taking in double
        input.nextLine();

        // Take in date information (year, month, date) and create a date object from them
        System.out.print("Birth year: ");
        int birthYear = input.nextInt();
        System.out.print("Birth month: ");
        int birthMonth = input.nextInt();
        System.out.print("Birth date: ");
        int birthDate = input.nextInt();
        LocalDate dob = LocalDate.of(birthYear, birthMonth, birthDate);

        // Clear buffer after taking in numeric data
        input.nextLine();

        // Create a new Animal object (using the user's data) and return it
        return new Animal(name, weight, dob);
    }

    // Method to display all animals
    public static void displayAnimals(ArrayList<Animal> animals){
        if(animals == null){
            System.out.println("No list provided!");
            return;
        }

        for (Animal animal : animals) {
            animal.display();
        }
    }

    public static void displayAnimalsBelowAge(ArrayList<Animal> animals, int ageThreshold){
        System.out.println("Animals aged " + ageThreshold + " or under:>");
        if(animals == null){
            System.out.println("No list provided!");
            return;
        }

        // Loop through all animals
        for (Animal animal : animals) {
            // If the current animal's age is less than or equal to the specified threshold
            if(animal.calcAge() <= ageThreshold){
                // Display the name of the current animal
                // This means we need to create a getName() in Animal
                // It is a getter for an Animal component, so it should be added to the Animal class
                System.out.println(animal.getName());
            }
        }
    }

    public static ArrayList<Dog> extractAllDogs(ArrayList<Animal> animals){
        if(animals == null){
            System.out.println("No list provided!");
            return null;
        }

        ArrayList<Dog> dogsOnly = new ArrayList<>();

        for (Animal animal : animals) {
            if(animal instanceof Dog dogAnimal){
                dogsOnly.add(dogAnimal);
            }
        }

        return dogsOnly;
    }

    public static Dog findHeaviestDog(ArrayList<Dog> dogsOnly){
        if(dogsOnly == null || dogsOnly.isEmpty()){
            System.out.println("No/Empty list provided!");
            return null;
        }

        Dog heaviest = dogsOnly.getFirst();
        double maxWeight = heaviest.getWeight();

        for (Dog dog : dogsOnly) {
            if(dog.getWeight() > maxWeight){
                heaviest = dog;
                maxWeight = heaviest.getWeight();
            }
        }
        return heaviest;
    }

    public static ArrayList<Animal> hasVaccination(ArrayList<Animal> animals, String targetVaccination){
        if(animals == null){
            throw new IllegalArgumentException("Animal list to be searched cannot be null");
        }

        ArrayList<Animal> vaccinatedCats = new ArrayList<>();
        for (Animal animal : animals) {
            if(animal instanceof Cat currentCat){
                if(currentCat.hasVaccination(targetVaccination)){
                    vaccinatedCats.add(currentCat);
                }
            }
        }

        return vaccinatedCats;
    }
}
