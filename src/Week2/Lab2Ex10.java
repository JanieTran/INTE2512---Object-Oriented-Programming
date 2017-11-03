//Suppose the weekly hours for all employees are stored in a two-dimensional array.
// Each row records an employee’s seven-day work hours with seven columns.
// For example, the following array stores the work hours for eight employees.
// Write a program that displays employees and their total hours in decreasing order of the total hours.

package Week2;

import java.util.Arrays;
import java.util.Collections;

public class Lab2Ex10 {
    public static void main(String[] args) {
        int[][] weekly = new int[8][7];

        for (int i = 0; i < 8; i++) {
            System.out.print("Employee " + i + " ");
            for (int j = 0; j < 7; j++) {
                weekly[i][j] = (int)(Math.random() * 10);
                System.out.print(weekly[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        int[] totalHours = new int[8];
        for (int emp = 0; emp < 8; emp++) {
            for (int day = 0; day < 7; day++) {
                totalHours[emp] += weekly[emp][day];
            }
            System.out.print(totalHours[emp] + " ");
        }
        System.out.println();

        // Create integer object in order to sort in descending order
        Integer[] tHours = new Integer[8];
        for (int i = 0; i < 8; i++) {
            tHours[i] = totalHours[i];
        }

        // The following function does not take array of primitives
        Arrays.sort(tHours, Collections.reverseOrder());

        for (int i = 0; i < 8; i++) {
            boolean already = false;
            for (int j = 0; j < 8; j++) {
                if (tHours[i] == totalHours[j] && !already) {
                    System.out.println("Employer " + j + " works " + tHours[i] + " hours");
                    already = true;
                }
            }
        }
    }
}
