// Write a program that reads the Loan objects from the file Exercise6.dat
// and displays the total loan amount.
// Suppose you don’t know how many Loan objects are there in the file,
// use EOFException to end the loop.

package Week7_BinaryIO;

import java.io.*;

public class Lab7Ex7 {
    public static void main(String[] args) {
        final String FILE = "Exercise6.dat";
        double totalAmount = 0;

        try {
            ObjectInputStream file = new ObjectInputStream(new FileInputStream(FILE));
            Loan obj;
            while (true) {
                obj = (Loan) file.readObject();
                totalAmount += obj.getLoanAmount();
            }
        } catch (EOFException e) {
            System.out.println("Total loan amount: " + totalAmount);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
