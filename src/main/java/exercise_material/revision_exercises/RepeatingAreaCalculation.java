package exercise_material.revision_exercises;

import java.util.Scanner;

// Write a comment over each line to explain its action
public class RepeatingAreaCalculation {
    static void main() {
        Scanner input = new Scanner(System.in);
        double length;

        do {
            System.out.print("Enter length");
            length = input.nextDouble();
            if (length <= 0) {
                System.out.println("Number must be greater than 0");
            }
        } while (length <= 0);

        System.out.print("Enter breadth");
        double breadth = input.nextDouble();
        double area = length * breadth;
        System.out.println("The area is  " + area);
    }
}
