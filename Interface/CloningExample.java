// Our contained object, which we want to clone.
class Car implements Cloneable {
    public String color;

    public Car(String color) {
        this.color = color;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // Object.clone() returns a shallow copy
    }
}

// Our main class that contains the Car object.
class Person implements Cloneable {
    public String name;
    public Car car;

    public Person(String name, String carColor) {
        this.name = name;
        this.car = new Car(carColor);
    }

    // --- Implementing Shallow Copy ---
    // The default clone() method just copies the reference to the Car object.
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // Object.clone() does the shallow copy
    }

    // --- Implementing Deep Copy (we must do this manually) ---
    public Object deepClone() throws CloneNotSupportedException {
        // 1. First, perform the shallow copy using the original clone() method.
        Person clonedPerson = (Person) super.clone();

        // 2. Then, manually create a new copy of the mutable object.
        clonedPerson.car = (Car) car.clone();

        return clonedPerson;
    }
}

public class CloningExample {
    public static void main(String[] args) throws CloneNotSupportedException {

        System.out.println("--- Demonstrating SHALLOW Cloning ---");
        Person originalPerson = new Person("Alice", "Blue");
        Person shallowClonedPerson = (Person) originalPerson.clone();

        // Let's modify the original object's car color.
        System.out.println("Original person's car color before change: " + originalPerson.car.color);
        System.out.println("Shallow cloned person's car color before change: " + shallowClonedPerson.car.color);
        
        System.out.println("\nChanging the original person's car color...");
        originalPerson.car.color = "Red";

        // The shallow cloned object's car color also changes!
        System.out.println("Original person's car color after change: " + originalPerson.car.color);
        System.out.println("Shallow cloned person's car color after change: " + shallowClonedPerson.car.color); // This will be "Red"
        System.out.println("Result: Both objects share the same car. This is a shallow copy.");


        System.out.println("\n--- Demonstrating DEEP Cloning ---");
        Person originalPerson2 = new Person("Bob", "Green");
        Person deepClonedPerson = (Person) originalPerson2.deepClone();

        // Let's modify the original object's car color.
        System.out.println("Original person's car color before change: " + originalPerson2.car.color);
        System.out.println("Deep cloned person's car color before change: " + deepClonedPerson.car.color);
        
        System.out.println("\nChanging the original person's car color...");
        originalPerson2.car.color = "Yellow";

        // The deep cloned object's car color remains the same!
        System.out.println("Original person's car color after change: " + originalPerson2.car.color);
        System.out.println("Deep cloned person's car color after change: " + deepClonedPerson.car.color); // This remains "Green"
        System.out.println("Result: The two objects are completely independent. This is a deep copy.");
    }
}