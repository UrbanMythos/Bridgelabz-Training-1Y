package Map_Assignment;
import java.util.*;

public class EmployeeDepartmentMapping {
    public static void main(String[] args) {

        HashMap<Integer, String> employees = new HashMap<>();

        employees.put(101, "IT");
        employees.put(102, "HR");
        employees.put(103, "IT");
        employees.put(104, "Finance");
        employees.put(105, "HR");

        updateDepartment(employees, 103, "Finance");

        findByDepartment(employees, "IT");

        System.out.println("\nEmployee Count per Department:");
        countByDepartment(employees);
    }

    public static void updateDepartment(Map<Integer, String> map, int empId, String newDept) {
        if (map.containsKey(empId)) {
            map.put(empId, newDept);
        }
    }

    public static void findByDepartment(Map<Integer, String> map, String dept) {
        System.out.println("Employees in " + dept + ":");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(dept)) {
                System.out.println("Employee ID: " + entry.getKey());
            }
        }
    }

    public static void countByDepartment(Map<Integer, String> map) {

        HashMap<String, Integer> countMap = new HashMap<>();

        for (String dept : map.values()) {
            countMap.put(dept, countMap.getOrDefault(dept, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}