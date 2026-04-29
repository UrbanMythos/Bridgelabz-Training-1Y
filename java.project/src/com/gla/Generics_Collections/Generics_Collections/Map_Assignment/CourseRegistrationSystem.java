package Map_Assignment;
import java.util.*;

public class CourseRegistrationSystem {
    public static void main(String[] args) {

        Map<String, Integer> courses = new HashMap<>();

        courses.put("CS101", 48);
        courses.put("CS102", 52);
        courses.put("CS103", 3);
        courses.put("CS104", 10);
        courses.put("CS105", 55);

        addStudent(courses, "CS101");
        addStudent(courses, "CS103");

        dropStudent(courses, "CS104");
        dropStudent(courses, "CS103");

        System.out.println("Near Full Courses (>=50):");
        for (Map.Entry<String, Integer> entry : courses.entrySet()) {
            if (entry.getValue() >= 50) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }

        System.out.println("\nUnder-Subscribed Courses (<5):");
        for (Map.Entry<String, Integer> entry : courses.entrySet()) {
            if (entry.getValue() < 5) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }

    public static void addStudent(Map<String, Integer> map, String course) {
        if (map.containsKey(course)) {
            map.put(course, map.get(course) + 1);
        }
    }

    public static void dropStudent(Map<String, Integer> map, String course) {
        if (map.containsKey(course)) {
            int newCount = map.get(course) - 1;
            if (newCount < 0) newCount = 0;
            map.put(course, newCount);
        }
    }
}