package Week2;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Lab2Ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("LOAN SCHEDULE");
        System.out.print("Loan Amount: ");
        int amount = input.nextInt();
        System.out.print("Number of Years: ");
        int years = input.nextInt();
        System.out.print("Annual Interest Rate: ");
        float annualRate = input.nextFloat();

        int period = years * 12;
        float periodRate = (annualRate/12)/100;
        float discountFactor = (float) ((pow(1 + periodRate, period) - 1) / (periodRate * pow(1 + periodRate, period)));
        float monthly = amount / discountFactor;

        System.out.println();
        System.out.printf("Monthly Payment: %.2f \n", monthly);
        System.out.printf("Total Payment: %.2f", monthly * period);

        System.out.println();
        System.out.println("Payment#\tInterest\tPrincipal\tBalance");

        float balance = (float) amount;
        float interest, principal;
        for (int i = 1; i <= period; i++) {
            interest = periodRate * balance;
            principal = monthly - interest;
            balance -= principal;
            System.out.printf("%d\t\t\t%.2f\t\t%.2f\t\t%.2f", i, interest, principal, balance);
            System.out.println();
        }
    }
}
