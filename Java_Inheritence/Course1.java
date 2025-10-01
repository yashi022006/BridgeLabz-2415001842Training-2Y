class Course {
    String courseName;
    int duration;
    Course(String name, int duration) {
        this.courseName = name;
        this.duration = duration;
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;
    OnlineCourse(String name, int duration, String platform, boolean recorded) {
        super(name, duration);
        this.platform = platform;
        this.isRecorded = recorded;
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee, discount;
    PaidOnlineCourse(String name, int duration, String platform, boolean recorded, double fee, double discount) {
        super(name, duration, platform, recorded);
        this.fee = fee;
        this.discount = discount;
    }
}

public class Course1 {
    public static void main(String[] args) {
        PaidOnlineCourse poc = new PaidOnlineCourse("DSA", 6, "Udemy", true, 5000, 20);
        System.out.println("Course: " + poc.courseName + ", Platform: " + poc.platform + ", Fee: " + poc.fee);
    }
}

