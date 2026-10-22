package inclass.week05_composition.entities;

import java.time.LocalDate;

public class BankAccount {
    private double balance = 0;
    private Person owner;
    public String accountId;
    private boolean childAccount = false;

    public BankAccount(Person owner, String accountId){
        if(owner == null){
            System.out.println("NULL OWNER!!! UPDATE IMMEDIATELY");
            this.owner = new Person("NULL OWNER!!!", LocalDate.now());
        }else if(owner.calcAge() < 18){
            System.out.println("Child account required!");
            childAccount = true;
        }
        this.accountId = accountId;
    }

    public BankAccount(Person owner, String accountId, double balance){
        if(owner == null){
            System.out.println("NULL OWNER!!! UPDATE IMMEDIATELY");
            this.owner = new Person("NULL OWNER!!!", LocalDate.now());
        }else if(owner.calcAge() < 18){
            System.out.println("Child account required!");
            childAccount = true;
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
        String childStatus = "";
        if(childAccount){
            childStatus = " [CHILD ACCOUNT]";
        }
        System.out.println(this.accountId + ": " + this.owner.getName() + " has €" + String.format("%.2f",
                this.balance) + childStatus);

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
        return "BankAccount{owner:" + this.owner + ", accountId:" + this.accountId + ", balance:" + this.balance +
                ", childStatus=" + childAccount + "}";
    }
}
