package Generics_Collections.Generic;
import java.util.*;

abstract class WarehouseItem {
    String name;

    public WarehouseItem(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

class ElectronicItem extends WarehouseItem {
    public ElectronicItem(String name) {
        super(name);
    }

    public String toString() {
        return "Electronics: " + name;
    }
}

class Groceries extends WarehouseItem {
    public Groceries(String name) {
        super(name);
    }

    public String toString() {
        return "Groceries: " + name;
    }
}

class Furniture extends WarehouseItem {
    public Furniture(String name) {
        super(name);
    }

    public String toString() {
        return "Furniture: " + name;
    }
}

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }
}

class WarehouseUtil {
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item);
        }
    }
}

public class SmartWarehouseManagementSystem {
    public static void main(String[] args) {

        Storage<ElectronicItem> electronics = new Storage<>();
        electronics.addItem(new ElectronicItem("Laptop"));
        electronics.addItem(new ElectronicItem("Mobile"));

        Storage<Groceries> groceries = new Storage<>();
        groceries.addItem(new Groceries("Rice"));
        groceries.addItem(new Groceries("Milk"));

        Storage<Furniture> furniture = new Storage<>();
        furniture.addItem(new Furniture("Chair"));
        furniture.addItem(new Furniture("Table"));

        System.out.println("Electronics Items:");
        WarehouseUtil.displayItems(electronics.getItems());

        System.out.println("\nGroceries Items:");
        WarehouseUtil.displayItems(groceries.getItems());

        System.out.println("\nFurniture Items:");
        WarehouseUtil.displayItems(furniture.getItems());
    }
}