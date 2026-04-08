package using_inheritance;
class Bird {
    void fly() {
        System.out.println("Bird can fly");
    }
}

class Sparrow extends Bird {
    void fly() {
        System.out.println("Sparrow flies in the sky");
    }
}

public class MainBird {
    public static void main(String[] args) {
        Bird b = new Sparrow();  // Substitution
        b.fly();
    }
}