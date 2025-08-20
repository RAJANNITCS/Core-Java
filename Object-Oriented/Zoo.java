import java.util.ArrayList;
import java.util.List;

class Animal {
    // No fields or methods here initially
}

class Dog extends Animal {
    public void bark() { System.out.println("Woof!"); }
}

class Cat extends Animal {
    public void meow() { System.out.println("Meow!"); }
}

public class Zoo {
    public static void main(String[] args) {
        List<Animal> animalsInZoo = new ArrayList<>();
        animalsInZoo.add(new Dog());
        animalsInZoo.add(new Cat());
        // You can iterate through 'animalsInZoo' and know each element is an 'Animal',
        // even if their specific behaviors (bark/meow) come from subclasses.
    }
}