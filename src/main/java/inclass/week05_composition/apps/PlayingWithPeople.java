package inclass.week05_composition.apps;

import inclass.week05_composition.entities.Person;

import java.time.LocalDate;

public class PlayingWithPeople {
    static void main(String[] args) {
        LocalDate millieDob = LocalDate.of(2010, 4, 13);
        Person millie = new Person("Millicent Bulstrode", millieDob);

        LocalDate chesterDob = LocalDate.of(1998, 5, 3);
        Person chester = new Person("Chester Bedingfield", chesterDob);

        Person nigel = null;

        boolean olderThanMillie = chester.isOlder(millie);
        if(olderThanMillie){
            System.out.println("Chester is older than Millie. After all, he is " + chester.calcAge() + " and she is " +
                    "only " + millie.calcAge());
        }else{
            System.out.println("Wow, apparently Millie is older than Chester! She is " + millie.calcAge() + " and " +
                    "he's only " + chester.calcAge());
        }

        System.out.println("What about " + nigel + ", are they younger or older than Millie?");
        if(millie.isOlder(nigel)){
            System.out.println("Millie is older than " + nigel);
        }else{
            System.out.println("Wow, " + nigel + " is older than Millie!");
        }
    }
}
