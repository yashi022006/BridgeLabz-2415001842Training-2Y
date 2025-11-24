
import java.util.*;

public class GroupEmployees {
    public static void main(String[] args) {
        List<Employee> list = List.of(
            new Employee("Alice", "HR"),
            new Employee("Bob", "IT"),
            new Employee("Carol", "HR")
        );

        Map<String, List<Employee>> grouped = new HashMap<>();

        for (Employee e : list) {
            grouped.putIfAbsent(e.department, new ArrayList<>());
            grouped.get(e.department).add(e);
        }

        System.out.println(grouped);
    }
}
class Employee {
    String name, department;

    Employee(String n, String d) {
        name = n;
        department = d;
    }

    public String toString() {
        return name;
    }
}

