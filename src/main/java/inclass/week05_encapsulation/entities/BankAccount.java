package inclass.week05_encapsulation.entities;

public class BankAccount {
    private double balance = 0;
    public String name;
    public String accountId;

    public BankAccount(String name, String accountId){
        this.name = name;
        this.accountId = accountId;
    }

    public BankAccount(String name, String accountId, double balance){
        if(name == null || name.isBlank()){
            name = "UNKNOWN";
        }

        if(balance < 0){
            System.out.println("Balance updated from " + balance + " to 0");
            balance = 0;
        }

        this.name = name;
        this.accountId = accountId;
        this.balance = balance;
    }

    public void display(){
        System.out.println(this.accountId + ": " + this.name + " has €" + this.balance);
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
}
