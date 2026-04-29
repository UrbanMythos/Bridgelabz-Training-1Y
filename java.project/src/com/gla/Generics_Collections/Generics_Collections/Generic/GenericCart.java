package Generics_Collections.Generic;
import java.util.*;

class Cart<T> {
    private List<T> items;

    public Cart() {
        items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public void removeItem(T item) {
        items.remove(item);
    }

    public void displayItems() {
        if (items.isEmpty()) {
            System.out.println("Cart is empty");
        } else {
            for (T item : items) {
                System.out.println(item);
            }
        }
    }
}

class Electronics {
    String name;

    Electronics(String name) {
        this.name = name;
    }

    public String toString() {
        return "Electronics: " + name;
    }
}

class Clothing {
    String name;

    Clothing(String name) {
        this.name = name;
    }

    public String toString() {
        return "Clothing: " + name;
    }
}

public class GenericCart {
    public static void main(String[] args) {

        Cart<Electronics> electronicsCart = new Cart<>();
        electronicsCart.addItem(new Electronics("Laptop"));
        electronicsCart.addItem(new Electronics("Mobile"));

        System.out.println("Electronics Cart:");
        electronicsCart.displayItems();

        Cart<Clothing> clothingCart = new Cart<>();
        clothingCart.addItem(new Clothing("T-Shirt"));
        clothingCart.addItem(new Clothing("Jeans"));

        System.out.println("\nClothing Cart:");
        clothingCart.displayItems();
    }
}