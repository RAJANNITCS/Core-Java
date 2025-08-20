// Superclass
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

// Subclass 1
class Dog extends Animal {
    @Override // Good practice to use @Override annotation
    void makeSound() {
        System.out.println("Dog barks.");
    }
}

// Subclass 2
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows.");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        // Parent class reference 'animal' points to a Dog object
        Animal animal1 = new Dog();
        animal1.makeSound(); // Calls Dog's makeSound() - "Dog barks."

        // Parent class reference 'animal' points to a Cat object
        Animal animal2 = new Cat();
        animal2.makeSound(); // Calls Cat's makeSound() - "Cat meows."

        // Parent class reference 'animal' points to an Animal object
        Animal animal3 = new Animal();
        animal3.makeSound(); // Calls Animal's makeSound() - "Animal makes a sound."
    }
}