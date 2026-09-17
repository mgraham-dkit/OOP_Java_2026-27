package inclass.week01.revision;

import java.util.Scanner;

public class ScannerRevision {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");

        String name = input.nextLine();
        System.out.println("Hello, " + name);
    }
}
