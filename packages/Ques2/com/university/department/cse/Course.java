package Ques2.com.university.department.cse;

public class Course {
    String courseName;
    String courseCode;
    int instructor;
    public Course(String courseName, String courseCode, int instructor) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.instructor = instructor;
    }
    public void display() {
        System.out.println(this.courseName);
        System.out.println(this.courseCode);
        System.out.println(this.instructor);
    }
}
