package org.example;

public class Result {
    private int id; // DB auto-increment id
    private int studentId;
    private String subject;
    private int marks;
    private String grade;

    public Result(int studentId, String subject, int marks) {
        this.studentId = studentId;
        this.subject = subject;
        this.marks = marks;
        this.grade = calculateGrade(marks);
    }

    public Result(int id, int studentId, String subject, int marks, String grade) {
        this.id = id;
        this.studentId = studentId;
        this.subject = subject;
        this.marks = marks;
        this.grade = grade;
    }

    // Getters & setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getStudentId() { return studentId; }
    public void setStudentId(int studentId) { this.studentId = studentId; }

    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }

    public int getMarks() { return marks; }
    public void setMarks(int marks) { this.marks = marks; this.grade = calculateGrade(marks); }

    public String getGrade() { return grade; }

    public static String calculateGrade(int marks) {
        if (marks >= 90) return "A+";
        if (marks >= 80) return "A";
        if (marks >= 70) return "B+";
        if (marks >= 60) return "B";
        if (marks >= 50) return "C";
        return "F";
    }

    @Override
    public String toString() {
        return String.format("Result[id=%d, studentId=%d, subject=%s, marks=%d, grade=%s]",
                id, studentId, subject, marks, grade);
    }
}

