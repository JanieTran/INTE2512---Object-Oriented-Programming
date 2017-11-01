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

        String currentNum;

        for(int i = 0; i < strArr.length; i++) {
            currentNum = strArr[i];
            int count = 1;
            for(int j = i + 1; j < strArr.length; j++) {
                if (strArr[j].equals(currentNum)) {
                    count ++;
                    strArr[j] = "";
                }
            }
            if (strArr[i] != "") {
                if (count == 1) {
                    System.out.println(currentNum + " occurs 1 time");
                } else {
                    System.out.println(currentNum + " occurs " + count + " times");
                }
            }
        }

    }
}
