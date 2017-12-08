// Write a program that prompts the user for a string
// and then displays the reverse of that string.

package Week3_String_RegEx;

import java.util.Scanner;

public class Lab3Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        char[] strArr = str.toCharArray();

        System.out.print("Reversed string: ");
        for (int i = strArr.length - 1; i >= 0; i--) {
            System.out.print(strArr[i]);
        }
    }
}
