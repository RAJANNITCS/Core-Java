import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

// create Comparator class for sorting logic
/**
 * This class define custome sorting rule for Employee Object.
 * It sorts them based on their name of alphabetical order.
 */
class SortEmplyeeByName implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {
        // We are using the String's natural sorting (compareTo)
        // to compare the names of the two employees.
        return emp1.getName().compareTo(emp2.getName());
    }
}

class SortEmployeeBySalary implements Comparator<Employee> {

    @Override
    public int compare(Employee obj1, Employee obj2) {
        return Double.compare(obj1.getSalary(),obj2.getSalary());
    }
}

class SortEmployee implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {
        int nameComparison = emp1.getName().compareTo(emp2.getName());
        if (nameComparison != 0) {
            return nameComparison; // if the name are differenct then return the result
        } else {
            // if name are same then compare by ID;
            return emp1.getId().compareTo(emp2.getId());
        }
    }
}


// create Employee class.
class Employee {
    public Integer id;
    public String name;
    public Double salary;

    public Employee(Integer id, String name,Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return this.id;
    }
 
    public String getName() {
        return this.name;
    }

    public Double getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return "Emplyee {name = " + this.name + ", Id = " + this.id + ", Salary =" + this.salary + "}";
    }
}


public class ComparatorExample {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "rohan",21000.00));
        employees.add(new Employee(104, "Madhu",24000.00));
        employees.add(new Employee(105, "Madhu",299000.00));
        employees.add(new Employee(103,"Seema",20992.00));
        System.out.println("Before sorting : "+ employees);

        // Sort using the custom Comparator we created.
        // Collections.sort(employees, new SortEmplyeeByName());

        // We can use a simple lambda expression
        // Collections.sort(employees, (emp1, emp2) -> emp1.getSalary().compareTo(emp2.getSalary()));


        // Sort employees by their name
        // employees.sort(Comparator.comparing(Employee::getName));

        // Sort employees by their ID
        // employees.sort(Comparator.comparing(Employee::getId));

        // Sort employee
        // Collections.sort(employees,new SortEmployee());

        // We start with the primary sort: by name.
        // Comparator<Employee> combinedComparator = Comparator.comparing(Employee::getName)
        //                                             // Then, we add the secondary sort: by ID.
        //                                             .thenComparing(Employee::getId);

        // // Now, sort the list using this combined comparator.
        // employees.sort(combinedComparator);

        // Sort employees by ID in ascending order.
        // Comparator<Employee> byIdAsc = Comparator.comparing(Employee::getId);

        // Sort employees by ID in descending order.
        // Comparator<Employee> byIdDesc = byIdAsc.reversed();

        // employees.sort(byIdDesc);

        // // You can use it directly on the sort method as well.
        employees.sort(Comparator.comparing(Employee::getId).reversed());

        System.out.println("After sorting : "+ employees);
    }
}
