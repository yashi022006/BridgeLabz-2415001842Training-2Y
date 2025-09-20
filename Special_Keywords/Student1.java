class Student {
    private static String universityName = "Delhi University";
    private static int totalStudents = 0;

    private String name;
    private final int rollNumber;
    private String grade;

    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Name: " + name);
            System.out.println("Roll No: " + rollNumber);
            System.out.println("Grade: " + grade);
        }
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }
}

public class Student1 {
    public static void main(String[] args) {
        Student s1 = new Student("Karan", 401, "A");
        Student s2 = new Student("Meena", 402, "B");

        s1.displayStudentDetails();
        s2.displayStudentDetails();

        Student.displayTotalStudents();
    }
}

