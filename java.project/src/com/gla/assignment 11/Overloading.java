package using_inheritance;
class Animal3 {
    void makeSound() {
        System.out.println("Animal makes sound");
    }
}

class Dog3 extends Animal3 {

    @Override
    void makeSound() {   // overriding
        System.out.println("Dog barks");
    }

    void makeSound(String type) {   // overloading
        System.out.println("Dog sound type: " + type);
    }
}

public class Overloading {
    public static void main(String[] args) {

        Dog3 d = new Dog3();

        d.makeSound();          // overridden method
        d.makeSound("Loud");    // overloaded method
    }
}
