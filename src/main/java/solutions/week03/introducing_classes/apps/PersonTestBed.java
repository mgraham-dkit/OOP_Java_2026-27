package solutions.week03.introducing_classes.apps;

import solutions.week03.introducing_classes.entities.Person;

public class PersonTestBed {
    static void main(String[] args) {
        Person myPerson = new Person();

        if(myPerson.leftHanded){
            System.out.println(myPerson.firstName + " " + myPerson.secondName + ".");
        }else{
            System.out.println(myPerson.firstName.toUpperCase() + " " + myPerson.secondName.toUpperCase() + ".");
        }

    }
}
