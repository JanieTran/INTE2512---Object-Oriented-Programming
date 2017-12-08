package Week7_BinaryIO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Lab7Ex5 {
    public static void main(String[] args) {
        final String INPUT = "HelloWorld.java";
        final String OUTPUT = "HelloWorld.utf";

        try {
            DataInputStream input = new DataInputStream(new FileInputStream(INPUT));
            DataOutputStream output = new DataOutputStream(new FileOutputStream(OUTPUT));
            output.writeUTF(input.readUTF());

            input.close();
            output.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
