// Write a program that prompts the user to enter an integer from 1 to 15
// and displays a pyramid, as shown in the following sample run

package Week2;

import java.util.Scanner;

public class Lab2Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer from 1 to 15: ");
        int number = input.nextInt();

        for(int i = 1; i <= number; i++) {
            for(int j = number; j >= 1; j--) {
                if (j <= i) {
                    if (j < 10) {
                        System.out.print(j + "  ");
                    } else {
                        System.out.print(j + " ");
                    }
                } else {
                    System.out.print("   ");
                }
            }
            for(int j = 2; j <= number; j++) {
                if (j <= i) {
                    if (j < 10) {
                        System.out.print(j + "  ");
                    } else {
                        System.out.print(j + " ");
                    }
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

//        // ALTERNATIVE SOLUTION
//        for(int i = 1; i <= number; i++) {
//            for(int j = 1; i <= number - i; i++) {
//                System.out.printf("%3s", " ");
//            }
//            for(int j = number; j >= 1; j--) {
//                System.out.printf("%3s", j);
//            }
//        }

    }
}
