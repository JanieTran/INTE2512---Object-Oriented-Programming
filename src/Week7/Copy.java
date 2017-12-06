package Week7;

import java.io.*;
import java.util.Scanner;

public class Copy {
    public static void main(String[] args) {
        Scanner kbScan = new Scanner(System.in);

        System.out.println("File name to be copied: ");
        File sourceFile = new File(kbScan.nextLine());
        System.out.println("Target file name: ");
        File targetFile = new File(kbScan.nextLine());

        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(2);
        }

        if (targetFile.exists()) {
            System.out.println("Target file " + args[1] + " already exists");
            System.exit(3);
        }

        try (
        BufferedInputStream input = new BufferedInputStream(new FileInputStream(sourceFile));
        BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(targetFile))
        ) {
            int r, numberOfBytesCopied = 0;
            while ((r = input.read()) != -1) {
                output.write((byte) r);
                numberOfBytesCopied ++;
            }
            System.out.println(numberOfBytesCopied + " bytes copied");
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println("Read from " + targetFile);

        try {
            FileInputStream target = new FileInputStream(targetFile);
            int a;
            while ((a = target.read()) != -1)
                System.out.print(a + " ");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
