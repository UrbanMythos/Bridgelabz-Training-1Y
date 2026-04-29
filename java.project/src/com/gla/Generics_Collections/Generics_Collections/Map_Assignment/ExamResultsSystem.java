package Map_Assignment;
import java.util.*;

public class ExamResultsSystem {
    public static void main(String[] args) {

        Map<String, Map<String, Integer>> data = new HashMap<>();

        addMarks(data, "Math", "Aman", 85);
        addMarks(data, "Math", "Riya", 92);
        addMarks(data, "Math", "Rahul", 78);

        addMarks(data, "Science", "Aman", 88);
        addMarks(data, "Science", "Riya", 81);
        addMarks(data, "Science", "Rahul", 95);

        addMarks(data, "English", "Aman", 72);
        addMarks(data, "English", "Riya", 89);
        addMarks(data, "English", "Rahul", 91);

        System.out.println("Topper per Subject:");
        findToppers(data);

        System.out.println("\nAverage per Subject:");
        findAverages(data);

        System.out.println("\nSubjects with score > 90:");
        findAbove90(data);
    }

    public static void addMarks(Map<String, Map<String, Integer>> data,
                                String subject, String student, int marks) {

        data.putIfAbsent(subject, new HashMap<>());
        data.get(subject).put(student, marks);
    }

    public static void findToppers(Map<String, Map<String, Integer>> data) {

        for (String subject : data.keySet()) {
            String topper = null;
            int max = Integer.MIN_VALUE;

            for (Map.Entry<String, Integer> entry : data.get(subject).entrySet()) {
                if (entry.getValue() > max) {
                    max = entry.getValue();
                    topper = entry.getKey();
                }
            }

            System.out.println(subject + " -> " + topper + " (" + max + ")");
        }
    }

    public static void findAverages(Map<String, Map<String, Integer>> data) {

        for (String subject : data.keySet()) {
            int sum = 0;
            int count = 0;

            for (int marks : data.get(subject).values()) {
                sum += marks;
                count++;
            }

            double avg = (double) sum / count;
            System.out.println(subject + " -> " + avg);
        }
    }

    public static void findAbove90(Map<String, Map<String, Integer>> data) {

        for (String subject : data.keySet()) {
            boolean found = false;

            for (int marks : data.get(subject).values()) {
                if (marks > 90) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println(subject);
            }
        }
    }
}