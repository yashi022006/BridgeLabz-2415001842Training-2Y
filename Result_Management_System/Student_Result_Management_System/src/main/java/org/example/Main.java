package org.example;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static final DatabaseManager db = new DatabaseManager();
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== Student Result Management System ===");
        boolean running = true;
        while (running) {
            printMenu();
            String choice = sc.nextLine().trim();
            switch (choice) {
                case "1": createStudent(); break;
                case "2": updateStudent(); break;
                case "3": deleteStudent(); break;
                case "4": listStudents(); break;
                case "5": addResult(); break;
                case "6": listResultsForStudent(); break;
                case "7": updateResult(); break;
                case "8": deleteResultsForStudent(); break;
                case "9": running = false; break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
        System.out.println("Exit..");
    }

    private static void printMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Add student");
        System.out.println("2. Update student");
        System.out.println("3. Delete student");
        System.out.println("4. List all students");
        System.out.println("5. Add result for student");
        System.out.println("6. List results for a student");
        System.out.println("7. Update result (change marks/subject)");
        System.out.println("8. Delete all results for a student");
        System.out.println("9. Exit");
        System.out.print("Choose: ");
    }

    private static void createStudent() {
        try {
            System.out.print("Enter ID (int): ");
            int id = Integer.parseInt(sc.nextLine().trim());
            System.out.print("Enter name: ");
            String name = sc.nextLine().trim();
            System.out.print("Enter course: ");
            String course = sc.nextLine().trim();
            System.out.print("Enter semester (int): ");
            int sem = Integer.parseInt(sc.nextLine().trim());
            Student s = new Student(id, name, course, sem);
            boolean ok = db.insertStudent(s);
            System.out.println(ok ? "Student added." : "Failed to add student (maybe duplicate ID).");
        } catch (NumberFormatException ex) {
            System.out.println("Invalid number input.");
        }
    }

    private static void updateStudent() {
        try {
            System.out.print("Enter ID to update: ");
            int id = Integer.parseInt(sc.nextLine().trim());
            Student existing = db.getStudentById(id);
            if (existing == null) { System.out.println("Student not found."); return; }
            System.out.print("New name (blank to keep): ");
            String name = sc.nextLine().trim();
            System.out.print("New course (blank to keep): ");
            String course = sc.nextLine().trim();
            System.out.print("New semester (blank to keep): ");
            String semStr = sc.nextLine().trim();

            if (!name.isEmpty()) existing.setName(name);
            if (!course.isEmpty()) existing.setCourse(course);
            if (!semStr.isEmpty()) existing.setSemester(Integer.parseInt(semStr));

            boolean ok = db.updateStudent(existing);
            System.out.println(ok ? "Student updated." : "Update failed.");
        } catch (NumberFormatException ex) {
            System.out.println("Invalid number input.");
        }
    }

    private static void deleteStudent() {
        try {
            System.out.print("Enter ID to delete: ");
            int id = Integer.parseInt(sc.nextLine().trim());
            boolean ok = db.deleteStudent(id);
            System.out.println(ok ? "Student and related results deleted." : "Delete failed or student not found.");
        } catch (NumberFormatException ex) {
            System.out.println("Invalid ID.");
        }
    }

    private static void listStudents() {
        List<Student> students = db.getAllStudents();
        if (students.isEmpty()) System.out.println("No students found.");
        else students.forEach(System.out::println);
    }

    private static void addResult() {
        try {
            System.out.print("Student ID: ");
            int sid = Integer.parseInt(sc.nextLine().trim());
            Student s = db.getStudentById(sid);
            if (s == null) { System.out.println("Student not found."); return; }
            System.out.print("Subject: ");
            String subject = sc.nextLine().trim();
            System.out.print("Marks (0-100): ");
            int marks = Integer.parseInt(sc.nextLine().trim());
            if (marks < 0 || marks > 100) { System.out.println("Marks must be 0-100."); return; }
            Result r = new Result(sid, subject, marks);
            boolean ok = db.insertResult(r);
            System.out.println(ok ? "Result added: " + r : "Failed to add result.");
        } catch (NumberFormatException ex) {
            System.out.println("Invalid input.");
        }
    }

    private static void listResultsForStudent() {
        try {
            System.out.print("Student ID: ");
            int sid = Integer.parseInt(sc.nextLine().trim());
            List<Result> res = db.getResultsByStudentId(sid);
            if (res.isEmpty()) System.out.println("No results for this student.");
            else res.forEach(System.out::println);
        } catch (NumberFormatException ex) {
            System.out.println("Invalid input.");
        }
    }

    private static void updateResult() {
        try {
            System.out.print("Enter result ID to update: ");
            int rid = Integer.parseInt(sc.nextLine().trim());
            // fetch by listing all results for simplicity (no single-get implemented)
            // We'll search through student's results
            boolean found = false;
            for (Student s : db.getAllStudents()) {
                List<Result> list = db.getResultsByStudentId(s.getId());
                for (Result r : list) {
                    if (r.getId() == rid) {
                        found = true;
                        System.out.println("Found: " + r);
                        System.out.print("New subject (blank keep): ");
                        String sub = sc.nextLine().trim();
                        System.out.print("New marks (blank keep): ");
                        String marksStr = sc.nextLine().trim();
                        if (!sub.isEmpty()) r.setSubject(sub);
                        if (!marksStr.isEmpty()) r.setMarks(Integer.parseInt(marksStr));
                        // grade recalculated when marks set
                        boolean ok = db.updateResult(r);
                        System.out.println(ok ? "Result updated." : "Update failed.");
                        return;
                    }
                }
            }
            if (!found) System.out.println("Result id not found.");
        } catch (NumberFormatException ex) {
            System.out.println("Invalid input.");
        }
    }

    private static void deleteResultsForStudent() {
        try {
            System.out.print("Student ID: ");
            int sid = Integer.parseInt(sc.nextLine().trim());
            boolean ok = db.deleteResultsByStudentId(sid);
            System.out.println(ok ? "Results deleted for student." : "Delete failed or no results found.");
        } catch (NumberFormatException ex) {
            System.out.println("Invalid input.");
        }
    }
}
