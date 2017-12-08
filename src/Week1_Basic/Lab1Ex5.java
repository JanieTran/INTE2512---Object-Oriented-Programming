package Week1_Basic;

import java.util.Scanner;

public class Lab1Ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENERGY NEEDED TO HEAT WATER");

        System.out.print("Enter mass of water: ");
        double mass = input.nextDouble();

        System.out.print("Enter initial temperature: ");
        double ini = input.nextDouble();

        System.out.print("Enter final temperature: ");
        double fin = input.nextDouble();

        double energy = mass * (fin - ini) * 4184;
        System.out.println("Energy needed to heat up " + mass + " kg of water from " + ini + " degree to " + fin + " degree is " + energy + "J.");
    }
}
