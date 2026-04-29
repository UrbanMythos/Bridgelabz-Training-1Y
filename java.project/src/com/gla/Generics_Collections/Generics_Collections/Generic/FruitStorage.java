package Generics_Collections.Generic;
import java.util.*;

class Fruit {
    @Override
    public String toString() {
        return "Fruit";
    }
}

class Apple extends Fruit {
    @Override
    public String toString() {
        return "Apple";
    }
}

class Mango extends Fruit {
    @Override
    public String toString() {
        return "Mango";
    }
}

class FruitBox<T extends Fruit> {
    private List<T> fruits = new ArrayList<>();

    public void add(T fruit) {
        fruits.add(fruit);
    }

    public void display() {
        for (T fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

public class FruitStorage {
    public static void main(String[] args) {

        FruitBox<Apple> appleBox = new FruitBox<>();
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        System.out.println("Apple Box:");
        appleBox.display();

        FruitBox<Mango> mangoBox = new FruitBox<>();
        mangoBox.add(new Mango());

        System.out.println("\nMango Box:");
        mangoBox.display();

    }
}