package Week5;

import java.util.Arrays;
import java.util.Scanner;

public class Lab5Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("COMPLEX NUMBER");
        System.out.print("Enter first complex number: ");
        double[] inNum = Arrays.stream(input.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        Complex com1 = new Complex(inNum[0], inNum[1]);

        System.out.print("Enter second complex number: ");
        inNum = Arrays.stream(input.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        Complex com2 = new Complex(inNum[0], inNum[1]);

        System.out.printf("(%s) + (%s) = %s\n", com1.toString(), com2.toString(), com1.add(com2).toString());
        System.out.printf("(%s) - (%s) = %s\n", com1.toString(), com2.toString(), com1.subtract(com2).toString());
        System.out.printf("(%s) * (%s) = %s\n", com1.toString(), com2.toString(), com1.multiply(com2).toString());
        System.out.printf("(%s) / (%s) = %s\n", com1.toString(), com2.toString(), com1.divide(com2).toString());
        System.out.printf("|(%s)| = %.2f\n", com1.toString(), com1.abs());
    }
}
