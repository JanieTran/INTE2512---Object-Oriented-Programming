package Week7;

import java.io.RandomAccessFile;

public class TestRandomAccessFile {
    public static void main(String[] args) {
        try (RandomAccessFile inout = new RandomAccessFile("inout.dat","rw")) {
            // Clear the file
            inout.setLength(0);

            // Write new int to file
            for (int i = 0; i < 200; i++)
                inout.writeInt(i);

            // Get length of file
            System.out.println("Current file length: " + inout.length());

            // Move file pointer to the beginning
            inout.seek(0);
            System.out.println("Pointer position: " + inout.getFilePointer());

            // Read first number
            System.out.println("First number: " + inout.readInt());
            System.out.println("Pointer position: " + inout.getFilePointer());

            // Move pointer to third number
            inout.seek(2 * 4);
            System.out.println("Third number: " + inout.readInt());
            System.out.println("Pointer position: " + inout.getFilePointer());

            // Move pointer to tenth number
            inout.seek(9 * 4);
            System.out.println("Tenth number: " + inout.readInt());
            System.out.println("Pointer position: " + inout.getFilePointer());

            // Modify 11th number
            inout.writeInt(555);
            inout.seek(10 * 4);
            System.out.println("11th number: " + inout.readInt());

            // Append new number to the end
            inout.seek(inout.length());
            inout.writeInt(999);
            System.out.println("New length: " + inout.length());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
