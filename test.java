public class MyBaseClass {
    // some methods
}

// ❌ COMPILE-TIME ERROR!
// 'enum' cannot extend another class.
public enum MyEnum extends MyBaseClass {
    A, B, C;
}