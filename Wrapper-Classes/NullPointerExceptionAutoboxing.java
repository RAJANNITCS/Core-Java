public class NullPointerExceptionAutoboxing {
    public static void main(String[] args) {

        Integer maybeNumber = null; // This is like an empty box for a number

        // Now, we try to take the number out of the empty box
        // Java will try to unbox 'maybeNumber' to an 'int' here
        int myPrimitiveNumber = maybeNumber; // THIS LINE WILL THROW NullPointerException

        System.out.println("This line will not be reached if NPE occurs.");
    }
}