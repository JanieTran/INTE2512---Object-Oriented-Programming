package Week7;

import java.io.Serializable;
import java.util.Date;

public class Loan implements Serializable {
    // PROPERTIES
    private double annualInterestRate;
    private int numYears;
    private double loanAmount;
    private Date loanDate;

    // CONSTRUCTORS

    // Default
    public Loan() {
        annualInterestRate = 2.5;
        numYears = 1;
        loanAmount = 1000;
    }

    // Constructor with details
    public Loan(double annualInterestRate, int numYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numYears = numYears;
        this.loanAmount = loanAmount;
        loanDate = new Date();
    }

    // GETTERS

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public int getNumYears() {
        return numYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    // SETTERS


    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setNumYears(int numYears) {
        this.numYears = numYears;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    // METHODS

    // Find monthly payment
    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate /
                (1 - (1 / Math.pow(1 + monthlyInterestRate, numYears * 12)));
        return monthlyPayment;
    }

    // Find total payment
    public double getTotalPayment() {
        return getMonthlyPayment() * numYears * 12;
    }
}
