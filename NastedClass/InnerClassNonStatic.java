class OuterClass {
    private int outerVar;

    public OuterClass(int var) {
        this.outerVar = var;
    }

    // Non-static Inner Class
    class InnerClass {
        private int innerVar;

        public InnerClass(int var) {
            this.innerVar = var;
        }

        public void accessOuterVar() {
            // Can access private members of the outer class instance
            System.out.println("Outer variable from inner class: " + outerVar);
        }
    }
}

public class InnerClassNonStatic {
    public static void main(String[] args) {
        // Step 1: Create an instance of the outer class
        OuterClass outer = new OuterClass(10);
        
        // Step 2: Create an instance of the inner class using the outer instance
        OuterClass.InnerClass inner = outer.new InnerClass(20);

        inner.accessOuterVar();
    }
}