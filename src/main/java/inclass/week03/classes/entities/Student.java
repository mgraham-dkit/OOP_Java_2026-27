package inclass.week03.classes.entities;

public class Student {
    public String name = "John Doe";
    public int age = 67;
    public String id = "D0676767";

    public void display(){
        System.out.println(this.id + ": " + this.name + " is " + this.age);
    }
}
