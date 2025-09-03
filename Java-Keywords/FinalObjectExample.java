import java.util.ArrayList;
import java.util.List;

public class FinalObjectExample {

    public static void main(String[] args) {
        // A final reference to an ArrayList object
        final List<String> myFinalList = new ArrayList<>();

        System.out.println("List before any changes: " + myFinalList); // Output: []

        // --- PART 1: Modifying the object's state (✅ OK) ---

        // You CAN add elements to the list (modifying the object's state).
        myFinalList.add("Apple");
        myFinalList.add("Banana");
        System.out.println("List after adding elements: " + myFinalList); // Output: [Apple, Banana]

        // You CAN remove elements from the list.
        myFinalList.remove(0);
        System.out.println("List after removing an element: " + myFinalList); // Output: [Banana]

        // --- PART 2: Modifying the object reference (❌ NOT OK) ---

        // You CANNOT reassign the reference to point to a new object.
        // This will result in a COMPILE-TIME ERROR.
        // myFinalList = new ArrayList<>(); 
        // myFinalList = null; 
        
        System.out.println("\nCannot reassign the 'myFinalList' reference. That would cause a compile-time error.");
    }
}