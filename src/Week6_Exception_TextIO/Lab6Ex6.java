package Week6_Exception_TextIO;

import java.util.Scanner;

public class Lab6Ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[100];

        for (int i = 0; i < 100; i++)
            arr[i] = (int) (Math.random() * 101);

        System.out.print("Enter index: ");
        try {
            int number = input.nextInt();
            System.out.println("Element at index " + number + ": " + arr[number]);
        } catch (Exception ArrayIndexOutOfBoundsException) {
            System.out.println("Out of Bounds");
        }
    }
}
