// Assume that each character of “ABCDEFGHIJKLMNOPQRSTUVWXYZ”
// is substituted by a corresponding in “QTGABCDEFHIJKLMNOPRSUVXYZ”.
// Write a program that prompts the user for a plain text
// then displays the cipher text which is encrypted it using the above encryption scheme.

package Week3;

import java.util.Scanner;

public class Lab3Ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final String ALP = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final String CYP = "QTGABCDEFHIJKLMNOPRSUVXYZW";

        char[] alpArr = ALP.toLowerCase().toCharArray();
        char[] cypArr = CYP.toLowerCase().toCharArray();

        System.out.println("ENCRYPTOR");
        System.out.print("Enter plain text: ");
        String text = input.nextLine();

        char[] textArr = text.toLowerCase().toCharArray();
        String code = "";

        for (char a : textArr) {
            boolean isChar = false;

            for (int i = 0; i < alpArr.length; i++) {
                if ((int)a == (int)alpArr[i]) {
                    code += cypArr[i];
                    isChar = true;
                    break;
                }
            }

            if (!isChar) {
                code += a;
            }
        }

        System.out.println("Encrypted text: " + code);
    }
}
