package inclass.week03.classes.apps;

import inclass.week03.classes.entities.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class ListsOfStudents {
    static void main(String[] args) {
        // To create a list that can hold our new type, we specify it in the <>s
        ArrayList<Student> students = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter student " + (i+1) + ":> ");

            // ********************************************************************
            // BUILDING LISTS OF OBJECTS
            // ********************************************************************
            // If you need to create and store *multiple* students in a list, the following steps need to be repeated (i.e. looped):
            // - Data entry
            // - Object creation
            // - Save the object

            // DATA ENTRY:::
            // To create a Student with user-specified data, ask the user for each piece we need to make a Student (name,
            // age, id)
            System.out.print("Student ID: ");
            String id = input.nextLine();

            System.out.print("Student name: ");
            String name = input.nextLine();

            System.out.print("Age: ");
            int age = input.nextInt();
            input.nextLine();

            // OBJECT CREATION:::
            // Create the new Student
            Student s = new Student();

            // Store the values the user has entered within our new Student
            s.id = id;
            s.name = name;
            s.age = age;

            // SAVING THE OBJECT:::
            // Save the new student in the list so we have access to it for the rest of the program
            students.add(s);

            s.display();
        }
        // ********************************************************************
        // WORKING WITH LISTS OF OBJECTS:
        // ********************************************************************
        // Loop through the list of student objects
        // All the code within the loop will be run with each student object

        // EXAMPLE ACTION: Displaying all students
        // Loop through each student and call its display method
        for (int i = 0; i < students.size(); i++) {
            // Get the current student in the list (the list at the current position)
            Student current = students.get(i);

            // Call display() on the current student so we can see THIS student's info
            current.display();
        }

        // EXAMPLE ACTION: Finding the oldest student

        // Set the oldest age we've seen to -1 (as we haven't seen any students yet, we don't have a real age to use)
        int maxAge = -1;
        // Set the oldest student to null (as we haven't seen any students yet, we don't have a real student to use)
        Student oldest = null;
        // Loop through each student in the list
        for (int i = 0; i < students.size(); i++) {
            // Get the current student
            Student current = students.get(i);

            // If the current student is older than the oldest age we've seen
            if(current.age > maxAge){
                // Update maxAge to be this student's age (because this student is older)
                maxAge = current.age;
                // Save the current student as the oldest one we've found
                oldest = current;
            }
        }

        // If we have found the oldest student, it won't be set to null anymore
        if(oldest != null){
            // Ask the oldest student to display its information
            System.out.print("Oldest student:> ");
            oldest.display();
        }
    }
}
