import java.util.*;

class Company {
    String name;
    List<Department> departments;

    Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    void addDepartment(String deptName) {
        Department d = new Department(deptName);
        departments.add(d);
        System.out.println("Department " + deptName + " added to " + name);
    }

    void showCompanyDetails() {
        System.out.println("Company: " + name);
        for (Department d : departments) {
            d.showDepartmentDetails();
        }
    }

    void deleteCompany() {
        System.out.println("Deleting company " + name + "...");
        departments.clear(); // saare departments aur employees bhi clear
        System.out.println("All departments and employees removed.");
    }

    // Inner class Department (composition: cannot exist without Company)
    class Department {
        String deptName;
        List<Employee> employees;

        Department(String deptName) {
            this.deptName = deptName;
            this.employees = new ArrayList<>();
        }

        void addEmployee(String empName) {
            Employee e = new Employee(empName);
            employees.add(e);
            System.out.println("Employee " + empName + " added to " + deptName);
        }

        void showDepartmentDetails() {
            System.out.println(" Department: " + deptName);
            for (Employee e : employees) {
                System.out.println("   - " + e.empName);
            }
        }

        // Inner class Employee (composition: cannot exist without Department)
        class Employee {
            String empName;

            Employee(String empName) {
                this.empName = empName;
            }
        }
    }
}

public class Composition {
    public static void main(String[] args) {
        Company c1 = new Company("TechCorp");

        
        c1.addDepartment("HR");
        c1.addDepartment("IT");

    
        c1.departments.get(0).addEmployee("Amit");
        c1.departments.get(0).addEmployee("Neha");

        c1.departments.get(1).addEmployee("Rohit");
        c1.departments.get(1).addEmployee("Priya");

        
        c1.showCompanyDetails();

        
        c1.deleteCompany();
        c1.showCompanyDetails(); 
    }
}

