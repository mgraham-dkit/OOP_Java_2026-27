package solutions.lab_exams.ca1.entities;

import java.time.LocalDate;
import java.util.ArrayList;

public class Schedule {
    // UML diagram shows a counter for Schedule objects.
    // This is underlined, meaning it should be a static variable
    // It's not a final variable as it's not in all caps
    private static int scheduleCount = 0;

    // Create variables as per UML diagram
    private int scheduleId;
    private LocalDate scheduleDate;
    private ArrayList<Screening> screenings;

    // UML diagram states only one parameter should be included - all others are initialised to default values
    public Schedule(LocalDate scheduleDate) {
        // Validate schedule date - if not valid, set to today
        LocalDate today = LocalDate.now();
        if(scheduleDate == null){
            System.out.println("SCHEDULE DATE CANNOT BE NULL. RESETTING TO TODAY BY DEFAULT (" + today + ")");
            scheduleDate = today;
        }

        // VALIDATION COMPLETE
        // Start setting up object

        // Increase count of Schedules created
        scheduleCount++;
        // Set ID to match scheduleCount - use the number of schedules made in the system
        // as the generator for the schedule ID value (as per spec)
        scheduleId = scheduleCount;

        // Store supplied schedule date now that it's been validated
        this.scheduleDate = scheduleDate;

        // Spec states that each Schedule gets a new, blank list of screenings in the constructor
        this.screenings = new ArrayList<>();
    }

    // Spec states getter methods for ID and schedule date should be included
    public int getScheduleId() {
        return scheduleId;
    }

    public LocalDate getScheduleDate() {
        return scheduleDate;
    }

    // No getter should be provided for screenings list!

    // Create a method that searches for all screenings containing a specified movie title
    public ArrayList<Screening> getScreeningsFor(String movieTitle){
        // Validate supplied movie title to confirm it's not null or blank
        if(movieTitle == null || movieTitle.isBlank()){
            System.out.println("SEARCH TITLE CANNOT BE BLANK");
            return null;
        }

        ArrayList<Screening> matches = new ArrayList<>();
        // Check each screening on this schedule
        for (Screening screening : screenings) {
            // If current screening is for specified movie title
            if(screening.getTitle().equalsIgnoreCase(movieTitle)){
                // Add current screening to list
                matches.add(screening);
            }
        }
        // Return the list of all screenings matching the specified title
        return matches;
    }

    // Add a supplied screening to the Schedule IF it's valid
    public boolean addScreening(Screening newScreening){
        // Validate screening
        // Spec states screening is invalid if it's null
        if (newScreening == null) {
            System.out.println("CANNOT ADD NULL SCREENING");
            // Return false as it can't be added
            return false;
        }
        // Spec states screening is invalid if its date is not the same as this schedule's date
        if(!newScreening.getScreenDate().equals(this.scheduleDate)){
            System.out.println("CANNOT ADD SCREENING - IT IS NOT SHOWING ON APPROPRIATE DATE");
            // Return false as it can't be added
            return false;
        }

        // If it's not null, and it's on the right date, it can be added to this schedule's list
        this.screenings.add(newScreening);
        // We return true to indicate it was added successfully
        return true;
    }

    // Return a toString that follows the standard toString format:
    // ClassName{firstVariableName=valueOfVariable, secondVariableName=valueOfSecondVariable...
    // lastVariableName=valueOfLastVariable}

    // Must contain all the instance variables - not the static ones
    // Must contain the *exact* variable names, not logical/conceptual names
    public String toString(){
        StringBuilder sb = new StringBuilder("Schedule{");
        sb.append("scheduleId=");
        sb.append(this.scheduleId);
        sb.append(", scheduleDate=");
        sb.append(scheduleDate);
        sb.append(", screenings=");
        sb.append(screenings);
        sb.append("}");

        return sb.toString();
    }
}
