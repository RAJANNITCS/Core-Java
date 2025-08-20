// The 'part' class
class Engine {
    private String type;
    public Engine(String type) {
        this.type = type;
    }

    public void start() {
        System.out.println("Engine is starting...");
    }
    // ... getters and setters
}

// The 'whole' class
class Car {
    private String brand;
    private Engine engine; // Car has an engine

    // The car creates its own engine.
    // The engine's life is managed by the car.
    public Car(String brand, String engineType) {
        this.brand = brand;
        this.engine = new Engine(engineType); 
    }

    public void drive() {
        engine.start();
        System.out.println("The " + brand + " is driving.");
    }
    // ... getters and setters
}

// Main method to show composition
public class CompositionExample {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "V6");
        myCar.drive();
    }
}