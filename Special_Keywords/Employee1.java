class Employee {
    private static String companyName = "TechCorp";
    private static int totalEmployees = 0;

    private String name;
    private final int id;
    private String designation;

    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public void displayEmployee() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName);
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Designation: " + designation);
        }
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
}

public class Employee1 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ravi", 201, "Developer");
        Employee e2 = new Employee("Priya", 202, "Tester");

        e1.displayEmployee();
        e2.displayEmployee();

        Employee.displayTotalEmployees();
    }
}

