public class OverloadMainMethod {

    // The ONLY method the JVM will execute as an entry point
    public static void main(String[] args) {
        System.out.println("1. Original main(String[] args) is executing.");

        // Call the overloaded main methods from here
        main(123);                 // Calls main(int)
        main("Hello Overload");    // Calls main(String)
    }

    // Overloaded main method 1
    public static void main(int number) {
        System.out.println("2. Overloaded main(int) is executing with: " + number);
    }

    // Overloaded main method 2
    public static void main(String message) {
        System.out.println("3. Overloaded main(String) is executing with: \"" + message + "\"");
    }

    // You could even have another one...
    public static void main(double value) {
        System.out.println("4. Overloaded main(double) is executing with: " + value);
    }
}