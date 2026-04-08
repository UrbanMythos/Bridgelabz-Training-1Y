package using_inheritance;
class animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class dog extends animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

public class MainAnimal {
    public static void main(String[] args) {
        dog d = new dog();
        d.eat();
        d.bark();

        Cat c = new Cat();
        c.eat();
        c.meow();
    }
}