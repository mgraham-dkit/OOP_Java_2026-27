package inclass.week06_object_class.apps;

import inclass.week06_object_class.entities.Farmer;

import java.time.LocalDate;
import java.util.ArrayList;

public class ShowOffFarmers {
    public static void displayFarmers(ArrayList<Farmer> farmers){
        for (Farmer farmer : farmers) {
            System.out.println(farmer.getName() + ": " + farmer);
        }
    }

    static void main(String[] args) {
        // STUDENT B VERSION!!!

        ArrayList<Farmer> farmers = new ArrayList<>();

        Farmer hilda = new Farmer("Hilda", "Goat Farm", LocalDate.of(2011, 6, 23));

        Farmer john = new Farmer("", null, LocalDate.of(1966, 11, 28));

        farmers.add(hilda);
        farmers.add(john);

        displayFarmers(farmers);
    }
}
