// 1. Enum Declaration: TrafficLightColor
// It's a special kind of class with named constants.
enum TrafficLightColor {
    // These are the enum constants. They are implicitly public static final.
    // They can also call a constructor if parameters are provided.
    RED("STOP", 30),        // Calls constructor with "STOP" and 30
    YELLOW("CAUTION", 5),   // Calls constructor with "CAUTION" and 5
    GREEN("GO", 25);        // Calls constructor with "GO" and 25

    // Instance variables (can be private) to hold custom data for each constant
    private final String action;
    private final int durationSeconds;

    // Constructor for the enum.
    // IMPORTANT: Enum constructors must be private or default (package-private).
    // They are called automatically when the enum constants are initialized.
    private TrafficLightColor(String action, int durationSeconds) {
        this.action = action;
        this.durationSeconds = durationSeconds;
    }

    // Public getter method to access the custom data
    public String getAction() {
        return action;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }

    // You can add other methods to enums too
    public void displayInfo() {
        System.out.println(this.name() + ": " + this.getAction() + " for " + this.getDurationSeconds() + " seconds.");
    }
}

// 2. Class using the Enum
public class TrafficSimulator {

    public static void main(String[] args) {
        // Accessing enum constants
        TrafficLightColor currentColor = TrafficLightColor.RED;
        System.out.println("Current Light: " + currentColor); // Prints RED (calls toString implicitly)
        System.out.println("Action: " + currentColor.getAction()); // Prints STOP

        System.out.println("\n--- Simulating Traffic ---");

        // Loop through all enum constants using values() method
        for (TrafficLightColor color : TrafficLightColor.values()) {
            color.displayInfo(); // Calls the custom method on each enum constant
        }

        System.out.println("\n--- Traffic Control ---");

        // Using enum in a switch statement (very common and recommended)
        TrafficLightColor pedestrianLight = TrafficLightColor.GREEN;

        switch (pedestrianLight) {
            case RED:
                System.out.println("Pedestrian: DO NOT WALK!");
                break;
            case YELLOW:
                System.out.println("Pedestrian: Prepare to stop.");
                break;
            case GREEN:
                System.out.println("Pedestrian: WALK!");
                break;
            default:
                System.out.println("Unknown light state.");
        }

        // Example: Converting a string to an enum constant
        String lightString = "YELLOW";
        try {
            TrafficLightColor dynamicLight = TrafficLightColor.valueOf(lightString);
            System.out.println("\nDynamically set light: " + dynamicLight.name() + ", action: " + dynamicLight.getAction());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: '" + lightString + "' is not a valid traffic light color.");
        }

        // Enums can have a main method (for standalone testing/utility)
        // TrafficLightColor.main(new String[]{}); // You can technically call it this way
    }
}