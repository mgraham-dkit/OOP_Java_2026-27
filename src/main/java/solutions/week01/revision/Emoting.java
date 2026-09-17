package solutions.week01.revision;

import java.util.Scanner;

public class Emoting {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your friend's name: ");
        String name = input.nextLine();

        System.out.println("Please enter your activity: ");
        String activity = input.nextLine();

        System.out.println("Please enter your favourite colour: ");
        String colour = input.nextLine();

        System.out.println("Please enter an emotion: ");
        String emotion = input.nextLine();

        System.out.println("I had a dream that " + name + " went " + activity + " and turned " + colour + " from " +
                emotion + "!");
    }
}
