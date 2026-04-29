package Map_Assignment;
import java.util.*;

public class LibraryCatalogSystem {
    public static void main(String[] args) {

        Map<String, String> catalog = new HashMap<>();

        catalog.put("978-1111111111", "Java Basics");
        catalog.put("978-2222222222", "Data Structures");
        catalog.put("978-3333333333", "Operating Systems");

        searchByISBN(catalog, "978-2222222222");
        searchByISBN(catalog, "978-9999999999");

        catalog.remove("978-3333333333");

        System.out.println("\nSorted Catalog:");
        TreeMap<String, String> sorted = new TreeMap<>(catalog);
        for (Map.Entry<String, String> entry : sorted.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("\nSearch by Title:");
        searchByTitle(catalog, "Java Basics");
    }

    public static void searchByISBN(Map<String, String> catalog, String isbn) {
        if (catalog.containsKey(isbn)) {
            System.out.println("Found: " + catalog.get(isbn));
        } else {
            System.out.println("Book not found");
        }
    }

    public static void searchByTitle(Map<String, String> catalog, String title) {
        boolean found = false;
        for (Map.Entry<String, String> entry : catalog.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(title)) {
                System.out.println("ISBN: " + entry.getKey());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Title not found");
        }
    }
}