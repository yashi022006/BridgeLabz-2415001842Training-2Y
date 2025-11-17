package PolicyManagement_System;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        PolicyManager manager = new PolicyManager();

        manager.addPolicy(new Policy("P101", "Amit", LocalDate.now().plusDays(10), "Health", 5000));
        manager.addPolicy(new Policy("P102", "Riya", LocalDate.now().plusDays(40), "Auto", 3000));
        manager.addPolicy(new Policy("P103", "John", LocalDate.now().plusDays(5), "Home", 6000));
        manager.addPolicy(new Policy("P101", "Duplicate", LocalDate.now().plusDays(20), "Health", 5000)); // duplicate

        manager.displayAllPolicies();
        manager.displayExpiringSoon();
        manager.displayByCoverage("Health");
        manager.displayDuplicates();

        manager.comparePerformance();
    }
}

