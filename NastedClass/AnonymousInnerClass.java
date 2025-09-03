interface Greeting {
    void sayHello();
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        // Using an anonymous inner class to implement the Greeting interface
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello from an anonymous class!");
            }
        };
        
        greeting.sayHello();
    }
}