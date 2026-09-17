package solutions.week01.revision.branching;

import java.util.Scanner;

public class Calculator {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to your new Calculator app!");

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();
        input.nextLine();

        System.out.println("Please choose an operation:");
        System.out.println("\t1) Addition");
        System.out.println("\t2) Subtraction");
        System.out.println("\t3) Multiplication");
        System.out.println("\t4) Division");

        String choice = input.nextLine();
        if(choice.equals("1")){
            System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
        }else if(choice.equals("2")){
            System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
        }else if(choice.equals("3")){
            System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
        }else if(choice.equals("4")){
            System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
        }else{
            System.out.println("That's not a recognised option, sorry.");
        }
    }
}
