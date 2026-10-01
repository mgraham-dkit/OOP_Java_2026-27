package solutions.week03.introducing_classes.apps;

import solutions.week03.introducing_classes.entities.Person;

import java.util.Scanner;

public class PersonTestBed {
    static void main(String[] args) {
        Person myPerson = new Person();

        if(myPerson.leftHanded){
            System.out.println(myPerson.firstName + " " + myPerson.secondName + ".");
        }else{
            System.out.println(myPerson.firstName.toUpperCase() + " " + myPerson.secondName.toUpperCase() + ".");
        }

        Scanner input = new Scanner(System.in);
        // Take in name information
        System.out.print("Please enter your first name(s): ");
        String first = input.nextLine();
        System.out.print("Please enter your last name(s): ");
        String last = input.nextLine();

        // Take in age information
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        // Clear buffer of remaining newlines
        input.nextLine();

        // Take in choice for if they're left-handed
        // Default to no, only care if they say yes! (y or Y)
        System.out.print("Are you left-handed? (Enter Y/y for yes, any other key for no)");
        String choice = input.nextLine();
        boolean lefthanded = false;
        if(choice.equalsIgnoreCase("y")){
            lefthanded = true;
        }

        // Make new Person
        Person p2 = new Person();

        // Set their data
        p2.firstName = first;
        p2.secondName = last;
        p2.age = age;
        p2.leftHanded = lefthanded;

        // Display the information
        if(myPerson.leftHanded){
            System.out.println(p2.firstName + " " + p2.secondName + ".");
        }else{
            System.out.println(p2.firstName.toUpperCase() + " " + p2.secondName.toUpperCase() + ".");
        }
    }
}
