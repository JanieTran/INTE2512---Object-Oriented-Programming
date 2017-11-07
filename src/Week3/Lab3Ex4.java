// Write a simple calculator program that can
// perform addition (+) and subtraction (-) for
// two integers from the command line.

package Week3;

import java.util.Scanner;

public class Lab3Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("CALCULATOR");
        System.out.print("Enter first operand: ");
        int op1 = input.nextInt();
        System.out.print("Enter operator: ");
        String operator = input.next();
        System.out.print("Enter second operand: ");
        int op2 = input.nextInt();

        int result = operator.equals("+") ? (op1 + op2) : (op1 - op2);
        System.out.println("Result: " + result);
    }
}
