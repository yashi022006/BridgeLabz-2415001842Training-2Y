package Ques1;
import Ques1.college.student.Student;
import Ques1.college.faculty.Faculty;
public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "John Doe");
        Faculty faculty = new Faculty("Dr.Smith", "Mathematics");

        student.display();
        faculty.display();
    }
}
