package Hospital_Management_System;

public class Main {
    public static void main(String[] args) {

        HospitalSystem hs = new HospitalSystem();

        Patient p1 = new Patient("P1", "Amit");
        Patient p2 = new Patient("P2", "Riya");
        Patient p3 = new Patient("P3", "John");

        hs.admitPatient(p1);
        hs.admitPatient(p2);
        hs.admitPatient(p3);

        hs.treatPatient();  // Treat P1
        hs.dischargePatient(p1);

        hs.treatPatient();  // Treat P2
        hs.dischargePatient(p2);

        hs.showStatus();

        
        hs.reAdmitPatient();

        hs.showStatus();
    }
}

