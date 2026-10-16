package inclass.week05_composition.entities;

import java.time.LocalDate;

public class BankAccount {
    private double balance = 0;
    private Person owner;
    public String accountId;

    public BankAccount(Person owner, String accountId){
        if(owner == null){
            System.out.println("NULL OWNER!!! UPDATE IMMEDIATELY");
            this.owner = new Person("NULL OWNER!!!", LocalDate.now());
        }
        this.accountId = accountId;
    }

    public BankAccount(Person owner, String accountId, double balance){
        if(owner == null){
            System.out.println("NULL OWNER!!! UPDATE IMMEDIATELY");
            this.owner = new Person("NULL OWNER!!!", LocalDate.now());
        }

        if(balance < 0){
            System.out.println("Balance updated from " + balance + " to 0");
            balance = 0;
        }

        this.owner = owner;
        this.accountId = accountId;
        this.balance = balance;
    }

    public void display(){
        System.out.println(this.accountId + ": " + this.owner.getName() + " has €" + String.format("%.2f", this.balance));

    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double newBalance){
        if(newBalance < 0){
            System.out.println("Balance cannot be updated - account cannot contain a negative number");
        }else {
            this.balance = newBalance;
        }
    }

    public String toString(){
        return "BankAccount{owner:" + this.owner + ", accountId:" + this.accountId + ", balance:" + this.balance + "}";
    }
}
