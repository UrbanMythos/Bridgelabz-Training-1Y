package using_inheritance;
class Engine {
    void start() {
        System.out.println("Engine started");
    }
}

class Car {
    Engine engine = new Engine();   // Composition (Car has an Engine)

    void startCar() {
        engine.start();
        System.out.println("Car started");
    }
}

public class CarDemo {
    static void main(String[] args) {
        Car c=new Car();
        c.startCar();
    }
}
