package inclass.week04.constructors.apps;

import inclass.week04.constructors.entities.Student;

public class StudentTestBed {
    static void main(String[] args) {
        Student tester01 = new Student("John Doe", 67, "67676767");
        System.out.println("Name: " + tester01.name);
        System.out.println("ID: " + tester01.id);
        System.out.println("Age: " + tester01.age);
        System.out.println("______________________");
        Student tester02 = new Student("Mandy", 35, "MandyVille1");
        System.out.println("Name: " + tester02.name);
        System.out.println("ID: " + tester02.id);
        System.out.println("Age: " + tester02.age);
        System.out.println("______________________");

        tester01.age = 21;
        System.out.println("Tester01 age: " + tester01.age);
        System.out.println("Tester02 age: " + tester02.age);


        System.out.println("______________________");
        System.out.println("Displaying my students:");
        tester01.display();
        tester02.display();
    }
}
