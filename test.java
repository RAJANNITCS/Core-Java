// Continuing from Student class above
class Student {
    int studentId;
    String studentName;

    // Constructor and equals() method from above...

    // Override hashCode()
    @Override
    public int hashCode() {
        int result = 17; // A prime number
        result = 31 * result + studentId; // Multiply by another prime, add field hash
        result = 31 * result + studentName.hashCode(); // Use field's hashCode()
        return result;
    }
}fds