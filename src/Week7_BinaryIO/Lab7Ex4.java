package Week7_BinaryIO;

import java.io.File;
import java.io.FileOutputStream;

public class Lab7Ex4 {
    public static void main(String[] args) {
        final String FILE = "Exercise4.dat";

        // Create file object
        File file = new File(FILE);

        try {
            FileOutputStream output;

            // If file exists, append to file, else create new file
            if (file.exists())
                output = new FileOutputStream(file,true);
            else
                output = new FileOutputStream(file);

            // Write 100 random integers to file
            for (int i = 0; i < 100; i++)
                output.write((int) (Math.random() * 100 + 1));

            // Close file
            output.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
