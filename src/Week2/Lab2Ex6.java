package Week2;

import static java.lang.Math.sqrt;

public class Lab2Ex6 {
    public static void main(String[] args) {
        double sum = 0.0;
        for(int i = 1; i <= 624; i++) {
            sum += 1.0 / (i + sqrt(i + 1));
        }

        System.out.println(sum);
    }
}
