// Write a program that displays all the numbers from 100 to 200,
// ten per line, that are divisible by 5 or 6, but not both.
// Numbers are separated by exactly one space.

package Week2;

public class Lab2Ex2 {
    public static void main(String[] args) {
        int j = 1;
        for(int i = 100; i <= 200; i++) {
            if ((i % 5 == 0 || i % 6 == 0) && !(i % 5 == 0 && i % 6 == 0)) {
                System.out.print(i);
                if (j == 10) {
                    System.out.print("\n");
                    j = 1;
                } else {
                    System.out.print(" ");
                    j++;
                }
            }
        }
    }
}
