package using_inheritance;
class Animal2 {
    void makeSound() {
        System.out.println("Animal makes sound");
    }
}

class Dog2 extends Animal2 {

    @Override
    void makeSound() {   // overriding method
        System.out.println("Dog barks");
    }
}
public class Override1 {
    public static void main(String[] args) {
        Animal2 a = new Dog2();
        a.makeSound();
    }
}
