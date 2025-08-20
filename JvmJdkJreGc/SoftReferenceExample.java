import java.lang.ref.SoftReference;

public class SoftReferenceExample {
    public static void main(String[] args) {
        byte[] largeObject = new byte[1024 * 1024 * 10]; // 10MB byte array
        SoftReference<byte[]> softRef = new SoftReference<>(largeObject);

        System.out.println("Soft reference points to: " + softRef.get()); // Prints the object

        largeObject = null; // Remove the strong reference

        // The 'largeObject' is now only reachable via 'softRef'.
        // It will be cleared only if the JVM runs low on memory.
        // Forcing GC here might not clear it unless memory is truly scarce.
        System.gc();

        System.out.println("Soft reference points to after GC (might still be there): " + softRef.get());

        // To simulate memory pressure, you might try to allocate a lot more memory
        // This is just for demonstration and can lead to OutOfMemoryError
        try {
            byte[] extremelyLargeArray = new byte[1024 * 1024 * 500]; // 500MB
        } catch (OutOfMemoryError e) {
            System.out.println("OutOfMemoryError occurred, indicating memory pressure.");
            System.out.println("Soft reference points to after memory pressure: " + softRef.get()); // Might be null now
        }
    }
}