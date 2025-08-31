// Inside the SportsCar class's startEngine() method...

// First, do the original Car's work
super.startEngine(); // This runs the startEngine() from the parent Car class

// Then, do my own specific work
System.out.println("VROOOM!");