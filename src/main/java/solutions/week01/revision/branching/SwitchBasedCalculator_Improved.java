package solutions.week01.revision.branching;

import java.util.Scanner;

public class SwitchBasedCalculator_Improved {
    static void main(String[] args) {
        String ADD_SYMBOL = "+";
        String SUBTRACT_SYMBOL = "-";
        String MULTIPLY_SYMBOL = "*";
        String DIVIDE_SYMBOL = "/";

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
        String operationSymbol = null;
        double result = 0;
        switch(choice){
            case "1" ->{
                operationSymbol = ADD_SYMBOL;
                result = num1 + num2;
            }
            case "2" -> {
                operationSymbol = SUBTRACT_SYMBOL;
                result = num1 - num2;
            }
            case "3" -> {
                operationSymbol = MULTIPLY_SYMBOL;
                result = num1 * num2;
            }
            case "4" -> {
                operationSymbol = DIVIDE_SYMBOL;
                result = num1 / num2;
            }
            default -> {
                System.out.println("That's not a recognised option, sorry. Defaulting to addition");
                operationSymbol = ADD_SYMBOL;
                result = num1 + num2;
            }
        }

        System.out.println(num1 + operationSymbol + num2 + " = " + result);
    }
}
