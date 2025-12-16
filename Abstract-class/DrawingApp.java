// 1. Abstract Class: Shape
abstract class Shape {
    String color; // A normal variable

    // Constructor for the abstract class
    public Shape(String color) {
        this.color = color;
    }

    // A normal (non-abstract) method
    public String getColor() {
        return color;
    }

    

    // An abstract method: no body, must be implemented by subclasses
    abstract double calculateArea();

    // Another normal method
    public void displayColor() {
        System.out.println("Shape color: " + color);
    }
}

// 2. Concrete Subclass: Circle
class Circle extends Shape {
    double radius;

    public Circle(String color, double radius) {
        super(color); // Call the parent (Shape) constructor
        this.radius = radius;
    }

    // Implementing the abstract method from Shape
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// 3. Concrete Subclass: Rectangle
class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    // Implementing the abstract method from Shape
    @Override
    double calculateArea() {
        return length * width;
    }
}

// 4. Main class to test
public class DrawingApp {
    public static void main(String[] args) {
        // You cannot do this: Shape genericShape = new Shape("Black");
        // It would give a compile-time error!

        Circle myCircle = new Circle("Red", 5.0);
        System.out.println("Circle Area: " + myCircle.calculateArea());
        myCircle.displayColor(); // Using a non-abstract method from Shape

        System.out.println("---");

        Rectangle myRectangle = new Rectangle("Blue", 4.0, 6.0);
        System.out.println("Rectangle Area: " + myRectangle.calculateArea());
        myRectangle.displayColor();
    }
}