package Week5;

import java.util.Date;

public class SimpleGeometricObject {
    // PROPERTIES
    protected String color = "white";
    protected boolean filled;
    protected java.util.Date dateCreated;

    // CONSTRUCTORS

    public SimpleGeometricObject() {
        dateCreated = new java.util.Date();
    }

    public SimpleGeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    // COMPARABLE

    // SETTERS

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // GETTERS
    public String getColor() {
        return color;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public boolean isFilled() {
        return filled;
    }

    // METHOD
    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color +
                " and filled: " + filled;
    }
}
