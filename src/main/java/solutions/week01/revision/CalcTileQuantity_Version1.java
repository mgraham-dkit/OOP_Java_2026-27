package solutions.week01.revision;

import java.util.Scanner;

public class CalcTileQuantity_Version1 {
    public static void main(String [] args) {
        // Create access to console/keyboard
        Scanner input = new Scanner(System.in);

        // Inform user what's going on
        System.out.println("Tile Area Calculator");
        System.out.println("Note: All tiles measure 3 * 3");
        int tileArea = 3 * 3;

        // Take in required information
        System.out.println("Enter your space dimensions: ");
        System.out.print("\tHeight: ");
        int height = input.nextInt();
        System.out.print("\tWidth: ");
        int width = input.nextInt();

        // Calculate user-required area and how many tiles are needed to fill that area
        int totalUserArea = height*width;
        int quantityRequired = totalUserArea/tileArea;
        System.out.println("You will need " + quantityRequired + " tiles to cover your space (Surface area needed: " + totalUserArea + ").");
    }
}
