package org.example;

public class Student {
    private int id;
    private String name;
    private String course;
    private int semester;

    public Student(int id, String name, String course, int semester) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.semester = semester;
    }

    // Getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    public int getSemester() { return semester; }
    public void setSemester(int semester) { this.semester = semester; }

    public boolean validate() {
        return id > 0 && name != null && !name.trim().isEmpty();
    }

    @Override
    public String toString() {
        return String.format("Student[id=%d, name=%s, course=%s, sem=%d]",
                id, name, course, semester);
    }
}
