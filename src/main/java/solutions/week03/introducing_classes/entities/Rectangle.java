package solutions.week03.introducing_classes.entities;

public class Rectangle {
    public double length = 4;
    public double width = 5;
    public String colour = "Blue";

    public void display(){
        System.out.println("Rectangle{length=" + length + ", width="+ width + ", colour="+ colour+"}");
    }

    public double calcArea(){
        double area = length * width;
        return area;
    }
}
