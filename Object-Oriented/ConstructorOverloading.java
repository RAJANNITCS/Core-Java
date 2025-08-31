class Car {
    private String color;
    private int year;
    private String model;

    // Constructor 1 (Take only color)
    public Car(String color) {
        this.color = color;
        this.year = 2025;
        this.model = "Base";
        System.out.println("Car with color :" + this.color + ":created.");
    }

    // Constructor 2 (Take year and model)
    public Car(int year, String model) {
        this("Silver"); // Calling Constructor 1 from this constructor
        this.year = year;
        this.model = model;
        System.out.println("Car with model:" + this.model + ":from year:" + this.year + ":created");
    }

    // Constructor 3 (Take all three parameters) 
    public Car(int year, String color, String model) {
        this(year, model);
        this.color = color;
        System.out.println("Full-spec Car Created."); 
    }

    public void showDetails() {
        System.out.println("Details : " + this.color + ": year :" + this.year + ": model :" + this.model);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Car car1 = new Car("Red");
        car1.showDetails();

        System.out.println();

        Car car2 = new Car(2026, "Sport");
        car2.showDetails();

        System.out.println();

        Car car3 = new Car(2026, "Blue", "Luxury");
        car3.showDetails();
    }
}
