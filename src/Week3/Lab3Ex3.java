// A palindrome is a string which reads the same backward as forward
// when ignoring punctuation characters, whitespace characters and case difference.

// Write a program that repeatedly prompts the user for a string
// and displays if it’s a palindrome or not.
// The program quits when the user inputs “N” or “n” when being prompted “Do you want to continue? (Y/N) ”.

package Week3;

import java.util.Scanner;

public class Lab3Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("PALINDROME DETECTOR");
        char[] strArr;
        boolean palin = true;
        String str = "", result;

        while (!str.matches("(N|n)")) {
            System.out.print("Enter a string: ");
            str = input.nextLine();
            str = str.toLowerCase();
            str = str.replaceAll("[^a-zA-Z]","");
            strArr = str.toCharArray();
            int j = strArr.length - 1;

            for (int i = 0; i < strArr.length; i++) {
                if (strArr[i] != strArr[j]) {
                    palin = false;
                    break;
                }
                j--;
            }

            result = palin ? "Your string is a palindrome" : "Your string is not a palindrome";
            System.out.println(result);

            System.out.print("Do you want to continue? (Y/N) ");
            str = input.nextLine();
        }
    }
}
