package solutions.week01.revision.methods;

import java.util.Scanner;

public class NumberReading {
    static void main(String[] args) {
        int num1 = getValidInteger("Please enter first number:");
        int num2 = getValidInteger("Please enter second number:");
        int num3 = getValidInteger("Please enter third number:");

        int max = findMax(num1, num2, num3);

        System.out.println(max + " is the max value of [" + num1 + ", " + num2 + ", " + num3 + "]");
    }

    public static void displayOutput(String text){
        System.out.println("----------------------");
        System.out.println(text);
        System.out.println("----------------------");
    }

    public static int findMax(int num1, int num2, int num3){
        // Assume num1 is the biggest value
        int max = num1;

        // If num2 is bigger, make that one the max
        if(num2 > max){
            max = num2;
        }

        // If num3 is bigger, make THAT one the max
        if(num3 > max){
            max = num3;
        }

        // return the max we detected
        return max;
    }

    public static int getValidInteger(String prompt){
        // Create a scanner so we can read in from the user
        Scanner input = new Scanner(System.in);
        // Create a flag to track if a number has been entered
        boolean validNumEntered = false;

        int num = 0;
        // While no valid number has been entered
        while(!validNumEntered){
            // Display prompt to user
            System.out.println(prompt);
            // If they entered an int
            if(input.hasNextInt()){
                // Read it in
                num = input.nextInt();
                // Stop the loop by resetting the boolean flag
                validNumEntered = true;
            }else{
                // If they didn't enter a number, empty the "bad data" out of the scanner's buffer
                input.nextLine();
                // Remind them they need to enter an int
                System.out.println("Integer required!");
            }
        }
        // Return the number that was entered
        return num;
    }
}
