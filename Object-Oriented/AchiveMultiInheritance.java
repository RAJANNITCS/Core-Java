// File: Driver.java
interface Driver {
    void drive(); // This is just a contract: any Driver must have a 'drive' method
}

// File: Musician.java
interface Musician {
    void playInstrument(); // This is just a contract: any Musician must have a 'playInstrument' method
}

// File: Person.java
class Person implements Driver, Musician {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    // This is the Person's OWN way of driving
    @Override
    public void drive() {
        System.out.println(name + " is driving a car carefully.");
    }

    // This is the Person's OWN way of playing an instrument
    @Override
    public void playInstrument() {
        System.out.println(name + " is playing the guitar with passion.");
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + " and I can drive and play music!");
    }
}

// File: AchiveMultiInheritance.java.java
public class AchiveMultiInheritance {
    public static void main(String[] args) {
        Person alice = new Person("Alice");

        alice.introduce();
        alice.drive();          // Alice's way of driving
        alice.playInstrument(); // Alice's way of playing

        System.out.println("\n--- Treating Alice as a Driver ---");
        Driver driverRef = alice; // We can treat Alice as a Driver because she implements Driver
        driverRef.drive();
        // driverRef.playInstrument(); // ERROR: A Driver reference only knows about Driver methods

        System.out.println("\n--- Treating Alice as a Musician ---");
        Musician musicianRef = alice; // We can treat Alice as a Musician
        musicianRef.playInstrument();
        // musicianRef.drive(); // ERROR: A Musician reference only knows about Musician methods
    }
}