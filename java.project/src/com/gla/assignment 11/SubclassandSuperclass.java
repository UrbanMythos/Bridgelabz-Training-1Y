package using_inheritance;
class Animal11 {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog11 extends Animal11 {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
public class SubclassandSuperclass {
    public static void main(String[] args) {
        Animal11 a = new Dog11();  // Polymorphism
        a.sound();             // Should print "Dog barks"
    }
}
