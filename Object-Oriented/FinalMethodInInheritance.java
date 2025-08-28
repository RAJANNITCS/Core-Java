//Parent Class
class Vehicle {

    // This method is critical and should NOT be changed by subclasses.
    public final void startEngine() {
        // This could represent a complex, standardized, or patented process.
        System.out.println("Vehicle : Starting the engine with the standard ignition sequence.");
    }

    // This method can be costomized by subclasses.
    public void stopEngine() {
        System.out.println("Vehicle : Engine Stopped."); 
    }
}

// Child Class
class Car extends Vehicle {

    // ❌ COMPILE-TIME ERROR ! You cannot override a final method.
    // @Override
    // public void startEngine() {
    //        System.out.println("Car: starting the engine with a different sequence.");
    // }

    // ✅ This works perfectly, because stopEngine() is not final.
    @Override
    public void stopEngine() {
        System.out.println("Car : Engine stopped, and all dashboard lights are now off.");
    }
}

public class FinalMethodInInheritance {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.startEngine();
        c1.stopEngine();
    }
}