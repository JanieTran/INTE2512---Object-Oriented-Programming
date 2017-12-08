// Write a program that determines if a list is already sorted in increasing order.
// The program should prompt the user to enter a list and displays whether the list is sorted or not.

package Week2_Loop_Array;

import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.util.Arrays.sort;

public class Lab2Ex9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten numbers: ");
        String[] strArr = input.nextLine().split(" ");

        int[] numArr = new int[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            numArr[i] = parseInt(strArr[i]);
        }

        boolean sorted = true;

        for (int i = 0; i < numArr.length - 1; i++) {
            if (numArr[i] > numArr[i + 1]) {
                sorted = false;
                break;
            }
        }

        if (sorted) {
            System.out.println("Your numbers are sorted in increasing order.");
        } else {
            System.out.println("Your numbers are not sorted in increasing order.");
            System.out.print("Here is your sorted numbers: ");
            sort(numArr);
            for (int i = 0; i < numArr.length; i++) {
                System.out.print(numArr[i] + " ");
            }
            System.out.println();
        }
    }
}
