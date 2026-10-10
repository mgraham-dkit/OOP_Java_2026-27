package solutions.week03.introducing_classes.apps;

import com.sun.security.jgss.GSSUtil;
import solutions.week03.introducing_classes.entities.Rectangle;

import java.util.ArrayList;
import java.util.Scanner;

public class RectanglesTestBed {
    public static ArrayList<Rectangle> findByColour(ArrayList<Rectangle> rectangles, String targetColour){
        ArrayList<Rectangle> matching = new ArrayList<>();

        for (int i = 0; i < rectangles.size(); i++) {
            Rectangle current = rectangles.get(i);

            // If the current rectangle's colour matches the target colour
            if(targetColour.equalsIgnoreCase(current.colour)){
                matching.add(current);
            }
        }
        return matching;
    }

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

    public static int indexOfSmallestWidthRectangle(ArrayList<Rectangle> rectangles){
        if(rectangles == null || rectangles.isEmpty()){
            return -1;
        }

        double minWidth = rectangles.getFirst().width;
        int minIndex = 0;

        for (int i = 0; i < rectangles.size(); i++) {
            Rectangle current = rectangles.get(i);

            // If the current rectangle's width is smaller than previous smallest, save it
            if(current.width < minWidth){
                minWidth = current.width;
                minIndex = i;
            }
        }
        return minIndex;
    }

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Rectangle> rectangles = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
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
        System.out.println("------------------------------------");

        // Loop through every rectangle in the list and ask it to display itself
        for (Rectangle rectangle : rectangles) {
            rectangle.display();
        }
        // This is the same as:
        // for (int i = 0; i < rectangles.size(); i++) {
        //    Rectangle rectangle = rectangles.get(i);
        //    rectangle.display();
        // }

        System.out.println("------------------------------------");

        // Find rectangle with largest area
        Rectangle largest = findLargestArea(rectangles);
        System.out.println("Largest rectangle: ");
        largest.display();

        System.out.println("------------------------------------");

        // Find rectangle with smallest width
        int index = indexOfSmallestWidthRectangle(rectangles);
        System.out.println("Index of rectangle with smallest width: " + index);
        Rectangle narrowest = rectangles.get(index);
        narrowest.display();

        System.out.println("------------------------------------");

        // Find rectangles with specific colour
        String colourTarget = "red";
        ArrayList<Rectangle> colourMatches = findByColour(rectangles, colourTarget);

        if(colourMatches.isEmpty()){
            System.out.println("No Rectangles found matching " + colourTarget);
        }else{
            System.out.println("Rectangles matching colour \"" + colourTarget + "\":");
            for (int i = 0; i < colourMatches.size(); i++) {
                Rectangle current = colourMatches.get(i);
                current.display();
            }
        }
        System.out.println("------------------------------------");
    }
}
