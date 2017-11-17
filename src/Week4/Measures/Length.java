package Week4.Measures;

public class Length {
    public int meters, centimeters, milimeters;

    // CONSTRUCTORS
    public Length(int meters, int centimeters, int milimeters) {
        this.meters = meters;
        this.centimeters = centimeters;
        this.milimeters = milimeters;
    }

    public Length(int meters) {
        this.meters = meters;
        this.centimeters = meters * 10;
        this.milimeters = meters * 1000;
    }

    public Length(double centimeters) {
        this.meters = (int) centimeters/100;
        this.centimeters = (int) centimeters;
        this.milimeters = (int) centimeters * 10;
    }

    public Length() {
        meters = 0;
        centimeters = 0;
        milimeters = 0;
    }

    // METHODS
    public Length add(Length obj) {
        return new Length(meters + obj.meters);
    }

    public Length subtract(Length obj) {
        return new Length(meters - obj.meters);
    }

    public Length multiply(int num) {
        return new Length(meters * num);
    }

    public float area(Length obj) {
        float thisDimen = meters + (float)centimeters/100 + (float)milimeters/1000;
        float objDimen = obj.meters + (float)obj.centimeters/100 + (float)obj.milimeters/1000;

        return thisDimen * objDimen;
    }
}
