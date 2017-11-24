package Week6;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lab6Ex8 {
    public static void main(String[] args) {
        File fileToScan = new File("text.txt");
        String stringToDel = "this";

        try (Scanner fileScan = new Scanner(fileToScan);
             PrintWriter fileWrite = new PrintWriter("newtext.txt")) {
            while (fileScan.hasNext()) {
                String s = fileScan.next();
                if (!s.equals(stringToDel))
                    fileWrite.print(s + " ");
            }
        } catch (Exception FileNotFoundException) {}


    }
}
