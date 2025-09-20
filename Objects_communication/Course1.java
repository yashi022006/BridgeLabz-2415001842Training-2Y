import java.util.*;

class Course {
    String courseName;
    List<Student> students = new ArrayList<>();

    Course(String courseName) {
        this.courseName = courseName;
    }

    void addStudent(Student s) {
        students.add(s);
    }

    void showStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student s : students) {
            System.out.println("- " + s.name);
        }
    }
}

class Student {
    String name;
    List<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enrollCourse(Course c) {
        courses.add(c);
        c.addStudent(this);
    }

    void showCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course c : courses) {
            System.out.println("- " + c.courseName);
        }
    }
}

class School {
    String schoolName;
    List<Student> students;  // Aggregation

    School(String schoolName) {
        this.schoolName = schoolName;
        students = new ArrayList<>();
    }

    void addStudent(Student s) {
        students.add(s);
    }

    void showStudents() {
        System.out.println("Students in " + schoolName + ":");
        for (Student s : students) {
            System.out.println("- " + s.name);
        }
    }
}

public class Course1 {
    public static void main(String[] args) {
        School school = new School("ABC Public School");

        Student s1 = new Student("Amit");
        Student s2 = new Student("Neha");

        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c1);

        school.addStudent(s1);
        school.addStudent(s2);

        s1.showCourses();
        s2.showCourses();
        c1.showStudents();
        c2.showStudents();
    }
}
