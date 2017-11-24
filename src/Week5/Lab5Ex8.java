package Week5;

import java.math.BigInteger;

public class Lab5Ex8 {
    public static void main(String[] args) {
        Rational rat1 = new Rational(BigInteger.valueOf(1), BigInteger.valueOf(2));
        System.out.println("Numerator: " + rat1.getNumerator());
        System.out.println("Denominator: " + rat1.getDenominator());

        Rational rat2 = new Rational(BigInteger.valueOf(6), BigInteger.valueOf(2));
        System.out.println("Addtion: " + rat1.add(rat2).toString());
        System.out.println("Subtration: " + rat1.subtract(rat2).toString());
        System.out.println("Multiply: " + rat1.multiply(rat2).toString());
        System.out.println("Divide: " + rat1.divide(rat2).toString());
        System.out.println("Compare: " + rat1.compareTo(rat2));
    }
}
