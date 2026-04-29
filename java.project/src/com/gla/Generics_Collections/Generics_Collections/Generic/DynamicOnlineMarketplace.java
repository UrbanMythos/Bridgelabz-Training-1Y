package Generics_Collections.Generic;
import java.util.*;

class BookCategory {
    String categoryName;

    public BookCategory(String categoryName) {
        this.categoryName = categoryName;
    }

    public String toString() {
        return categoryName;
    }
}

class ClothingCategory {
    String categoryName;

    public ClothingCategory(String categoryName) {
        this.categoryName = categoryName;
    }

    public String toString() {
        return categoryName;
    }
}

class GadgetCategory {
    String categoryName;

    public GadgetCategory(String categoryName) {
        this.categoryName = categoryName;
    }

    public String toString() {
        return categoryName;
    }
}

class MarketplaceProduct<T> {
    String name;
    double price;
    T category;

    public MarketplaceProduct(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return name + " | Price: " + price + " | Category: " + category;
    }
}

class MarketplaceUtil {

    public static <T extends MarketplaceProduct<?>> void applyDiscount(T product, double percentage) {
        double discount = product.getPrice() * (percentage / 100);
        product.setPrice(product.getPrice() - discount);
    }
}

public class DynamicOnlineMarketplace {
    public static void main(String[] args) {

        MarketplaceProduct<BookCategory> book =
                new MarketplaceProduct<>("Java Book", 500, new BookCategory("Education"));

        MarketplaceProduct<ClothingCategory> cloth =
                new MarketplaceProduct<>("T-Shirt", 1000, new ClothingCategory("Men Wear"));

        MarketplaceProduct<GadgetCategory> gadget =
                new MarketplaceProduct<>("Smartphone", 20000, new GadgetCategory("Electronics"));

        List<MarketplaceProduct<?>> catalog = new ArrayList<>();
        catalog.add(book);
        catalog.add(cloth);
        catalog.add(gadget);

        MarketplaceUtil.applyDiscount(book, 10);
        MarketplaceUtil.applyDiscount(cloth, 20);
        MarketplaceUtil.applyDiscount(gadget, 5);

        System.out.println("Catalog After Discount:");
        for (MarketplaceProduct<?> p : catalog) {
            System.out.println(p);
        }
    }
}