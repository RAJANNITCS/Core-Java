// 1. Interface: Vehicle (defines the contract)
interface Vehicle {
    // All methods in an interface are public and abstract by default (before Java 8)
    // From Java 8+, they can also be default, static, or private (Java 9+)

    void changeGear(int newGear); // Abstract method
    void speedUp(int increment);  // Abstract method
    void applyBrakes(int decrement); // Abstract method

    // Example of a default method (Java 8+ feature)
    default void startEngine() {
        System.out.println("Vehicle engine starting... (Default behavior)");
    }

    // Example of a static method (Java 8+ feature)
    static void displayVehicleType() {
        System.out.println("This is a generic vehicle type.");
    }
}

// 2. Concrete Class 1: Bicycle (implements the Vehicle interface)
class Bicycle implements Vehicle {
    int currentSpeed;
    int currentGear;

    @Override
    public void changeGear(int newGear) {
        this.currentGear = newGear;
        System.out.println("Bicycle gear changed to: " + newGear);
    }

    @Override
    public void speedUp(int increment) {
        this.currentSpeed += increment;
        System.out.println("Bicycle speeding up. Current speed: " + currentSpeed);
    }

    @Override
    public void applyBrakes(int decrement) {
        this.currentSpeed -= decrement;
        System.out.println("Bicycle applying brakes. Current speed: " + currentSpeed);
    }

    // Bicycle doesn't need to override startEngine() if default is fine
    // However, it can if it has a unique way to start.
    // @Override
    // public void startEngine() {
    //     System.out.println("Bicycle: No engine to start, just pedal!");
    // }
}

// 3. Concrete Class 2: Car (implements the Vehicle interface)
class Car implements Vehicle {
    int currentSpeed;
    int currentGear;

    @Override
    public void changeGear(int newGear) {
        this.currentGear = newGear;
        System.out.println("Car gear changed to: " + newGear);
    }

    @Override
    public void speedUp(int increment) {
        this.currentSpeed += increment;
        System.out.println("Car speeding up. Current speed: " + currentSpeed);
    }

    @Override
    public void applyBrakes(int decrement) {
        this.currentSpeed -= decrement;
        System.out.println("Car applying brakes. Current speed: " + currentSpeed);
    }

    @Override
    public void startEngine() { // Car overrides the default method
        System.out.println("Car engine roaring to life!");
    }
}

// 4. Main class to demonstrate usage
public class VehicleSystem {
    public static void main(String[] args) {
        Bicycle myBicycle = new Bicycle();
        myBicycle.changeGear(2);
        myBicycle.speedUp(10);
        myBicycle.applyBrakes(5);
        myBicycle.startEngine(); // Uses default from Vehicle

        System.out.println("---");

        Car myCar = new Car();
        myCar.changeGear(3);
        myCar.speedUp(50);
        myCar.applyBrakes(15);
        myCar.startEngine(); // Uses overridden method from Car

        System.out.println("---");

        // Calling a static method from the interface itself
        Vehicle.displayVehicleType();
    }
}