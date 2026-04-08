package using_inheritance;
class Animal7 {
    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog7 extends Animal7 {

    // Overriding because Dog has different behavior
    @Override
    void eat() {
        System.out.println("Dog eats meat");
    }
}

class Cat3 extends Animal7 {
    // No overriding needed because behavior is same
}

public class AvoidOverriding {
    public static void main(String[] args) {

        Dog7 d = new Dog7();
        d.eat();

        Cat3 c = new Cat3();
        c.eat();
    }
}
