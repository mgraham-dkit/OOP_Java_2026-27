package exercise_material.revision_exercises;

import java.util.Scanner;

public class MethodBasedArea {
    static void main() {
        //get input
        double length = getValidDimensions("Enter length");
        double breadth = getValidDimensions("Enter Breadth");

        //do calculation
        double area = calculateArea(length, breadth);

        //display results
        outputResults("the area is" + area);
    }

    public static double getValidDimensions(String prompt) {
        double dimension;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print(prompt);
            dimension = input.nextDouble();
            if (dimension <= 0) {
                System.out.println("Number must be greater than 0");
            }
        } while (dimension <= 0);
        return dimension;
    }

    public static double calculateArea(double length, double width) {
        return length * width;
    }

    public static void outputResults(String message) {
        System.out.println(message);
    }
}
