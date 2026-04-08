package using_inheritance;
class Animal10 {
    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog10 extends Animal10 {
    @Override
    void eat() {
        System.out.println("Dog eats meat");
    }
}

public class FragileBase {
    public static void main(String[] args) {

        Dog10 d = new Dog10();
        d.eat();
    }
}
