package JavaCollection_Assignement;
import java.util.*;

class AdmissionStudent implements Comparable<AdmissionStudent> {
    int id;
    String name;
    int marks;

    public AdmissionStudent(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int hashCode() {
        return Objects.hash(id);
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof AdmissionStudent)) return false;
        AdmissionStudent s = (AdmissionStudent) obj;
        return this.id == s.id;
    }

    public int compareTo(AdmissionStudent s) {
        if (s.marks != this.marks) {
            return s.marks - this.marks;
        }
        if (this.id != s.id) {
            return this.id - s.id;
        }
        return this.name.compareTo(s.name);
    }

    public String toString() {
        return id + " - " + name + " | Marks: " + marks;
    }
}

public class CollegeAdmissionSystem {
    public static void main(String[] args) {

        List<AdmissionStudent> applicants = new ArrayList<>();
        applicants.add(new AdmissionStudent(1, "Aman", 85));
        applicants.add(new AdmissionStudent(2, "Riya", 92));
        applicants.add(new AdmissionStudent(3, "Rahul", 78));
        applicants.add(new AdmissionStudent(4, "Sneha", 88));

        Set<AdmissionStudent> shortlisted = new HashSet<>();

        for (AdmissionStudent s : applicants) {
            if (s.marks >= 80) {
                shortlisted.add(s);
            }
        }

        Queue<AdmissionStudent> interviewQueue = new LinkedList<>(shortlisted);

        TreeSet<AdmissionStudent> meritList = new TreeSet<>();

        while (!interviewQueue.isEmpty()) {
            AdmissionStudent s = interviewQueue.remove();
            meritList.add(s);
        }

        System.out.println("Final Merit List:");
        for (AdmissionStudent s : meritList) {
            System.out.println(s);
        }
    }
}