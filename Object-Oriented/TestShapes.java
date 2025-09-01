// This is a concrete subclass that provides the implementation for 'calculateArea()'.
class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    // ✅ The subclass MUST override the abstract method and provide a body.
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// This subclass is also abstract because it does NOT implement calculateArea().
// It is still an incomplete blueprint.
abstract class Rectangle extends Shape {
    public Rectangle(String color) {
        super(color);
    }

    // This class cannot be instantiated, and a child of it must
    // implement 'calculateArea()'.
}

public class TestShapes {
    public static void main(String[] args) {
        // ✅ This is valid because Circle is a concrete class.
        Circle myCircle = new Circle("Blue", 10.0);
        System.out.println("The area of the " + myCircle.getColor() + 
                           " circle is: " + myCircle.calculateArea());

        // We can't use the abstract Rectangle class directly,
        // but a subclass of it could be created and used.
    }
}