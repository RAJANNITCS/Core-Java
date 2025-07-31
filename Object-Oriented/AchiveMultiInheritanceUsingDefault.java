// File: Driver.java (Modified)
interface Driver {
    void drive();
    
    // Default method: a basic way to perform an action
    default void performSkill() {
        System.out.println("Driver: Performing a basic driving skill.");
    }
}

// File: Musician.java (Modified)
interface Musician {
    void playInstrument();
    
    // Default method: another basic way to perform an action
    default void performSkill() { // SAME METHOD NAME as in Driver!
        System.out.println("Musician: Performing a basic musical skill.");
    }
}

// File: Person.java (Modified)
class Person implements Driver, Musician {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void drive() {
        System.out.println(name + " is driving a car carefully.");
    }

    @Override
    public void playInstrument() {
        System.out.println(name + " is playing the guitar with passion.");
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + " and I can drive and play music!");
    }

    // --- Handling the Default Method Conflict ---
    // If you remove this 'performSkill' method, Java will give a COMPILE ERROR!
    // It will say: "Class Person inherits unrelated defaults for performSkill()
    // from types Driver and Musician."
    // So, you MUST provide your own specific implementation to resolve the ambiguity.
    @Override
    public void performSkill() {
        System.out.println(name + ": Performing a unique combined skill!");
        // You could even call the interface's default methods if you wanted:
        // Driver.super.performSkill();
        // Musician.super.performSkill();
    }
}

// File: AchiveMultiInheritanceUsingDefault.java (Modified)
public class AchiveMultiInheritanceUsingDefault {
    public static void main(String[] args) {
        Person alice = new Person("Alice");

        alice.introduce();
        alice.drive();
        alice.playInstrument();
        alice.performSkill(); // Calling the method that resolved the conflict

        System.out.println("\n--- Polymorphism with default methods ---");
        Driver driverRef = alice;
        driverRef.performSkill(); // Calls Person's overridden method

        Musician musicianRef = alice;
        musicianRef.performSkill(); // Calls Person's overridden method
    }
}