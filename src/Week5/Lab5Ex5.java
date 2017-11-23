package Week5;

import java.util.Arrays;
import java.util.Scanner;

public class Lab5Ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("TRIANGLE");
        System.out.print("Enter three sides of the triangle: ");
        double[] sides = Arrays.stream(input.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        Triangle triangle = new Triangle(sides[0], sides[1], sides[2], "red", true);

        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Filled: " + triangle.isFilled());
    }
}
