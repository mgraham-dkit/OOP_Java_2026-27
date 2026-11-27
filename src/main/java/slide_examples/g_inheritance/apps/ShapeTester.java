package slide_examples.g_inheritance.apps;

import slide_examples.g_inheritance.entities.Circle;
import slide_examples.g_inheritance.entities.Sphere;

import java.util.Random;

public class ShapeTester {
    static void main(String[] args) {
        Circle c1 = new Circle(10 ,"Blue");
        c1.display();

        Sphere s1 = new Sphere(10, "Orange");
        s1.display();

        System.out.println("Circle with radius of " + c1.getRadius() + " has an area of " + c1.calcArea());
        System.out.println("Sphere with radius of " + s1.getRadius() + " has an area of " + s1.calcArea());
    }
}
