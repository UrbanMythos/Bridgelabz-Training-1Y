package JavaCollection_Assignement;
import java.util.*;

class Product {
    String name;
    double price;
    int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String toString() {
        return name + " | ₹" + price + " | Stock: " + stock;
    }
}

public class InventoryManagementSystem {
    public static void main(String[] args) {

        Set<String> productNames = new HashSet<>();

        List<Product> products = new ArrayList<>();

        Queue<Product> restockQueue = new LinkedList<>();

        Stack<Product> restockStack = new Stack<>();

        addProduct(products, productNames, new Product("Milk", 50, 5));
        addProduct(products, productNames, new Product("Bread", 30, 2));
        addProduct(products, productNames, new Product("Eggs", 60, 10));
        addProduct(products, productNames, new Product("Milk", 50, 5));

        for (Product p : products) {
            if (p.stock < 5) {
                restockQueue.add(p);
            }
        }

        System.out.println("Restocking:");

        while (!restockQueue.isEmpty()) {
            Product p = restockQueue.remove();
            p.stock += 10;
            restockStack.push(p);
            System.out.println("Restocked: " + p);
        }

        System.out.println("\nUndo Last Restock:");

        if (!restockStack.isEmpty()) {
            Product last = restockStack.pop();
            last.stock -= 10;
            System.out.println("Rollback: " + last);
        }

        System.out.println("\nFinal Products:");
        for (Product p : products) {
            System.out.println(p);
        }
    }

    public static void addProduct(List<Product> products, Set<String> names, Product p) {
        if (names.add(p.name)) {
            products.add(p);
        }
    }
}