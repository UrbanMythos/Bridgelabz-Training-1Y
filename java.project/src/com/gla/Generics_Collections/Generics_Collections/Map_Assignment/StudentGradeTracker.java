package Map_Assignment;
import java.util.*;

public class StudentGradeTracker {
    public static void main(String[] args) {

        Map<String, Double> grades = new HashMap<>();

        grades.put("Aman", 85.5);
        grades.put("Riya", 92.0);
        grades.put("Rahul", 78.0);

        grades.put("Aman", 88.0);

        grades.remove("Rahul");

        TreeMap<String, Double> sorted = new TreeMap<>(grades);

        for (Map.Entry<String, Double> entry : sorted.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
