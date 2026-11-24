package solutions.lab_exams.ca1.entities;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;

public class Screening {
    // Spec states that only 5 types are allowable.
    // VALID_TYPES contains them in lower case (for consistent comparison without any case sensitivity)
    // UML diagram shows this with an underline, so it's a static variable
    // Variable name is in all caps, meaning it should be final
    // -> all caps = constant (static final) variable
    private static final ArrayList<String> VALID_TYPES = new ArrayList<>(
            Arrays.asList("standard", "private", "vip", "isense", "imax"));

    // UML diagram shows all variables marked as private
    // All names are exactly as shown
    // All types are exactly as shown
    private String screeningId;
    private String type;
    private String screeningTitle;
    private LocalDate screeningDate;
    private LocalTime screeningTime;

    public Screening(String screeningId, String type, String screeningTitle, LocalDate screeningDate, LocalTime screeningTime) {
        // Validate screening ID
        String prefix = "S_";
        // Spec states screening ID must exist and cannot be empty
        if(screeningId == null || screeningId.isBlank()){
            String defaultId = "S_DEFAULT";
            System.out.println("SCREENING ID CANNOT BE BLANK. RESETTING TO DEFAULT");
            // If it is, reset to specified default value
            screeningId = defaultId;
        } // Spec states all IDs must begin with "S_" so check that supplied ID starts with this
        // (Convert to upper case so we can ignore case)
        else if(!screeningId.toUpperCase().startsWith(prefix)){
            // If it doesn't start with S_, update it to include that at the start
            screeningId = prefix + screeningId;
            System.out.println("SCREENING ID MUST BEGIN WITH " + prefix + ". " +
                    "ADDING TO START OF SUPPLIED ID (Updated to: " + screeningId + ")");
        }

        // Validate type
        String defaultType = Screening.VALID_TYPES.getFirst();
        if(type == null || type.isBlank()){
            System.out.println("SCREENING TYPE CANNOT BE BLANK - " +
                    "RESETTING TO DEFAULT (" + defaultType + ")");
            type = defaultType;
        }else if(!VALID_TYPES.contains(type.toLowerCase())){
            System.out.println("SUPPLIED SCREENING TYPE IS NOT A VALID OPTION. " +
                    "RESETTING TO DEFAULT (" + defaultType + ")");
            type = defaultType;
        }

        // Validate date
        LocalDate today = LocalDate.now();
        if(screeningDate == null){
            System.out.println("SCREENING DATE CANNOT BE NULL - DEFAULTING TO TODAY (" + today + ")");
            screeningDate = today;
        }

        // Validate time
        LocalTime defaultTime = LocalTime.of(20, 0);
        if(screeningTime == null){
            System.out.println("SCREENING TIME CANNOT BE NULL - DEFAULTING TO 8PM (" + defaultTime + ")");
            screeningTime = defaultTime;
        }

        // VALIDATION COMPLETE
        // All bad data has been repaired
        // Store data in object
        this.screeningId = screeningId;
        this.type = type;
        this.screeningTitle = screeningTitle;
        this.screeningDate = screeningDate;
        this.screeningTime = screeningTime;
    }

    // Getter methods as shown in UML diagram
    // All methods are public, all methods return the type shown in the diagram
    // All methods are named exactly as shown in the diagram
    public String getScreeningId() {
        return screeningId;
    }

    public String getType() {
        return type;
    }

    public String getTitle() {
        return screeningTitle;
    }

    public LocalDate getScreenDate() {
        return screeningDate;
    }

    public LocalTime getScreenTime() {
        return screeningTime;
    }

    // Spec lists update type as returning a String and taking a String parameter
    public String updateType(String newType){
        // Validate incoming parameter using checkType
        if(!checkType(newType)){
            // Type is invalid - return null to indicate that no change was made (as per spec)
            return null;
        }

        // If the new type is valid, store the current type before we overwrite it
        String oldType = type;
        // Replace the old type with the new type information
        type = newType;
        // Return the old type (i.e. the type this screening was set to before now)
        return oldType;
    }

    public static boolean checkType(String category){
        // Check if supplied type exists or is blank (types must exist and cannot be blank)
        if(category == null || category.isBlank()){
            System.out.println("SCREENING TYPE CANNOT BE BLANK");
            // If it's invalid, return false
            return false;
        }
        // Check if supplied type matches one of the types in the valid types list
        // If it's not there, the type is invalid
        // (Convert the type to lowercase so it matches the case of the data in the valid types list)
        if(!VALID_TYPES.contains(category.toLowerCase())){
            System.out.println("SUPPLIED SCREENING TYPE IS NOT A VALID OPTION.");
            // If it's invalid, return false
            return false;
        }

        // If the supplied type passes all of the guard checks, it's valid - return true
        return true;
    }

    // Return a toString that follows the standard toString format:
    // ClassName{firstVariableName=valueOfVariable, secondVariableName=valueOfSecondVariable...
    // lastVariableName=valueOfLastVariable}

    // Must contain all the instance variables - not the static ones
    // Must contain the *exact* variable names, not logical/conceptual names
    public String toString(){
        StringBuilder sb = new StringBuilder("Screening{");
        sb.append("screeningId=");
        sb.append(this.screeningId);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", screeningTitle=");
        sb.append(this.screeningTitle);
        sb.append(", screeningDate=");
        sb.append(this.screeningDate);
        sb.append(", screeningTime=");
        sb.append(this.screeningTime);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        // If the types don't match, the objects can't be the same
        if (!(o instanceof Screening screening))
            return false;

        // Spec states two Screenings are equal if their IDs match, so check ID
        // ID cannot be treated as case-sensitive, so use equalsIgnoreCase
        return screeningId.equalsIgnoreCase(screening.screeningId);
    }

    @Override
    public int hashCode() {
        // hashCode should always use the same fields as equals
        // If equals is using a lowercase version of the id, then hashcode has to do the same
        // This is only safe because we don't allow nulls
        // If it was possible to have null values, we would need to check for null first
        return screeningId.toLowerCase().hashCode();
    }
}
