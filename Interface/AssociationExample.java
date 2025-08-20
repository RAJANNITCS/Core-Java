class Student {
    private String name;
    public Student(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
}

class Teacher {
    private String name;
    public Teacher(String name) {
        this.name = name;
    }

    public void teach(Student student) {
        System.out.println(this.name + " is teaching " + student.getName());
    }
    
}

// Main method to show the association
public class AssociationExample {
    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        Teacher t1 = new Teacher("Mr. Smith");

        t1.teach(s1); 
    }
}