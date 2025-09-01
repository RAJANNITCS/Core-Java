
enum DayOfWeek {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

public class IterateEnum {
    public static void main(String[] args) {
        System.out.println("Iterating over all DayOfWeek enum values:");

        // Calling the static values() method on the enum class
        DayOfWeek[] days = DayOfWeek.values();

        // Using a for-each loop to iterate over the array of enum constants
        for (DayOfWeek day : days) {
            System.out.println("Day: " + day);
        }

        System.out.println("\n--- Getting Name and Ordinal ---");
        // You can also get the name and ordinal (position) of each constant
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println("Name: " + day.name() + " | Ordinal: " + day.ordinal());
        }
    }
}