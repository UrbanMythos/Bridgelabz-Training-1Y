package JavaCollection_Assignement;
import java.util.*;

class Patient {
    int id;
    String name;

    public Patient(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int hashCode() {
        return Objects.hash(id);
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Patient)) return false;
        Patient p = (Patient) obj;
        return this.id == p.id;
    }

    public String toString() {
        return id + " - " + name;
    }
}

public class HospitalPatientSystem {
    public static void main(String[] args) {

        Set<Patient> admitted = new HashSet<>();
        Queue<Patient> waitingQueue = new LinkedList<>();
        Stack<Patient> discharged = new Stack<>();
        List<Patient> history = new ArrayList<>();

        admit(admitted, waitingQueue, history, new Patient(1, "Aman"));
        admit(admitted, waitingQueue, history, new Patient(2, "Riya"));
        admit(admitted, waitingQueue, history, new Patient(3, "Rahul"));
        admit(admitted, waitingQueue, history, new Patient(1, "Duplicate"));

        while (!waitingQueue.isEmpty()) {
            Patient p = waitingQueue.remove();
            discharged.push(p);
        }

        if (!discharged.isEmpty()) {
            Patient p = discharged.pop();
            admitted.add(p);
            waitingQueue.add(p);
        }

        System.out.println("Admitted Patients:");
        for (Patient p : admitted) {
            System.out.println(p);
        }

        System.out.println("\nPatient History:");
        for (Patient p : history) {
            System.out.println(p);
        }
    }

    public static void admit(Set<Patient> admitted, Queue<Patient> queue, List<Patient> history, Patient p) {
        if (admitted.add(p)) {
            queue.add(p);
            history.add(p);
        }
    }
}