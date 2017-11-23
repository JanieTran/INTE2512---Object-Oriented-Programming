package Week5;

import java.math.BigInteger;

public class Rational extends Number implements Comparable<Rational> {
    // PROPERTIES

    private BigInteger numerator = new BigInteger("0");
    private BigInteger denominator = new BigInteger("1");

    // CONSTRUCTORS

    public Rational() {
    }

    public Rational(long numerator, long denominator) {
        long gcd = gcd(numerator, denominator);
        this.numerator = BigInteger.valueOf(((denominator > 0) ? 1 : -1 * numerator / gcd));
        this.denominator = BigInteger.valueOf(Math.abs(denominator) / gcd);
    }

    // Find GCD
    private static long gcd(long n, long d) {
        long n1 = Math.abs(n);
        long n2 = Math.abs(d);
        int gcd = 1;
        for (int k = 1; k <= n1 && k <= n2; k++) {
            if (n1 % k == 0 && n2 % k == 0) gcd = k;
        }
        return gcd;
    }

    // GETTERS

    public BigInteger getNumerator() {
        return numerator;
    }

    public BigInteger getDenominator() {
        return denominator;
    }

    // METHODS

    public Rational add(Rational num) {

    }
}
