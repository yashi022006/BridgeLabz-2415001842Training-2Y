package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseManager {
    // EDIT THESE to match your MySQL setup
    private static final String DB_URL = "jdbc:mysql://localhost:3306/studentdb";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "TMKoc987#";

    // Caches
    private final List<Student> studentCache = new ArrayList<>();
    private final List<Result> resultCache = new ArrayList<>();

    public DatabaseManager() {
        // try connecting once to ensure driver loads and DB is reachable
        try (Connection conn = getConnection()) {
            // connection successful
        } catch (SQLException ex) {
            System.err.println("Warning: could not connect to DB at initialization: " + ex.getMessage());
        }
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
    }

    /* ---------- Student CRUD ---------- */

    public boolean insertStudent(Student s) {
        if (s == null || !s.validate()) return false;
        String sql = "INSERT INTO students (id, name, course, semester) VALUES (?, ?, ?, ?)";
        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, s.getId());
            ps.setString(2, s.getName());
            ps.setString(3, s.getCourse());
            ps.setInt(4, s.getSemester());
            int rows = ps.executeUpdate();
            if (rows > 0) {
                studentCache.add(s);
                return true;
            }
        } catch (SQLException e) {
            System.err.println("Insert student failed: " + e.getMessage());
        }
        return false;
    }

    public boolean updateStudent(Student s) {
        if (s == null || !s.validate()) return false;
        String sql = "UPDATE students SET name=?, course=?, semester=? WHERE id=?";
        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, s.getName());
            ps.setString(2, s.getCourse());
            ps.setInt(3, s.getSemester());
            ps.setInt(4, s.getId());
            int rows = ps.executeUpdate();
            if (rows > 0) {
                refreshStudentCache();
                return true;
            }
        } catch (SQLException e) {
            System.err.println("Update student failed: " + e.getMessage());
        }
        return false;
    }

    public boolean deleteStudent(int studentId) {
        String sql = "DELETE FROM students WHERE id=?";
        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, studentId);
            int rows = ps.executeUpdate();
            if (rows > 0) {
                refreshStudentCache();
                refreshResultCache();
                return true;
            }
        } catch (SQLException e) {
            System.err.println("Delete student failed: " + e.getMessage());
        }
        return false;
    }

    public Student getStudentById(int id) {
        String sql = "SELECT id, name, course, semester FROM students WHERE id=?";
        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new Student(rs.getInt("id"), rs.getString("name"),
                            rs.getString("course"), rs.getInt("semester"));
                }
            }
        } catch (SQLException e) {
            System.err.println("Get student failed: " + e.getMessage());
        }
        return null;
    }

    public List<Student> getAllStudents() {
        refreshStudentCache();
        return new ArrayList<>(studentCache);
    }

    private void refreshStudentCache() {
        studentCache.clear();
        String sql = "SELECT id, name, course, semester FROM students";
        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Student s = new Student(rs.getInt("id"), rs.getString("name"),
                        rs.getString("course"), rs.getInt("semester"));
                studentCache.add(s);
            }
        } catch (SQLException e) {
            System.err.println("Refresh student cache failed: " + e.getMessage());
        }
    }

    /* ---------- Result CRUD ---------- */

    public boolean insertResult(Result r) {
        if (r == null) return false;
        String sql = "INSERT INTO results (student_id, subject, marks, grade) VALUES (?, ?, ?, ?)";
        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setInt(1, r.getStudentId());
            ps.setString(2, r.getSubject());
            ps.setInt(3, r.getMarks());
            ps.setString(4, r.getGrade());
            int rows = ps.executeUpdate();
            if (rows > 0) {
                try (ResultSet keys = ps.getGeneratedKeys()) {
                    if (keys.next()) r.setId(keys.getInt(1));
                }
                resultCache.add(r);
                return true;
            }
        } catch (SQLException e) {
            System.err.println("Insert result failed: " + e.getMessage());
        }
        return false;
    }

    public boolean updateResult(Result r) {
        if (r == null) return false;
        String sql = "UPDATE results SET subject=?, marks=?, grade=? WHERE id=?";
        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, r.getSubject());
            ps.setInt(2, r.getMarks());
            ps.setString(3, r.getGrade());
            ps.setInt(4, r.getId());
            int rows = ps.executeUpdate();
            if (rows > 0) {
                refreshResultCache();
                return true;
            }
        } catch (SQLException e) {
            System.err.println("Update result failed: " + e.getMessage());
        }
        return false;
    }

    public boolean deleteResultsByStudentId(int studentId) {
        String sql = "DELETE FROM results WHERE student_id=?";
        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, studentId);
            int rows = ps.executeUpdate();
            if (rows >= 0) {
                refreshResultCache();
                return true;
            }
        } catch (SQLException e) {
            System.err.println("Delete results failed: " + e.getMessage());
        }
        return false;
    }

    public List<Result> getResultsByStudentId(int studentId) {
        List<Result> out = new ArrayList<>();
        String sql = "SELECT id, student_id, subject, marks, grade FROM results WHERE student_id=?";
        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, studentId);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Result r = new Result(
                            rs.getInt("id"),
                            rs.getInt("student_id"),
                            rs.getString("subject"),
                            rs.getInt("marks"),
                            rs.getString("grade")
                    );
                    out.add(r);
                }
            }
        } catch (SQLException e) {
            System.err.println("Get results failed: " + e.getMessage());
        }
        return out;
    }

    private void refreshResultCache() {
        resultCache.clear();
        String sql = "SELECT id, student_id, subject, marks, grade FROM results";
        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Result r = new Result(
                        rs.getInt("id"),
                        rs.getInt("student_id"),
                        rs.getString("subject"),
                        rs.getInt("marks"),
                        rs.getString("grade")
                );
                resultCache.add(r);
            }
        } catch (SQLException e) {
            System.err.println("Refresh result cache failed: " + e.getMessage());
        }
    }
}

