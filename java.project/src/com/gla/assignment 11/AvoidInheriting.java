package using_inheritance;
interface Vehicle {
    void start();
}

class PetrolCar implements Vehicle {
    public void start() {
        System.out.println("Petrol car starts with key");
    }
}

class ElectricCar implements Vehicle {
    public void start() {
        System.out.println("Electric car starts with button");
    }
}
public class AvoidInheriting {
    public static void main(String[] args) {
        Vehicle v1 = new PetrolCar();
        Vehicle v2 = new ElectricCar();

        v1.start();
        v2.start();
    }
}
