package Week5_Class2;

import java.math.BigInteger;

public class Rational extends Number implements Comparable<Rational> {
    // PROPERTIES

    private BigInteger numerator = new BigInteger("0");
    private BigInteger denominator = new BigInteger("1");

    // CONSTRUCTORS

    public Rational() {
    }

    public Rational(BigInteger numerator, BigInteger denominator) {
        BigInteger gcd = gcd(numerator, denominator);

        this.numerator = (denominator.compareTo(BigInteger.ZERO) > 0 ?
                BigInteger.ONE : BigInteger.ONE.negate())
                .multiply(numerator.divide(gcd));

        this.denominator = denominator.abs().divide(gcd);
    }

    // Find GCD
    private static BigInteger gcd(BigInteger n, BigInteger d) {
        BigInteger n1 = n.abs();
        BigInteger n2 = d.abs();
        BigInteger gcd = BigInteger.valueOf(1);
        for (int k = 1; k <= n1.intValue() && k <= n2.intValue(); k++) {
            if (n1.mod(BigInteger.valueOf(k)).equals(BigInteger.valueOf(0))
                    && n2.mod(BigInteger.valueOf(k)).equals(BigInteger.valueOf(0))) {
                gcd = BigInteger.valueOf(k);
            }
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
        BigInteger n = numerator.multiply(num.denominator)
                .add(denominator.multiply(num.numerator));
        BigInteger d = denominator.multiply(num.denominator);
        return new Rational(n, d);
    }

    public Rational subtract(Rational num) {
        BigInteger n = numerator.multiply(num.denominator)
                .subtract(denominator.multiply(num.numerator));
        BigInteger d = denominator.multiply(num.denominator);
        return new Rational(n, d);
    }

    public Rational multiply(Rational num) {
        BigInteger n = numerator.multiply(num.numerator);
        BigInteger d = denominator.multiply(num.denominator);
        return new Rational(n, d);
    }

    public Rational divide(Rational num) {
        BigInteger n = numerator.multiply(num.denominator);
        BigInteger d = denominator.multiply(num.numerator);
        return new Rational(n, d);
    }

    @Override
    public String toString() {
        if (denominator.equals(BigInteger.ONE))
            return numerator.toString();
        else
            return String.format("%d/%d", numerator, denominator);
    }

    @Override
    public boolean equals(Object other) {
        if ((this.subtract((Rational)other)).getNumerator().equals(BigInteger.ZERO))
            return true;
        else return false;
    }

    // IMPLEMENT ABSTRACT METHODS

    @Override
    public int compareTo(Rational o) {
        if (this.subtract(o).getNumerator().compareTo(BigInteger.ZERO) > 0)
            return 1;
        else if (this.subtract(o).getNumerator().compareTo(BigInteger.ZERO) < 0)
            return -1;
        else return 0;
    }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }
}
