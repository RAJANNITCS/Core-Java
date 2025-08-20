class Calculator {
    // Method 1: Adds two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method 2: Adds three integers (different number of parameters)
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: Adds two doubles (different type of parameters)
    public double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(5, 10));         // Calls Method 1 (int, int)
        System.out.println(calc.add(5, 10, 15));     // Calls Method 2 (int, int, int)
        System.out.println(calc.add(5.5, 10.2));     // Calls Method 3 (double, double)
    }
}