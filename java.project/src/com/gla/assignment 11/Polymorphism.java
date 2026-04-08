package using_inheritance;
class Animal9 {
    void makeSound() {
        System.out.println("Animal makes sound");
    }
}

class Dog9 extends Animal9 {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat2 extends Animal9 {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class Polymorphism {
    public static void main(String[] args) {

        Animal9 a;

        a = new Dog9();   // Dog object
        a.makeSound();

        a = new Cat2();   // Cat object
        a.makeSound();
    }
}
