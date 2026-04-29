package Map_Assignment;
import java.util.*;

public class StoreInventorySystem {
    public static void main(String[] args) {

        Map<String, Integer> inventory = new HashMap<>();

        inventory.put("Milk", 10);
        inventory.put("Bread", 5);
        inventory.put("Eggs", 0);

        buyProduct(inventory, "Milk", 3);
        buyProduct(inventory, "Bread", 5);

        restockProduct(inventory, "Eggs", 12);

        queryProduct(inventory, "Milk");
        queryProduct(inventory, "Butter");

        System.out.println("\nOut of Stock Products:");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            if (entry.getValue() == 0) {
                System.out.println(entry.getKey());
            }
        }
    }

    public static void buyProduct(Map<String, Integer> inventory, String name, int qty) {
        if (inventory.containsKey(name)) {
            int newQty = inventory.get(name) - qty;
            if (newQty <= 0) {
                inventory.put(name, 0);
            } else {
                inventory.put(name, newQty);
            }
        }
    }

    public static void restockProduct(Map<String, Integer> inventory, String name, int qty) {
        inventory.put(name, inventory.getOrDefault(name, 0) + qty);
    }

    public static void queryProduct(Map<String, Integer> inventory, String name) {
        if (inventory.containsKey(name)) {
            System.out.println(name + " stock: " + inventory.get(name));
        } else {
            System.out.println(name + " not stocked");
        }
    }
}