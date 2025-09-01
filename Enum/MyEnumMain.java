// Define an interface with a new behavior.
interface Displayable {
    String getDisplayValue();
}

// ✅ Correct usage: The enum implements the interface.
enum MyEnum implements Displayable {
    A, 
    B, 
    C;

    @Override
    public String getDisplayValue() {
        return "This is a constant: " + this.name();
    }
}

public class MyEnumMain {
    public static void main(String[] args) {
        for (MyEnum item : MyEnum.values()) {
            System.out.println(item);
        }
    }
}