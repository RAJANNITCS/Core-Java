import java.util.List;
import java.util.ArrayList;

// The 'part' class
class Professor {
    private String name;
    public Professor(String name) {
        this.name = name;
    }
    // ... getters and setters
}

// The 'whole' class
class Department {
    private String name;
    private List<Professor> professors; // Department has a list of professors

    public Department(String name) {
        this.name = name;
        this.professors = new ArrayList<>();
    }

    public void addProfessor(Professor prof) {
        this.professors.add(prof);
    }
    // ... getters and setters
}

// Main method to show aggregation
public class AggregationExample {
    public static void main(String[] args) {
        Professor p1 = new Professor("Dr. Jones");
        Professor p2 = new Professor("Dr. Lee");

        Department csDept = new Department("Computer Science");
        csDept.addProfessor(p1);
        csDept.addProfessor(p2);

        // Even if csDept is garbage collected, p1 and p2 still exist.
    }
}