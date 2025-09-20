interface Animal {
    // Abstract method (must be implemented by classes)
    void makeSound();

    // Default method with a body
    default void eat() {
        System.out.println("The animal is eating.");
    }
}

interface Calculator {
    // An abstract method
    int operate(int a, int b);

    // A static utility method
    static int add(int a, int b) {
        return a + b;
    }
}

// Using the @FunctionalInterface annotation
@FunctionalInterface
interface Greeting {
    // The single abstract method
    void sayHello(String name);
}

// Dog class only needs to implement the abstract method
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

// Main class to test
public class InterfaceChangeInJava8 {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound(); // Outputs: Woof!
        myDog.eat(); // Outputs: The animal is eating.
        int sum = Calculator.add(5, 10);
        System.out.println("sum of two number =" + sum);
        // Use a lambda expression to implement the single abstract method
        Greeting greeting = (name) -> {
            System.out.println("Hello, " + name + "!");
        };

        // Call the method
        greeting.sayHello("World"); // Outputs: Hello, World!

        //create thread using anonymous function 
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from a thread!");
            }
        });
        t1.start();

        // create thread using lambda exprection
        Thread t2 = new Thread(() -> System.out.println("Hello from a thread!"));
        t2.start();

    }
}
