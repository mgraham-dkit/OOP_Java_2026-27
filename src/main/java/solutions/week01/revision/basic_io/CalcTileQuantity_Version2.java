package solutions.week01.revision.basic_io;

import java.util.Scanner;

public class CalcTileQuantity_Version2 {
    public static void main(String [] args) {
        // Create access to console/keyboard
        Scanner input = new Scanner(System.in);

        // Inform user what's going on
        System.out.println("Tile Area Calculator");
        System.out.println("Note: All tiles measure 3 * 3");
        int edgeLength = 3;

        // Take in required information
        System.out.println("Enter your space dimensions: ");
        System.out.print("\tHeight: ");
        int height = input.nextInt();
        System.out.print("\tWidth: ");
        int width = input.nextInt();

        // Calculate how many tiles are needed for the height
        // If we have a partial tile in the calculation, Java will automatically
        // round downwards. However, we need to round up in this case (or we won't have enough tiles)
        // Math.ceil() rounds upwards, but it works on doubles
        // We need to cast to use the double version of the value,
        // then convert back to ints for the final answer
        int heightRequired = (int) Math.ceil((double)height/edgeLength);
        int widthRequired = width/edgeLength;
        System.out.println("You will need " + (heightRequired*widthRequired) + " tiles to cover your space (Surface area " +
                "needed: " + (height*width) + ").");
    }
}
