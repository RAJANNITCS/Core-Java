// File: SingletonDatabaseConnection.java

// Use Case 1: Singleton Pattern
class SingletonDatabaseConnection {

    // 1. The single instance is created and held privately.
    private static final SingletonDatabaseConnection instance = new SingletonDatabaseConnection();

    // 2. The constructor is private to prevent external instantiation.
    private SingletonDatabaseConnection() {
        System.out.println("SingletonDatabaseConnection: A new connection has been created.");
        // This will only be printed ONCE during the application's lifetime.
    }

    // 3. A public static method provides the single instance.
    public static SingletonDatabaseConnection getInstance() {
        return instance;
    }

    public void executeQuery(String query) {
        System.out.println("Executing query: '" + query + "'");
    }
}


// File: Calculator.java

// Use Case 2: Utility Class
final class Calculator {

    // The constructor is private to prevent instantiation.
    // 'final' on the class prevents it from being extended.
    private Calculator() {
        // We can add a simple check to prevent instantiation via reflection too.
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated.");
    }

    // A static method that does not require an object.
    public static int add(int a, int b) {
        return a + b;
    }

    // Another static method.
    public static int subtract(int a, int b) {
        return a - b;
    }
}


// File: PrivateConstructor.java
public class PrivateConstructor {
    public static void main(String[] args) {
        System.out.println("--- Using the Singleton Pattern ---");
        // We cannot use 'new' here due to the private constructor.
        // SingletonDatabaseConnection conn = new SingletonDatabaseConnection(); // ❌ Compile-time Error!

        // We access the single instance through the public static method.
        SingletonDatabaseConnection conn1 = SingletonDatabaseConnection.getInstance();
        conn1.executeQuery("SELECT * FROM users;");

        // The second call returns the SAME instance.
        SingletonDatabaseConnection conn2 = SingletonDatabaseConnection.getInstance();
        conn2.executeQuery("SELECT * FROM orders;");

        System.out.println("Are conn1 and conn2 the same object? " + (conn1 == conn2)); // This will print 'true'


        System.out.println("\n--- Using the Utility Class ---");
        // We cannot create an instance of the Calculator.
        // Calculator myCalc = new Calculator(); // ❌ Compile-time Error!

        // We call the static methods directly on the class name.
        int sum = Calculator.add(10, 5);
        System.out.println("10 + 5 = " + sum);

        int difference = Calculator.subtract(20, 7);
        System.out.println("20 - 7 = " + difference);
    }
}