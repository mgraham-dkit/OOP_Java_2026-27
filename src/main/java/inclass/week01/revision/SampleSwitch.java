package inclass.week01.revision;

import java.util.Scanner;

public class SampleSwitch {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose one of the following options: ");
        System.out.println("1) Say 'Hello'");
        System.out.println("2) Say 'Goodbye'");
        System.out.println("3) Tell a joke");
        System.out.println("4) Do a trick");

        String choice = input.nextLine();

        // A switch starts by specifying the variable we'll use for our comparison conditions
        // The switch block should be surrounded by {} to show the start and end of the block
        switch(choice){
            // List each possible option we want and code to run
            // if the choice variable matches that value
            // Syntax: case value to check against -> code to run (in {} if there's a lot)
            case "1" -> {
                System.out.println("Who am I saying hello to?");
                String name = input.nextLine();
                System.out.println("Hello, + " + name + "!!");
            }
            // We don't need {} around the case code when it's only one line long
            case "2" -> System.out.println("Goodbye unknown person, parting is such sweet sorrow...");
            case "3" -> {
                System.out.println("Knock knock");
                System.out.println("(Who's there?)");
                System.out.println("Boo");
                System.out.println("(Boo who?)");
                System.out.println("Aww, don't cry. It's only a joke!");
            }
            case "4" -> System.out.println("Watch as I disappear...!");
            // default is the equivalent of else - it runs if no other case/condition matches
            default ->
                System.out.println("I was pretty clear - choose from the LISTED options. Pay more attention next time!");
        }
    }
}
