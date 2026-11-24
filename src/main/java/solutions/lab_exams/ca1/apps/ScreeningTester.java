package solutions.lab_exams.ca1.apps;

import solutions.lab_exams.ca1.entities.Screening;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;

public class ScreeningTester {
    static void main(String[] args) {
        // Create 5 Screening objects
        Screening s1 = new Screening("S_001", "standard", "Five Nights at Freddy's", LocalDate.now(), LocalTime.NOON);
        Screening s2 = new Screening("S_002", "isense", "Spider-Man: Brand New Day", LocalDate.now(),
                LocalTime.MIDNIGHT);
        Screening s3 = new Screening("S_003", "imax", "Interstellar", LocalDate.now(), LocalTime.now());
        Screening s4 = new Screening("S_004", "imax", "The Odyssey", LocalDate.now(), LocalTime.MIDNIGHT);
        Screening s5 = new Screening("S_005", "standard", "Supergirl", LocalDate.of(2026, 6, 18), LocalTime.of(11, 40));

        // Add the screenings to an arraylist
        ArrayList<Screening> screenings = new ArrayList<>(Arrays.asList(s1, s2, s3, s4, s5));

        // Display all screenings
        displayScreenings(screenings);

        // Find all screenings matching the type "iSense"
        String type = "iSense";

        // The *best* way to do this is to use methods:
        // Get all screenings matching that type
//        ArrayList<Screening> matchingScreenings = getByType(screenings, type);
        // Display the results
//        System.out.println(type + " screenings: ");
//        displayScreenings(matchingScreenings);

        // But the following also works:
        System.out.println(type + " screenings: ");
        // Loop through all screenings
        for (Screening screening : screenings) {
            // If the current screening has the same type (case-insensitive check)
            if(screening.getType().equalsIgnoreCase(type)){
                // Print it out
                System.out.println(screening);
            }
        }

    }

    // Method to display all screenings
    public static void displayScreenings(ArrayList<Screening> screenings){
        // Where list doesn't exist, inform user and exit method
        if(screenings == null){
            System.out.println("Null list");
            return;
        }

        // Loop through each screening and print it out (using toString)
        System.out.println("Screenings: ");
        for (Screening screening : screenings) {
            System.out.println(screening);
        }
    }

    // Get list of screenings matching specified type
    // this is the better approach but not expected in lab exam time frame
    public static ArrayList<Screening> getByType(ArrayList<Screening> screenings, String type){
        // Validate to confirm list is real - if it's not, exit method
        if(screenings == null){
            System.out.println("CANNOT SEARCH A NULL LIST");
            return null;
        }

        // Validate to confirm search type is real - if it's not, exit method
        if(type == null){
            System.out.println("NULL SEARCH TERM IS NOT PERMITTED");
            return null;
        }

        // Create list to store all matching screenings
        ArrayList<Screening> results = new ArrayList<>();
        // Loop through each screening
        for (Screening screening : screenings) {
            // If current screening matches type being searched for
            if(screening.getType().equalsIgnoreCase(type)){
                // Add match to the result list
                results.add(screening);
            }
        }

        // Return the list of all matches
        return results;
    }
}
