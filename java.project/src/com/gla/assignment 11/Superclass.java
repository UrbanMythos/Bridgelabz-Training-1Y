package using_inheritance;
class Animal1 {
    final void eat() {   // final method
        System.out.println("Animal is eating");
    }
}

class Dog1 extends Animal1 {
    void bark() {
        System.out.println("Dog barks");
    }

}

public class Superclass {
    public static void main(String[] args) {
        Dog1 d = new Dog1();
        d.eat();
        d.bark();
    }
}
