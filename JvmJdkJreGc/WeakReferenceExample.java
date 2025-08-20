import java.lang.ref.WeakReference;

public class WeakReferenceExample {
    public static void main(String[] args) {
        Object heavyObject = new Object(); // This object is strongly referenced
        WeakReference<Object> weakRef = new WeakReference<>(heavyObject);

        System.out.println("Weak reference points to: " + weakRef.get()); // Prints the object

        heavyObject = null; // Remove the strong reference

        // At this point, the 'heavyObject' is only reachable via 'weakRef'.
        // The next garbage collection *might* clear it.
        System.gc(); // Request garbage collection (not guaranteed to run immediately)

        System.out.println("Weak reference points to after GC: " + weakRef.get()); // Likely prints null
    }
}