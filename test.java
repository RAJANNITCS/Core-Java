// Analogy: The "Half-Built Car Blueprint"
public abstract class Car {
    
    // A finished part of the blueprint (a method with a body)
    public void startEngine() {
        System.out.println("Engine started.");
    }

    // An empty part that must be completed (a method with no body)
    public abstract void drive();
}

// A class that completes the "Half-Built Car Blueprint"
public class HondaAccord extends Car {
    
    // We MUST provide the code to complete the 'drive()' method
    @Override
    public void drive() {
        System.out.println("The Honda Accord is driving down the road.");
    }
}