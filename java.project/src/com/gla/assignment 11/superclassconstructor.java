package using_inheritance;
class Animal8 {
    String name;

    Animal8(String name) {   // superclass constructor
        this.name = name;
        System.out.println("Animal constructor called");
    }
}

class Dog8 extends Animal8 {

    Dog8(String name) {
        super(name);   // calling superclass constructor
        System.out.println("Dog constructor called");
    }

    void display() {
        System.out.println("Dog name: " + name);
    }
}

public class superclassconstructor {
    public static void main(String[] args) {

        Dog8 d = new Dog8("Tommy");
        d.display();
    }
}
