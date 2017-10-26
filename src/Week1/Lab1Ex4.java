package Week1;
import java.util.Scanner;

public class Lab1Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();
        System.out.println("You input " + number);

        int sum = 0;
        int digit = number % 10;
        System.out.println("Unit of " + number + " is " + digit);
        sum += digit;

        digit = (number/10) % 10;
        System.out.println("Dozens of " + number + " is " + digit);
        sum += digit;

        digit = (number/100) % 10;
        System.out.println("Hundreds of " + number + " is " + digit);
        sum += digit;

        digit = (number/1000) % 10;
        System.out.println("Thousands of " + number + " is " + digit);
        sum += digit;

        System.out.println("Sum of the digits: " + sum);
    }
}
