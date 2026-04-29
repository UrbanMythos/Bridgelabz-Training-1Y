package Map_Assignment;
import java.util.*;

public class EmployeeSalaryDirectory {
    public static void main(String[] args) {

        Map<String, Double> salaries = new HashMap<>();

        salaries.put("Aman", 50000.0);
        salaries.put("Riya", 60000.0);
        salaries.put("Rahul", 55000.0);
        salaries.put("Sneha", 70000.0);
        salaries.put("Karan", 65000.0);
        salaries.put("Neha", 60000.0);

        giveRaise(salaries, "Aman", 10);
        giveRaise(salaries, "Sneha", 5);
        giveRaise(salaries, "Vikas", 10);

        double total = 0;
        double maxSalary = Double.MIN_VALUE;

        for (double sal : salaries.values()) {
            total += sal;
            if (sal > maxSalary) {
                maxSalary = sal;
            }
        }

        double average = total / salaries.size();

        System.out.println("Average Salary: " + average);

        System.out.println("\nHighest Paid Employee(s):");
        for (Map.Entry<String, Double> entry : salaries.entrySet()) {
            if (entry.getValue() == maxSalary) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }

    public static void giveRaise(Map<String, Double> map, String name, double percent) {
        if (map.containsKey(name)) {
            double newSalary = map.get(name) + (map.get(name) * percent / 100);
            map.put(name, newSalary);
        } else {
            System.out.println(name + " Employee not found");
        }
    }
}