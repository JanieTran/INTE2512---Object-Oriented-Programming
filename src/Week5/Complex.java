package Week5;

public class Complex {
    // PROPERTIES
    private double real, imaginary;

    // CONSTRUCTOR

    public Complex() {
        real = 0;
        imaginary = 0;
    }

    public Complex(double a) {
        real = a;
        imaginary = 0;
    }

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // SETTERS

    public void setReal(double real) {
        this.real = real;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    // GETTERS

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    // METHODS
    public Complex add(Complex com) {
        return new Complex(real + com.real, imaginary + com.imaginary);
    }

    public Complex subtract(Complex com) {
        return new Complex(real - com.real, imaginary - com.imaginary);
    }

    public Complex multiply(Complex com) {
        double newReal = real * com.real - imaginary * com.imaginary;
        double newIma = imaginary * com.real + real * com.imaginary;
        return new Complex(newReal, newIma);
    }

    public Complex divide(Complex com) {
        double newReal = (real * com.real + imaginary * com.imaginary) / (Math.pow(com.real, 2) + Math.pow(com.imaginary, 2));
        double newIma = (imaginary * com.real - real * com.imaginary) / (Math.pow(com.real, 2) + Math.pow(com.imaginary, 2));
        return new Complex(newReal, newIma);
    }

    public double abs() {
        return Math.sqrt(Math.pow(real, 2) + Math.pow(imaginary, 2));
    }

    @Override
    public String toString() {
        if (real == 0) {
            if (imaginary == 0) return "0";
            else return String.format("%.2fi", imaginary);
        } else {
            if (imaginary == 0) return String.format("%.2f", real);
            else if (imaginary < 0) return String.format("%.2f - %.2fi", real, Math.abs(imaginary));
            else return String.format("%.2f + %.2fi", real, imaginary);
        }
    }
}
