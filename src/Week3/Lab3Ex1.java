package Week3;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Lab3Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = parseInt(input.next());

        System.out.print("Enter a month: ");
        String month = input.next();

        int days;
        switch (month) {
            case "Feb":
                if (year % 4 == 0) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;

            case "Arp":
            case "Jun":
            case "Sep":
            case "Nov":
                days = 30;
                break;

            default:
                days = 31;
                break;
        }

        System.out.println(month + " " + year + " has " + days + " days");
    }
}
