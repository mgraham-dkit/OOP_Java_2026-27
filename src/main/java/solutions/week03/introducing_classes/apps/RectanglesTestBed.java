package solutions.week03.introducing_classes.apps;

import com.sun.security.jgss.GSSUtil;
import solutions.week03.introducing_classes.entities.Rectangle;

import java.util.ArrayList;
import java.util.Scanner;

public class RectanglesTestBed {
    public static Rectangle findLargestArea(ArrayList<Rectangle> rectangles){
        double maxArea = -1;
        Rectangle largestRect = null;

        for (int i = 0; i < rectangles.size(); i++) {
            Rectangle current = rectangles.get(i);
            double currentArea = current.calcArea();

            // If the current rectangle's area is bigger than previous biggest, save it
            if(currentArea > maxArea){
                maxArea = currentArea;
                largestRect = current;
            }
        }
        return largestRect;
    }

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Rectangle> rectangles = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Please enter length: ");
            double length = input.nextDouble();
            System.out.print("Please enter width: ");
            double width = input.nextDouble();
            input.nextLine();
            System.out.print("Please enter colour: ");
            String colour = input.nextLine();
            Rectangle rect = new Rectangle();
            rect.length = length;
            rect.width = width;
            rect.colour = colour;

            rectangles.add(rect);
        }

        // Loop through every rectangle in the list and ask it to display itself
        for (Rectangle rectangle : rectangles) {
            rectangle.display();
        }
        // This is the same as:
        // for (int i = 0; i < rectangles.size(); i++) {
        //    Rectangle rectangle = rectangles.get(i);
        //    rectangle.display();
        // }

        // Find rectangle with largest area
        Rectangle largest = findLargestArea(rectangles);
        System.out.println("Largest rectangle: ");
        largest.display();
    }
}
