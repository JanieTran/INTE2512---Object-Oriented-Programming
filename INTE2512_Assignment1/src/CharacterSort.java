/*
  RMIT University Vietnam
  Course: INTE2512 Object-Oriented Programming
  Semester: 2017C
  Assignment: 1
  Author: Tran Thi Hong Phuong
  ID: s3623386
  Created date: 06/11/2017

  Throughout the progress of this assignment, took some reference from various sources on:
  - Regular expression to check string pattern: https://stackoverflow.com/questions/13201497/string-contains-only-alphabets
  - Sorting array: https://stackoverflow.com/questions/33462923/sort-elements-of-an-array-in-ascending-order-java
*/

import java.util.Scanner;

import static java.lang.Character.toLowerCase;

public class CharacterSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get first input from user
        System.out.print("Enter a string: ");
        String str = input.next();

        // Run the program as long as input is not "-1"
        while (!str.equals("-1")) {

            // Prompt the user to input until the string is valid
            while (!str.matches("[a-zA-z]+")) {
                System.out.println("Invalid. Input string can only contain letters.");
                System.out.print("Enter a string: ");
                str = input.next();
            }

            // Create an array containing characters of the string to access each character separately
            char[] strArr = str.toCharArray();
            char temp;

            // Sorting algorithm
            for (int i = 0; i < strArr.length - 1; i++) {
                for (int j = i + 1; j < strArr.length; j++) {
                    // Compare characters using ASCII code
                    // If ASCII value of element at index j is less than that at index i,
                    // they will swap position inside the array with each other
                    if ((int)toLowerCase(strArr[j]) < (int)toLowerCase(strArr[i])) {
                        temp = strArr[j];
                        strArr[j] = strArr[i];
                        strArr[i] = temp;
                    }
                }
            }

            // Print out the string with sorted characters
            System.out.print("Characters sorted: ");
            for (int i = 0; i < strArr.length; i++) {
                System.out.print(strArr[i]);
            }
            System.out.println();

            // Prompt the user to enter a new string
            System.out.print("Enter a string: ");
            str = input.next();
        }

        // Program terminated when user inputs "-1"
        System.out.println("Program exits. Goodbye!!!");
    }
}