// Write a program that reads the integers between 1 and 100 and
// counts the occurrences of each. Assume the input ends with 0.

package Week2;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Lab2Ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter integers between 1 and 100: ");
        String[] strArr = input.nextLine().split(" ");
        int[] numArr = new int[strArr.length];
        for(int i = 0; i < strArr.length; i++) {
            numArr[i] = parseInt(strArr[i]);
        }

        int currentNum = 0;
        for(int i = 0; i < numArr.length - 1; i++) {
            currentNum = numArr[i];
            int count = 1;
            for(int j = i + 1; j < numArr.length; j++) {
                if (numArr[j] == currentNum) {
                    count ++;
                }
            }
            if (count == 1) {
                System.out.println(currentNum + " occurs 1 time");
            } else {
                System.out.println(currentNum + " occurs " + count + " times");
            }
        }

    }
}
