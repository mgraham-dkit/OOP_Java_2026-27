package exercise_material.revision_exercises;

import java.util.Scanner;

// Write a comment over each line to explain its action
public class Area {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("enter length");
        double length = input.nextDouble();
        System.out.print("enter breadth");
        double breadth = input.nextDouble();

        double area = length * breadth;
        System.out.println("the area is  " + area);
    }
}
