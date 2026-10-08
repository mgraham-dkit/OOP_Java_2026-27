package solutions.week03.introducing_classes.apps;

import solutions.week03.introducing_classes.entities.Rectangle;

import java.util.Scanner;

public class RectanglesDemo {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // User defined rectangle
        Rectangle r1 = new Rectangle();
        System.out.print("Enter length: ");
        double length = input.nextDouble();

        System.out.print("Enter width: ");
        double width = input.nextDouble();
        input.nextLine();

        System.out.print("Enter colour: ");
        String colour = input.nextLine();

        r1.length = length;
        r1.width = width;
        r1.colour = colour;

        r1.display();
        System.out.println("R1 area: " + r1.calcArea());

        // Hard-coded rectangle
        Rectangle r2 = new Rectangle();

        r2.length = 100;
        r2.width = 1000;
        r2.colour = "Orange";

        r2.display();
        System.out.println("R2 area: " + r2.calcArea());
    }
}
