package Week4_Class1;

import java.util.Date;

public class Lab4Ex5 {
    public static void main(String[] args) {
        Account acc1 = new Account(191, 10000);
        System.out.println(acc1.getBalance());
        acc1.withdraw(2000);
        System.out.println(acc1.getBalance());
        System.out.println(acc1.getDateCreated());
    }
}

class Account {
    // DATA FIELDS
    private int id = 0;
    private double balance = 0, annualInterestRate = 0;
    private Date dateCreated;

    // CONSTRUCTORS
    public Account() {
        this.dateCreated = new Date();
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }

    // GETTERS
    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    // SETTERS
    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate / 100;
    }

    // METHODS
    public double getMonthlyInterestRate() {
        return getAnnualInterestRate() / 12;
    }

    public double getMonthlyInterest() {
        return getMonthlyInterestRate() * balance;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }
}