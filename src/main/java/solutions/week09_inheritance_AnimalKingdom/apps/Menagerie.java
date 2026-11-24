package solutions.week09_inheritance_AnimalKingdom.apps;

import solutions.week09_inheritance_AnimalKingdom.entities.Animal;
import solutions.week09_inheritance_AnimalKingdom.entities.Dog;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Menagerie {
    // Create a main method to run our program logic
    static void main(String[] args) {
        // 1) Create an arraylist to store all forms of Animal
        // Reminder: An ARRAYLIST is not an ARRAY - they are not automatically interchangeable
        ArrayList<Animal> animals = new ArrayList<>();

        // 2) Create 3 hard-coded animals
        Animal myPet = new Animal("Kelly", 3, LocalDate.of(2025, 6, 24));
        Animal mySecondPet = new Animal("Zach", 7, LocalDate.of(2025, 12, 16));
        Animal myThirdPet = new Animal("Slater", 11, LocalDate.of(2025, 9, 1));

        // 2) and add them to the list
        animals.add(myPet);
        animals.add(mySecondPet);
        animals.add(myThirdPet);

        // 3) Add user-defined Animals
        for (int i = 0; i < 2; i++) {
            // Create a new Animal using the dedicated method
            Animal userAnimal = createAnimal();
            // Add the new animal to the list
            animals.add(userAnimal);
        }

        // 4) Create 4 hard-coded Dog objects and add them to the list
        Dog dog1 = new Dog("Lassie", 18, LocalDate.of(2021, 10, 20), "Schnowzer", null);
        Dog dog2 = new Dog("Frasier", 44, LocalDate.of(1989, 5, 20), "Terrier", "yappy");
        Dog dog3 = new Dog("Roz", 11, LocalDate.of(2002, 1, 2), "Poodle", "bossy");
        Dog dog4 = new Dog("Niles", 23, LocalDate.of(1994, 8, 16), "Greyhound", "anxious");
        animals.add(dog1);
        animals.add(dog2);
        animals.add(dog3);
        animals.add(dog4);

        // 5) Shuffle the list of animals and dogs
        Collections.shuffle(animals);

        // 6) Display the list of animals
        displayAnimals(animals);

        // 7) Print animals aged <= 2
        displayAnimalsBelowAge(animals, 2);

        // 8) Identify all Dogs
        ArrayList<Dog> dogsOnly = extractAllDogs(animals);

        // Identify heaviest Dog and display
        Dog heaviest = findHeaviestDog(dogsOnly);
        if(heaviest != null){
            heaviest.display();;
        }
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
}
