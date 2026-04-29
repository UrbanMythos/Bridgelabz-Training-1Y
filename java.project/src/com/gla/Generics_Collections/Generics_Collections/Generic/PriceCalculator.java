package Generics_Collections.Generic;
import java.util.*;

abstract class Product {
    double price;

    public Product(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

class Mobile extends Product {
    String name;

    public Mobile(String name, double price) {
        super(price);
        this.name = name;
    }

    public String toString() {
        return name + " : " + price;
    }
}

class Laptop extends Product {
    String name;

    public Laptop(String name, double price) {
        super(price);
        this.name = name;
    }

    public String toString() {
        return name + " : " + price;
    }
}

public class PriceCalculator {

    public static double calculateTotal(List<? extends Product> items) {
        double total = 0;

        for (Product item : items) {
            total += item.getPrice();
        }

        return total;
    }

    public static void main(String[] args) {

        List<Mobile> mobiles = new ArrayList<>();
        mobiles.add(new Mobile("iPhone", 80000));
        mobiles.add(new Mobile("Samsung", 50000));

        List<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("Dell", 70000));
        laptops.add(new Laptop("HP", 60000));

        double mobileTotal = calculateTotal(mobiles);
        double laptopTotal = calculateTotal(laptops);

        System.out.println("Mobiles: " + mobiles);
        System.out.println("Total Mobile Price: " + mobileTotal);

        System.out.println("\nLaptops: " + laptops);
        System.out.println("Total Laptop Price: " + laptopTotal);
    }
}