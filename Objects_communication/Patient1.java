import java.util.*;

class Patient {
    String name;
    Patient(String name) { this.name = name; }
}

class Doctor {
    String name;
    List<Patient> patients;

    Doctor(String name) {
        this.name = name;
        patients = new ArrayList<>();
    }

    void consult(Patient p) {
        patients.add(p);
        System.out.println("Doctor " + name + " is consulting patient " + p.name);
    }

    void showPatients() {
        System.out.println("Patients of Dr. " + name + ":");
        for (Patient p : patients) {
            System.out.println("- " + p.name);
        }
    }
}

class Hospital {
    String hospitalName;
    List<Doctor> doctors;

    Hospital(String name) {
        hospitalName = name;
        doctors = new ArrayList<>();
    }

    void addDoctor(Doctor d) {
        doctors.add(d);
    }
}

public class Patient1 {
    public static void main(String[] args) {
        Hospital h1 = new Hospital("City Hospital");

        Doctor d1 = new Doctor("Dr. Kumar");
        Doctor d2 = new Doctor("Dr. Verma");

        Patient p1 = new Patient("Ankit");
        Patient p2 = new Patient("Riya");

        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);

        d1.showPatients();
        d2.showPatients();
    }
}

