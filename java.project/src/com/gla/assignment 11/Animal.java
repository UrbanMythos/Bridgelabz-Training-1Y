package using_inheritance;

class animalfeature {
    void makeSound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends animalfeature {   // Dog IS-A Animal
    void bark() {
        System.out.println("Dog barks");
    }
}
public class Animal {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
        d.bark();
    }
}