package Hospital_Management_System;

import java.util.*;

public class HospitalSystem {

    private Set<Patient> admitted = new HashSet<>();           // avoid duplicates
    private Queue<Patient> waitingQueue = new LinkedList<>();  // for treatment
    private Stack<Patient> discharged = new Stack<>();         // recently discharged
    private List<Patient> history = new ArrayList<>();         // all ever admitted

    // 1. Admit patients + queue for treatment
    public void admitPatient(Patient p) {
        if (admitted.add(p)) {
            waitingQueue.add(p);
            history.add(p);
            System.out.println("Admitted: " + p);
        } else {
            System.out.println("Duplicate patient! Already admitted: " + p);
        }
    }

    // 2. Treat patients in order of arrival
    public void treatPatient() {
        if (waitingQueue.isEmpty()) {
            System.out.println("No patients waiting for treatment.");
            return;
        }

        Patient p = waitingQueue.remove();
        System.out.println("Treating: " + p);
    }

    // 3. Discharge patient (after treatment)
    public void dischargePatient(Patient p) {
        if (admitted.remove(p)) {
            discharged.push(p);
            System.out.println("Discharged: " + p);
        } else {
            System.out.println("Patient not found in admitted list.");
        }
    }

    // 4. Re-admit recently discharged patient
    public void reAdmitPatient() {
        if (discharged.isEmpty()) {
            System.out.println("No recently discharged patients.");
            return;
        }

        Patient p = discharged.pop();
        admitPatient(p);  // reuse the admit logic
        System.out.println("Re-admitted (from stack): " + p);
    }

    // Display helpers
    public void showStatus() {
        System.out.println("\n--- Current Hospital Status ---");
        System.out.println("Admitted Patients: " + admitted);
        System.out.println("Waiting Queue: " + waitingQueue);
        System.out.println("Discharged Stack: " + discharged);
        System.out.println("History: " + history);
        System.out.println("--------------------------------\n");
    }
}
