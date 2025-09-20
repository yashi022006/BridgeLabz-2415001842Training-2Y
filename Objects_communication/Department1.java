import java.util.*;

class Department {
    String name;

    Department(String name) {
        this.name = name;
    }
}

class Faculty {
    String name;

    Faculty(String name) {
        this.name = name;
    }
}

class University {
    String uniName;
    List<Department> departments; 
    List<Faculty> faculties;      

    University(String uniName) {
        this.uniName = uniName;
        departments = new ArrayList<>();
        faculties = new ArrayList<>();
    }

    void addDepartment(Department d) {
        departments.add(d);
    }

    void addFaculty(Faculty f) {
        faculties.add(f);
    }

    void showDetails() {
        System.out.println("University: " + uniName);
        System.out.println("Departments:");
        for (Department d : departments) {
            System.out.println("- " + d.name);
        }
        System.out.println("Faculties:");
        for (Faculty f : faculties) {
            System.out.println("- " + f.name);
        }
    }
}

public class Department1 {
    public static void main(String[] args) {
        University u1 = new University("XYZ University");

        Department d1 = new Department("Computer Science");
        Department d2 = new Department("Mechanical");

        Faculty f1 = new Faculty("Dr. Sharma");
        Faculty f2 = new Faculty("Dr. Gupta");

        u1.addDepartment(d1);
        u1.addDepartment(d2);
        u1.addFaculty(f1);
        u1.addFaculty(f2);

        u1.showDetails();

        
        u1 = null;
        System.gc();
        System.out.println("University deleted, departments deleted too. Faculties still exist: " + f1.name);
    }
}

