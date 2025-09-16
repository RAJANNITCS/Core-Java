class OuterClass {
    // Non-static instance member
    private int outerInstanceVar = 10;
    // Static member
    static int outerStaticVar = 20;

    // Static Nested Class
    static class StaticNestedClass {
        public void display() {
            // Can access static members of the outer class directly
            System.out.println("Static outer variable: " + outerStaticVar);
            
            // ERROR: Cannot access non-static members of outer class directly
            // System.out.println("Instance outer variable: " + outerInstanceVar); 
        }
    }
}

class StaticNestedClassMain {
    public static void main(String[] args) {
        // Instantiate the static nested class directly
        // OuterClass.StaticNestedClass nested = new OuterClass.StaticNestedClass();
        // OuterClass.outerStaticVar;
    }
}