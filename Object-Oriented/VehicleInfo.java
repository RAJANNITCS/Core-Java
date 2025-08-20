// Parent Class (Superclass)
class Vehicle {
    String brand = "Generic Vehicle";

    void start() {
        System.out.println(brand + " starts moving.");
    }

    void stop() {
        System.out.println(brand + " stops.");
    }
}

// Child Class (Subclass)
class Car extends Vehicle {
    String model = "Sedan";

    // Constructor to set parent's brand and child's model
    Car() {
        this.brand = "Toyota"; // We can set inherited fields
        System.out.println("A new Car is created.");
    }

    // Overriding the start method from Vehicle
    @Override
    void start() {
        System.out.println(brand + " " + model + " engine starts with a key.");
    }

    void honk() {
        System.out.println("Car honks: Beep beep!");
    }
}

public class VehicleInfo {
    public static void main(String[] args) {
        Car myCar = new Car(); // Creates a Car object
        myCar.start();         // Calls the overridden start() method in Car
        myCar.stop();          // Calls the inherited stop() method from Vehicle
        myCar.honk();          // Calls Car's own method
    }
}