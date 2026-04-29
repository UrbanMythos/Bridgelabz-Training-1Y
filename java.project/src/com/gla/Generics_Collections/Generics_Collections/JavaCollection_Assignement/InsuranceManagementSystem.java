package JavaCollection_Assignement;
import java.util.*;
import java.time.*;

class Policy implements Comparable<Policy> {
    int policyNumber;
    String holderName;
    LocalDate expiryDate;
    String coverageType;
    double premium;

    public Policy(int policyNumber, String holderName, LocalDate expiryDate,
                  String coverageType, double premium) {
        this.policyNumber = policyNumber;
        this.holderName = holderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premium = premium;
    }

    public int hashCode() {
        return Objects.hash(policyNumber);
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Policy)) return false;
        Policy p = (Policy) obj;
        return this.policyNumber == p.policyNumber;
    }

    public int compareTo(Policy p) {
        return this.expiryDate.compareTo(p.expiryDate);
    }

    public String toString() {
        return policyNumber + " | " + holderName + " | " + expiryDate +
                " | " + coverageType + " | ₹" + premium;
    }
}

public class InsuranceManagementSystem {

    public static void main(String[] args) {

        Set<Policy> hashSet = new HashSet<>();
        Set<Policy> linkedSet = new LinkedHashSet<>();
        Set<Policy> treeSet = new TreeSet<>();

        Policy p1 = new Policy(101, "Aman", LocalDate.now().plusDays(10), "Health", 5000);
        Policy p2 = new Policy(102, "Riya", LocalDate.now().plusDays(40), "Auto", 3000);
        Policy p3 = new Policy(103, "Raj", LocalDate.now().plusDays(20), "Home", 4000);
        Policy p4 = new Policy(101, "Duplicate", LocalDate.now().plusDays(5), "Health", 5000);

        Collections.addAll(hashSet, p1, p2, p3, p4);
        Collections.addAll(linkedSet, p1, p2, p3, p4);
        Collections.addAll(treeSet, p1, p2, p3, p4);

        System.out.println("All Unique Policies (HashSet):");
        hashSet.forEach(System.out::println);

        System.out.println("\nPolicies Expiring Soon:");
        for (Policy p : hashSet) {
            if (p.expiryDate.isBefore(LocalDate.now().plusDays(30))) {
                System.out.println(p);
            }
        }

        System.out.println("\nHealth Policies:");
        for (Policy p : hashSet) {
            if (p.coverageType.equalsIgnoreCase("Health")) {
                System.out.println(p);
            }
        }

        System.out.println("\nDuplicate Policy Example:");
        Set<Integer> seen = new HashSet<>();
        for (Policy p : Arrays.asList(p1, p2, p3, p4)) {
            if (!seen.add(p.policyNumber)) {
                System.out.println("Duplicate found: " + p.policyNumber);
            }
        }

        System.out.println("\nSorted Policies (TreeSet):");
        treeSet.forEach(System.out::println);

        performanceTest();
    }

    public static void performanceTest() {
        int n = 10000;

        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkedSet = new LinkedHashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        long start, end;

        start = System.nanoTime();
        for (int i = 0; i < n; i++) hashSet.add(i);
        end = System.nanoTime();
        System.out.println("\nHashSet Add Time: " + (end - start));

        start = System.nanoTime();
        for (int i = 0; i < n; i++) linkedSet.add(i);
        end = System.nanoTime();
        System.out.println("LinkedHashSet Add Time: " + (end - start));

        start = System.nanoTime();
        for (int i = 0; i < n; i++) treeSet.add(i);
        end = System.nanoTime();
        System.out.println("TreeSet Add Time: " + (end - start));
    }
}