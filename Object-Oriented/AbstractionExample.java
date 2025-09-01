import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AbstractionExample {

    public static void printListContents(List<String> list) { // Abstraction: we only care that it's a List
        System.out.println("Printing list of type: " + list.getClass().getSimpleName());
        for (String item : list) {
            System.out.println("  " + item);
        }
    }

    public static void main(String[] args) {
        // We use the List interface to abstract away the implementation.
        
        List<String> arrayList = new ArrayList<>(); // Behind the scenes, this uses a dynamic array.
        arrayList.add("Java");
        arrayList.add("Python");
        printListContents(arrayList); // We pass it to a method that only knows about 'List'.

        System.out.println();
        
        List<String> linkedList = new LinkedList<>(); // Behind the scenes, this uses linked nodes.
        linkedList.add("C++");
        linkedList.add("Rust");
        printListContents(linkedList); // The same method works for a different implementation.
    }
}