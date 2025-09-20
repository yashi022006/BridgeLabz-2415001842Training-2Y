class Patient {
    private static String hospitalName = "City Hospital";
    private static int totalPatients = 0;

    private String name;
    private int age;
    private String ailment;
    private final int patientID;

    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public void displayPatient() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Patient ID: " + patientID);
        }
    }

    public static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }
}

public class Patient1 {
    public static void main(String[] args) {
        Patient p1 = new Patient("Rahul", 30, "Fever", 501);
        Patient p2 = new Patient("Anita", 45, "Diabetes", 502);

        p1.displayPatient();
        p2.displayPatient();

        Patient.getTotalPatients();
    }
}

