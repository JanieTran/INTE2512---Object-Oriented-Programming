// Write a program that creates five Loan objects and stores them in a file named Exercise6.dat

package Week7_BinaryIO;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Lab7Ex6 {
    public static void main(String[] args) {
        final String FILE = "Exercise6.dat";

        // Create 5 Loan objects
        Loan l1 = new Loan();
        Loan l2 = new Loan();
        Loan l3 = new Loan(0.2, 2, 2000);
        Loan l4 = new Loan(1.4, 4, 4000);
        Loan l5 = new Loan(2.1, 5, 3000);

        // Write to file
        try {
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(FILE));
            output.writeObject(l1);
            output.writeObject(l2);
            output.writeObject(l3);
            output.writeObject(l4);
            output.writeObject(l5);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
