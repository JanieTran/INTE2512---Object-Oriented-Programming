package Week5;

import java.util.Date;

public class Transaction {
    // PROPERTIES
    private char type;
    private double amount;
    private double balance;
    private Date date;
    private String description;

    // GETTERS

    public char getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public double getBalance() {
        return balance;
    }

    public Date getDate() {
        return date;
    }

    // CONSTRUCTOR
    public Transaction(char type, double amount, double balance, String description) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        this.date = new Date();
    }
}
