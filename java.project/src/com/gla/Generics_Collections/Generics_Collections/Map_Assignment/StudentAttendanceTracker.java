package Map_Assignment;
import java.util.*;

public class StudentAttendanceTracker {
    public static void main(String[] args) {

        Map<String, Integer> attendance = new HashMap<>();

        String[] students = {"Aman", "Riya", "Rahul", "Sneha", "Karan"};

        for (String s : students) {
            attendance.put(s, 0);
        }

        List<List<String>> monthAttendance = Arrays.asList(
                Arrays.asList("Aman", "Riya", "Rahul"),
                Arrays.asList("Aman", "Riya"),
                Arrays.asList("Riya", "Rahul", "Sneha"),
                Arrays.asList("Aman", "Karan"),
                Arrays.asList("Aman", "Riya", "Sneha"),
                Arrays.asList("Rahul", "Karan"),
                Arrays.asList("Aman", "Riya", "Rahul", "Sneha"),
                Arrays.asList("Aman"),
                Arrays.asList("Riya", "Rahul"),
                Arrays.asList("Aman", "Riya", "Karan"),
                Arrays.asList("Sneha", "Rahul"),
                Arrays.asList("Aman", "Riya"),
                Arrays.asList("Karan"),
                Arrays.asList("Aman", "Rahul", "Sneha"),
                Arrays.asList("Riya", "Karan")
        );

        for (List<String> day : monthAttendance) {
            for (String name : day) {
                attendance.put(name, attendance.get(name) + 1);
            }
        }

        System.out.println("Final Attendance:");
        for (Map.Entry<String, Integer> entry : attendance.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        int threshold = 10;

        System.out.println("\nUnder-attending Students (< " + threshold + " days):");
        for (Map.Entry<String, Integer> entry : attendance.entrySet()) {
            if (entry.getValue() < threshold) {
                System.out.println(entry.getKey());
            }
        }
    }
}