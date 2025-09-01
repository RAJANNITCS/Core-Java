// File: DayOfWeek.java
enum DayOfWeek {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

public class EnumUsefulness {

    public static void displayDay(DayOfWeek day) {
        System.out.println("Today is " + day);
    }

    public static void main(String[] args) {
        // Benefit 1: Excellent readability and maintainability
        EnumUsefulness.displayDay(DayOfWeek.MONDAY);

        // Benefit 2: Type safety!
        // The compiler will give an error if you try to pass an invalid value.
        // displayDay(99); // ❌ This will not compile!
        // displayDay(Color.BLUE); // ❌ This will not compile!
    }
}