package inclass.week06_object_class.apps;

import inclass.week06_object_class.entities.Farmer;

import java.time.LocalDate;

public class ShowOffFarmers {
    static void main(String[] args) {
        Farmer hilda = new Farmer("Hilda", "Goat Farm", LocalDate.of(2011, 6, 23));

        Farmer john = new Farmer("", null, LocalDate.of(1966, 11, 28));

        System.out.println("Hilda: " + hilda.toString());
        System.out.println("John: " + john.toString());
    }
}
