package Map_Assignment;
import java.util.*;

public class CountryCapitalLookup {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("India", "New Delhi");
        map.put("USA", "Washington DC");
        map.put("Japan", "Tokyo");
        map.put("France", "Paris");
        map.put("Germany", "Berlin");
        map.put("Italy", "Rome");
        map.put("Canada", "Ottawa");
        map.put("Australia", "Canberra");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter country name: ");
        String country = sc.nextLine();

        if (map.containsKey(country)) {
            System.out.println("Capital: " + map.get(country));
        } else {
            System.out.println("Unknown country");
        }

        System.out.println("\nCountries in Alphabetical Order:");

        TreeMap<String, String> sorted = new TreeMap<>(map);

        for (Map.Entry<String, String> entry : sorted.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        sc.close();
    }
}