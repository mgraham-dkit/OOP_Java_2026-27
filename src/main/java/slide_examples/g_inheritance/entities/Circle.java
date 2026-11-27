package slide_examples.g_inheritance.entities;

public class Circle {
    protected double radius;
    protected String colour;

    public Circle(double radius, String colour) {
        if(radius < 0){
            radius = 0;
        }
        if(colour == null || colour.isBlank()){
            colour = "None";
        }

        this.radius = radius;
        this.colour = colour;
    }

    public double calcArea(){
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", colour='" + colour + '\'' +
                '}';
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Circle circle)) return false;

        return Double.compare(radius, circle.radius) == 0 && colour.equals(circle.colour);
    }

    @Override
    public int hashCode() {
        int result = Double.hashCode(radius);
        result = 31 * result + colour.hashCode();
        return result;
    }

    public double getRadius() {
        return radius;
    }

    public void display(){
        // Ternary operator - if statement in one line, useful if you are customising text outputs
        // Structure: condition ? result if true : result if false
        String displayColour = !colour.equals("None") ? "is " + this.colour.toLowerCase()  : "has no colour";

        System.out.println("This " + this.getClass().getSimpleName() + " has a radius of " + this.radius +
                        ", an area of " + this.calcArea() + " and " + displayColour);
    }

}
