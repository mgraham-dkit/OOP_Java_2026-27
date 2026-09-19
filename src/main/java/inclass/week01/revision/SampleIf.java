package inclass.week01.revision;

import java.util.Scanner;

public class SampleIf {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose one of the following options: ");
        System.out.println("1) Say 'Hello'");
        System.out.println("2) Say 'Goodbye'");
        System.out.println("3) Tell a joke");
        System.out.println("4) Do a trick");

        String choice = input.nextLine();

        if (choice.equals("1")) {
            System.out.println("Who am I saying hello to?");
            String name = input.nextLine();
            System.out.println("Hello, + " + name + "!!");
        } else if (choice.equals("2")) {
            System.out.println("Goodbye unknown person, parting is such sweet sorrow...");
        } else if (choice.equals("3")) {
            System.out.println("Knock knock");
            System.out.println("(Who's there?)");
            System.out.println("Boo");
            System.out.println("(Boo who?)");
            System.out.println("Aww, don't cry. It's only a joke!");
        } else if (choice.equals("4")) {
            System.out.println("Watch as I disappear...!");
        } else {
            System.out.println("I was pretty clear - choose from the LISTED options. Please pay more attention " +
                    "next time!");
        }
    }
}
