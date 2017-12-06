package Week7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileStream {
    public static void main(String[] args) {
        // Write to stream file
        try (FileOutputStream output = new FileOutputStream("temp.dat")) {
            // Output values to the file
            for (int i = 1; i <= 10; i++)
                output.write(i);
        } catch (FileNotFoundException eFnF) {
            System.out.println(eFnF.getMessage());
        } catch (IOException eIO) {
            System.out.println(eIO.getMessage());
        }

        // Read stream file
        try (FileInputStream input = new FileInputStream("temp.dat")) {
            // Read values from file
            int value;
            while ((value = input.read()) != -1)
                System.out.print(value + " ");
        } catch (FileNotFoundException eFnF) {
            System.out.println(eFnF.getMessage());
        } catch (IOException eIO) {
            System.out.println(eIO.getMessage());
        }
    }
}