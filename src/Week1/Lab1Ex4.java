package Week1;
import java.util.Scanner;

import static java.lang.Math.pow;

public class Lab1Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get number from user
        System.out.print("Enter a number between 0 and 1000: ");
        String numberStr = input.next();

        int sum = 0;
        int numOfDigit = numberStr.length();
        int number = Integer.parseInt(numberStr);
        int digit;

//        // Get the last digit
//        int digit = number % 10;
//        System.out.println("Unit of " + number + " is " + digit);
//        sum += digit;
//
//        // Get the second last digit
//        digit = (number/10) % 10;
//        System.out.println("Dozens of " + number + " is " + digit);
//        sum += digit;
//
//        // Get the third digit
//        digit = (number/100) % 10;
//        System.out.println("Hundreds of " + number + " is " + digit);
//        sum += digit;
//
//        // Get the fourth digit
//        digit = (number/1000) % 10;
//        System.out.println("Thousands of " + number + " is " + digit);
//        sum += digit;

        for(int i = 0; i < numOfDigit; i++) {
            digit = (number / (int)(pow(10,i))) % 10;
            System.out.println(digit);
            sum += digit;
        }

//        // OTHER SOLUTION
//        int i;
//        while(i != 0) {
//            digit = i % 10;
//            sum += digit;
//            i /= 10;
//        }

        // Print out the result
        System.out.println();
        System.out.println("Sum of the digits: " + sum);
    }
}
