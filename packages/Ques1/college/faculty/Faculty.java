package Ques1.college.faculty;

public class Faculty {
    String faculty_name;
    String Subject;
    public Faculty(String faculty_name, String Subject){
        this.faculty_name = faculty_name;
        this.Subject = Subject;
    }
    public void display(){
        System.out.println(this.faculty_name);
        System.out.println(this.Subject);
    }
}
