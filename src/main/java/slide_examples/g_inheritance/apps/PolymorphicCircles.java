package slide_examples.g_inheritance.apps;

import slide_examples.g_inheritance.entities.Circle;
import slide_examples.g_inheritance.entities.Sphere;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PolymorphicCircles {
    public static Random randomGenerator = new Random();

    public static Circle makeCircle(){
        Circle c = null;
        boolean makeCircle = randomGenerator.nextBoolean();
        int radius = randomGenerator.nextInt(1, 20);
        if(makeCircle){
            c = new Circle(radius, "");
        }else{
            c = new Sphere(radius, "Pink");
        }

        return c;
    }

    static void main(String[] args) {
        // Ask user how many to make:
        Scanner input = new Scanner(System.in);
        System.out.println("How many shapes would you like to make?");
        int numShapes = input.nextInt();

        ArrayList<Circle> circles = new ArrayList<>();
        for (int i = 0; i < numShapes; i++) {
            Circle c = makeCircle();
            circles.add(c);
        }

        // Count the spheres that were generated:
        int sphereCount = 0;
        for (Circle circle : circles) {
            if(circle instanceof Sphere sphere){
                sphereCount++;
                System.out.println("Sphere found! Sphere volume: " + sphere.calcVolume());
            }else{
                System.out.println("This one is not a sphere, sorry... Non-sphere area: " + circle.calcArea());
            }
        }

        System.out.println("The total number of spheres created was " + sphereCount);
        System.out.println("The number of non-spheres created was " + (circles.size() - sphereCount));
    }
}
