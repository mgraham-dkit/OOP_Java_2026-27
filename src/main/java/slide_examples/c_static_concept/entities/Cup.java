package slide_examples.c_static_concept.entities;

public class Cup {
    private static double height;
    private static double width;

    private String slogan;
    private String colour;

    public Cup(String slogan, String colour){
        if(slogan == null){
            slogan = "";
        }
        if(colour == null || colour.isBlank()){
            colour = "white";
        }

        this.slogan = slogan;
        this.colour = colour;
    }

    public Cup(){
        this.slogan = "";
        this.colour = "white";
    }

    public void display(){
        System.out.println("General cup details:>");
        System.out.println("\tHeight: " + Cup.height + "cm, width: " + Cup.width + "cm.");
        System.out.println("Specific cup details:");
        System.out.println("\t\"" + this.slogan + "\" on a " + this.colour + " mug.");
    }

    public static boolean changeDimensions(double newWidth, double newHeight){
        if(newWidth <= 0 || newHeight <= 0){
            return false;
        }
        Cup.width = newWidth;
        Cup.height = newHeight;
        return true;
    }

}
