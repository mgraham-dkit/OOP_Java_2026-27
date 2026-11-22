package solutions.week09_inheritance_AnimalKingdom.entities;

import java.time.LocalDate;
import java.util.Objects;

// Create a subclass of Animal called Dog
public class Dog extends Animal{
    // Add two new attributes (instance variables) to the Dog - personality and breed
    private String breed;
    private String personality;

    // Create an all-args constructor that takes in all components of a Dog, i.e. the pieces to fill every variable
    // We include the superclass variables in the same order as the superclass for consistency
    public Dog(String name, double weight, LocalDate dob, String breed, String personality){
        super(name, weight, dob);

        // Breed validation:
        // Check if the breed doesn't exist, or the breed text is empty when you ignore blanks
        // (isBlank is a more efficient version of .trim().isEmpty())
        if(breed == null || breed.isBlank()){
            String defaultBreed = "Collie";
            System.out.println("BREED CANNOT BE OMITTED. RESETTING TO DEFAULT ("+ defaultBreed + ")");
            breed = defaultBreed;
        }

        // Dog is not required to have a personality, so we don't need to do any validation for that
        // Move on to storing data
        // Only need to store the things included in the Dog part, i.e. breed and personality
        this.breed = breed;
        this.personality = personality;
    }

    public void display(){
        // Use superclass display method to show the Animal-related information
        super.display();

        // Add more code to show the Dog-related information
        // Figure out what to display for the personality (in case it's blank/doesn't exist)
        String personalityOutput = personality;
        if(personality == null || personalityOutput.isBlank()){
            personalityOutput = "is a mysterious soul...";
        }

        // Display Dog-related data (including customised personality output)
        System.out.println("\t" + super.name + " is a " + this.getClass().getSimpleName() + ". It is a " + this.breed + " " +
                "and is " + personalityOutput);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", personality='" + personality + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", dob=" + dob +
                '}';
    }

    @Override
    public final boolean equals(Object o) {
        // If the other object is not a Dog, return false
        if (!(o instanceof Dog dog)) return false;
        // If the Animal components of the Dog (name, weight, dob) don't match, return false
        if (!super.equals(o)) return false;

        // If the breed match AND the personality matches, return true, otherwise return false
        // Objects.equals() handles checking if our personality or the other dog's personality is null
        return breed.equals(dog.breed)
                && Objects.equals(personality, dog.personality);
    }

    @Override
    public int hashCode() {
        // Include the Animal components of the Dog in the Dog's hashcode by calling super.hashCode()
        int result = super.hashCode();
        // Factor the breed information into the calculation
        result = 31 * result + breed.hashCode();
        // Factor the personality information into the hashcode
        // (IF it exists - Objects.hashCode() handles checking this)
        result = 31 * result + Objects.hashCode(personality);
        return result;
    }
}
