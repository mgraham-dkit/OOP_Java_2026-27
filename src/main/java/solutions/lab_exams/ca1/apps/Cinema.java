package solutions.lab_exams.ca1.apps;

import solutions.lab_exams.ca1.entities.Schedule;
import solutions.lab_exams.ca1.entities.Screening;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Cinema {
    static void main() {
        // Create a Schedule object tracking screenings showing today
        Schedule todaySchedule = new Schedule(LocalDate.now());

        // Create 4 Screening objects - I never said they had to be different from the other program!
        Screening s1 = new Screening("S_001", "standard", "Dune 3", LocalDate.now(), LocalTime.NOON);
        Screening s2 = new Screening("S_002", "isense", "Spider-Man: Brand New Day", LocalDate.now(),
                LocalTime.MIDNIGHT);
        Screening s3 = new Screening("S_003", "imax", "dune 3", LocalDate.now(), LocalTime.now());
        Screening s4 = new Screening("S_004", "imax", "The Odyssey", LocalDate.now(), LocalTime.MIDNIGHT);

        // Add each screening to the schedule
        todaySchedule.addScreening(s1);
        todaySchedule.addScreening(s2);
        todaySchedule.addScreening(s3);
        todaySchedule.addScreening(s4);

        // Get all screenings for "Dune 3"
        String title = "Dune 3";
        // Use method from Schedule class to get all matching screenings
        ArrayList<Screening> duneShowings = todaySchedule.getScreeningsFor(title);
        // Check that we didn't get null where there was an error with the parameters
        if(duneShowings == null){
            System.out.println("Error occurred");
        }else if(duneShowings.isEmpty()){
            // Handle where there were no screenings found for that movie title
            System.out.println("No matches found for " + title);
        }else {
            // Use display method to show the values for that title
            System.out.println("Screenings for " + title + ":");
            displayScreenings(duneShowings);
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
}
