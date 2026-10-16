package inclass.week05_composition.apps;

import inclass.week05_composition.entities.BankAccount;
import inclass.week05_composition.entities.Person;

import java.time.LocalDate;

public class BankingApp {
    static void main(String[] args) {
        LocalDate dob = LocalDate.of(2026, 10, 31);
        Person accountHolder = new Person("Jack Black", dob);
        System.out.println("Person details: ");
        System.out.println("Name: " + accountHolder.getName());
        System.out.println("Date of Birth: " + accountHolder.getDateOfBirth().getDayOfMonth() + "/" + accountHolder.getDateOfBirth().getMonth() + "/" + accountHolder.getDateOfBirth().getYear());

        BankAccount account = new BankAccount(accountHolder, "00001", 1500);
        account.display();
    }
}
