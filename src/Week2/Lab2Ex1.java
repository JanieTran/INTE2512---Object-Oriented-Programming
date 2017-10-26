package Week2;

import static java.lang.Math.round;

public class Lab2Ex1 {
    public static void main(String[] args) {
        System.out.println("Miles\tKilometers\t\tKilometers\tMiles");
        double km, miles;
        for(int i = 1, j = 20; (i <= 10 && j <= 65); i++, j += 5) {
            km = round(i*1.609*1000)/1000.0;
            miles = round(j/1.609*1000)/1000.0;
            System.out.println(i + "\t\t" + km + "\t\t|\t\t" + j + "\t\t" + miles);
        }
    }
}
