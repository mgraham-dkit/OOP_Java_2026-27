package slide_examples.introducing_classes.entities;

public class House {
    // Attributes of a House
    public String windowType = "Bay";
    public int numRooms = 4;
    public String colour = "Beige";

    public void display(){
        System.out.println("Window type: " + this.windowType);
        System.out.println("Number of rooms: " + this.numRooms);
        System.out.println("Colour: " + this.colour);
    }

    public double calcPaintingCost(double paintPrice){
        return this.numRooms * (paintPrice * 5);
    }
}
