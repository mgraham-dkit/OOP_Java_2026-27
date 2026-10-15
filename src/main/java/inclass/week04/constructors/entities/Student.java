package inclass.week04.constructors.entities;

public class Student {
    public String name;
    public int age = 18;
    public String id;

    public Student(String name, int age, String id){
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public Student(String name, String id){
        this.name = name;
        this.id = id;

        this.age = 18;
    }

    public void display(){
        System.out.println(this.id + ": " + this.name + " is " + this.age);
    }
}
