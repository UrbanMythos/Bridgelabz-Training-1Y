package StreamAPI.LambdaExpressionsProblemStatements.LambdaExpressions;
import java.util.*;

class Product {
    String name;
    double price;
    double rating;
    double discount;

    public Product(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    public String toString() {
        return name + " | Price: " + price + " | Rating: " + rating + " | Discount: " + discount;
    }
}

public class SmartECommerce {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product("Laptop", 60000, 4.5, 10));
        products.add(new Product("Mobile", 20000, 4.2, 20));
        products.add(new Product("Headphones", 2000, 4.8, 30));

        Map<String, Comparator<Product>> sortStrategies = new HashMap<>();

        sortStrategies.put("price", (a, b) -> Double.compare(a.price, b.price));
        sortStrategies.put("rating", (a, b) -> Double.compare(b.rating, a.rating));
        sortStrategies.put("discount", (a, b) -> Double.compare(b.discount, a.discount));

        String campaign = "rating";

        products.sort(sortStrategies.get(campaign));

        System.out.println("Sorted by " + campaign + ":");
        products.forEach(System.out::println);
    }
}