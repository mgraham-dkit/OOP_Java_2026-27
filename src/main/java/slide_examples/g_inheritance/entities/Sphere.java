package slide_examples.g_inheritance.entities;

public class Sphere extends Circle{
    public Sphere(double radius, String colour){
        super(radius, colour);
    }

    @Override
    public double calcArea(){
        // Could also do:
        // return 4 * (radius * radius * Math.PI);
        return 4 * super.calcArea();
    }

    public double calcVolume(){
        return (4.0/3) * Math.PI * (radius * radius * radius);
    }

    public void display(){
        super.display();
        System.out.println("The volume of this sphere is " + calcVolume());
    }
}