package JavaCollection_Assignement.QueueInterface;
import java.util.*;

class Patient implements Comparable<Patient> {
    String name;
    int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    public int compareTo(Patient other) {
        return other.severity - this.severity; // descending order
    }

    public String toString() {
        return name + " (Severity: " + severity + ")";
    }
}

public class HospitalTriageSystem {
    public static void main(String[] args) {

        PriorityQueue<Patient> queue = new PriorityQueue<>();

        queue.add(new Patient("John", 3));
        queue.add(new Patient("Alice", 5));
        queue.add(new Patient("Bob", 2));

        System.out.println("Treatment Order:");

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}