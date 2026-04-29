package Map_Assignment;
import java.util.*;

public class WebsiteVisitTracker {
    public static void main(String[] args) {

        Map<String, Integer> visits = new HashMap<>();

        String[] pages = {
                "home", "about", "products", "home",
                "products", "contact", "home",
                "about", "home", "products"
        };

        for (String page : pages) {
            visits.put(page, visits.getOrDefault(page, 0) + 1);
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(visits.entrySet());

        list.sort((a, b) -> b.getValue() - a.getValue());

        System.out.println("Pages sorted by visits:");
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("\nMost Visited Page:");
        System.out.println(list.get(0).getKey() + " : " + list.get(0).getValue());
    }
}