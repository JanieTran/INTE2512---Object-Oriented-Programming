package Week4_Class1;

public class Lab4Ex4 {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(4,40);
        System.out.println(rec1.getWidth());
        System.out.println(rec1.getHeight());
        System.out.println(rec1.getArea());
        System.out.println(rec1.getPerimeter());
    }
}

class Rectangle {
    private double width, height;

    public Rectangle() {
        this.width = 1;
        this.height = 1;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }
}
