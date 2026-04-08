package using_inheritance;
abstract class Animal4 {

    void eat() {   // normal method
        System.out.println("Animal eats food");
    }

    abstract void makeSound();   // abstract method
}

class Dog4 extends Animal4 {

    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat1 extends Animal4 {

    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}
public class AbstractClasses {
    public static void main(String[] args) {

        Dog4 d = new Dog4();
        d.eat();
        d.makeSound();

        Cat1 c = new Cat1();
        c.eat();
        c.makeSound();
    }
}
