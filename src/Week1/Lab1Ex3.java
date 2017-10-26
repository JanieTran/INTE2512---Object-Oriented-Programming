package Week1;
import java.util.Scanner;

public class Lab1Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Celsius degree: ");
        double celsius = input.nextDouble();
        double fahrenheit = (9.0/5) * celsius + 32;
        System.out.println(celsius + " Celsius degree equals to " + fahrenheit + " Fahrenheit degree.");
    }
}
