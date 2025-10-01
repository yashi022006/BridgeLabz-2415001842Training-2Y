class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Teacher extends Person {
    String subject;
    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    void displayRole() {
        System.out.println("Teacher of " + subject);
    }
}

class Student extends Person {
    int grade;
    Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }
    void displayRole() {
        System.out.println("Student of grade " + grade);
    }
}

class Staff extends Person {
    String position;
    Staff(String name, int age, String position) {
        super(name, age);
        this.position = position;
    }
    void displayRole() {
        System.out.println("Staff: " + position);
    }
}

public class School {
    public static void main(String[] args) {
        Teacher t = new Teacher("Alice", 30, "Math");
        Student s = new Student("Bob", 16, 10);
        Staff st = new Staff("Charlie", 40, "Clerk");
        t.displayRole();
        s.displayRole();
        st.displayRole();
    }
}

