package solutions.week09_inheritance_AnimalKingdom.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Cat extends Animal{
    private String hairLength;
    private ArrayList<String> vaccinations = new ArrayList<>();

    public Cat(String name, double weight, LocalDate dob, String hairLength, ArrayList<String> vaccinations){
        super(name, weight, dob);

        if(hairLength == null || hairLength.isBlank()){
            hairLength = "Medium";
        }

        if(vaccinations != null){
            for (String vaccination : vaccinations) {
                if(vaccination != null && !vaccination.isBlank()){
                    this.vaccinations.add(vaccination.toLowerCase());
                }
            }
        }
        this.hairLength = hairLength;
    }

    public String getHairLength() {
        return hairLength;
    }

    public ArrayList<String> getVaccinations() {
        return new ArrayList<String>(vaccinations);
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Cat cat)) return false;
        if (!super.equals(o)) return false;

        return hairLength.equals(cat.hairLength) && vaccinations.equals(cat.vaccinations);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + hairLength.hashCode();
        result = 31 * result + vaccinations.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "hairLength='" + hairLength + '\'' +
                ", vaccinations=" + vaccinations +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", dob=" + dob +
                '}';
    }

    public boolean hasVaccination(String vaccination){
        if(vaccination == null || vaccination.isBlank()){
            throw new IllegalArgumentException("Vaccinations cannot be null/empty");
        }

        return vaccinations.contains(vaccination.toLowerCase());
    }
}
