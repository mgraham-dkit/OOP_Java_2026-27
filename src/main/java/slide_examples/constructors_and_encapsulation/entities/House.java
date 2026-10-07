package slide_examples.constructors_and_encapsulation.entities;

public class House {
    // Attributes of a House - these are all private to ensure they cannot be accessed from outside this class!
    private String windowType;
    private int numRooms;
    private String colour;

    // public makes the constructor available to the entire codebase
    // House is the name of the class - constructor name must match class name
    // Parameters listed here must all be supplied when you create an instance
    public House(String windowType, int numRooms, String colour){
        // Since the parameters have the same name as the instance variables,
        // we use this. to indicate we are using the version belonging to the
        // CURRENT object (i.e. the object being used right now)

        // Store the value supplied as a parameter in the object's instance variable - this lets us keep it!
        this.windowType = windowType;
        this.numRooms = numRooms;
        this.colour = colour;
    }

    public void display(){
        System.out.println("Window type: " + this.windowType);
        System.out.println("Number of rooms: " + this.numRooms);
        System.out.println("Colour: " + this.colour);
    }

    public double calcPaintingCost(double paintPrice){
        return this.numRooms * (paintPrice * 5);
    }

    // Method is called getNumRooms because we are accessing/retrieving the numRooms attribute from the object
    // We don't take any parameters as we don't need them - all the information we need is already in the object
    public int getNumRooms(){
        // Return the numRooms variable so the calling code can use it
        return numRooms;
    }

    // Take in the new number of rooms this house should contain
    // As a rule, setters do not return a value
    // Method is called setNumRooms because we are setting the numRooms attribute in the object
    public void setNumRooms(int numRooms){
        // Only update this house to save the number of rooms if the value is legal (i.e > 0).
        // This is because a House can never have no, or a negative number of rooms.
        if(numRooms > 0){
            // Set the number of rooms in THIS house to be the supplied value
            this.numRooms = numRooms;
        }
    }
}
