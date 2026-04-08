package using_inheritance;
class Animal6 {

    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog6 extends Animal6 {

    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}
public class InheritanceBehavior {
    public static void main(String[] args) {
        Animal6 a = new Dog6();
        a.makeSound();
    }
}
