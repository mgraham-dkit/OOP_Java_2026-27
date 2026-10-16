package inclass.week05_composition.apps;

import inclass.week05_composition.entities.BankAccount;

import java.util.ArrayList;
import java.util.Random;

public class BankApp {
    static void main(String[] args) {
        Random randomGenerator = new Random();
        ArrayList<BankAccount> accounts = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String name = "Name " + i;
            String accountId = "" + i;
            double balance = randomGenerator.nextDouble(-10, 500);

            BankAccount account = new BankAccount(name, accountId, balance);

            accounts.add(account);
        }

        for (BankAccount account : accounts) {
            account.display();
        }

        BankAccount second = accounts.get(1);
        //second.balance = second.balance * -1000;
        second.setBalance(second.getBalance() * 1000);

        for (BankAccount account : accounts) {
            account.display();
            System.out.println("Balance: €" + String.format("%.2f", account.getBalance()));
        }
    }
}
