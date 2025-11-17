package PolicyManagement_System;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class PolicyManager {

    private Set<Policy> hashSet = new HashSet<>();
    private Set<Policy> linkedHashSet = new LinkedHashSet<>();
    private Set<Policy> treeSet = new TreeSet<>();

    // Add policy to all sets
    public void addPolicy(Policy p) {
        hashSet.add(p);
        linkedHashSet.add(p);
        treeSet.add(p);
    }

    // Retrieve all unique policies
    public void displayAllPolicies() {
        System.out.println("All Policies:");
        for (Policy p : hashSet) {
            System.out.println(p);
        }
    }

    // Filter: Expiring within next 30 days
    public void displayExpiringSoon() {
        System.out.println("\nPolicies Expiring Within 30 Days:");
        LocalDate today = LocalDate.now();

        for (Policy p : treeSet) {
            long days = ChronoUnit.DAYS.between(today, p.getExpiryDate());
            if (days >= 0 && days <= 30) {
                System.out.println(p);
            }
        }
    }

    // Filter: By coverage type
    public void displayByCoverage(String type) {
        System.out.println("\nPolicies with Coverage Type: " + type);

        for (Policy p : hashSet) {
            if (p.getCoverageType().equalsIgnoreCase(type)) {
                System.out.println(p);
            }
        }
    }

    // Identify duplicate policy numbers
    public void displayDuplicates() {
        System.out.println("\nDuplicate Policies:");

        Set<String> seen = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for (Policy p : linkedHashSet) {
            if (!seen.add(p.getPolicyNumber())) {
                duplicates.add(p.getPolicyNumber());
            }
        }

        for (String d : duplicates) {
            System.out.println("Duplicate Policy Number: " + d);
        }
    }

    // Performance testing
    public void comparePerformance() {
        System.out.println("\n--- Performance Testing ---");

        int operations = 100000;
        List<Policy> bulkList = new ArrayList<>();

        // Generate random policies
        for (int i = 0; i < operations; i++) {
            bulkList.add(
                new Policy("P" + i, "User" + i,
                LocalDate.now().plusDays(i % 50),
                "Health", 5000 + i)
            );
        }

        measure("HashSet Add", () -> {
            Set<Policy> set = new HashSet<>();
            set.addAll(bulkList);
        });

        measure("LinkedHashSet Add", () -> {
            Set<Policy> set = new LinkedHashSet<>();
            set.addAll(bulkList);
        });

        measure("TreeSet Add", () -> {
            Set<Policy> set = new TreeSet<>();
            set.addAll(bulkList);
        });
    }

    // Helper method
    private void measure(String name, Runnable task) {
        long start = System.nanoTime();
        task.run();
        long end = System.nanoTime();
        System.out.println(name + ": " + (end - start) / 1_000_000 + " ms");
    }
}
