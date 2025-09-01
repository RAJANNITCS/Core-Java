// File: Shape.java

// This is an abstract class because it contains an abstract method.
public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    // This is an abstract method. It has no body.
    // Every concrete subclass must implement this method.
    public abstract double calculateArea();

    // The abstract class can still have regular, non-abstract methods.
    public String getColor() {
        return color;
    }
}