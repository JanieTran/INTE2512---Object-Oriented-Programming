// Write a program to create a file named Exercise3.txt if it does not exist.
// Append new data to it if it already exists.
// Write 100 integers created randomly into the file using text IO. Integers are separated by a space.

package Week7;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Lab7Ex3 {
    public static void main(String[] args) {
        final String FILE = "Exercise3.txt";

        // Create file object
        File file = new File(FILE);

        try {
            // If file exists, append to file, else create new file
            PrintWriter output;
            if (file.exists()) {
                output = new PrintWriter(new FileWriter(file, true));
                System.out.println("Append");
            }
            else {
                output = new PrintWriter(file);
                System.out.println("New file");
            }

            // Write 100 random integers to file
            for (int i = 0; i < 100; i++)
                output.print((int) (Math.random() * 100 + 1) + " ");
            output.println();

            // Save file
            output.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
