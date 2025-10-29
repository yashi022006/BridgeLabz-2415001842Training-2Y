package Ques1.college.student;
public class Student{
    int st_roll_no;
    String st_name;
    public Student(int st_roll_no,String st_name){
        this.st_roll_no=st_roll_no;
        this.st_name=st_name;
    }
    public void display(){
        System.out.println(this.st_roll_no);
        System.out.println(this.st_name);
    }
}
