interface Greeting {
    void greet();
}

public class AnonymousClassExample {
    public static void main(String[] args) {
        // Creating an anonymous class that implements the Greeting interface
        Greeting englishGreeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello!");
            }
        };

        englishGreeting.greet(); // Output: Hello!

        // Another example: anonymous class extending a concrete class
        // (though less common than implementing interfaces)
        Thread myThread = new Thread() {
            @Override
            public void run() {
                System.out.println("Anonymous thread running.");
            }
        };

        myThread.start(); // Output: Anonymous thread running.
    }
}