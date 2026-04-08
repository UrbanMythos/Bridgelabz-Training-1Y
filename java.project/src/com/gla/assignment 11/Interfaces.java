package using_inheritance;
interface Animal5 {
    void eat();
}

interface Pet {
    void play();
}

class Dog5 implements Animal5, Pet {

    public void eat() {
        System.out.println("Dog eats food");
    }

    public void play() {
        System.out.println("Dog plays");
    }
}
public class Interfaces {
    public static void main(String[] args) {

        Dog5 d = new Dog5();
        d.eat();
        d.play();
    }
}
