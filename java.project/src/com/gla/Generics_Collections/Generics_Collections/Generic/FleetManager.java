package Generics_Collections.Generic;
import java.util.*;

class Vehicle {
    String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

class Truck extends Vehicle {
    public Truck(String name) {
        super(name);
    }
}

class Bike extends Vehicle {
    public Bike(String name) {
        super(name);
    }
}

class FleetManagerGeneric<T extends Vehicle> {
    private List<T> fleet = new ArrayList<>();

    public void addVehicle(T vehicle) {
        fleet.add(vehicle);
    }

    public void showFleet() {
        for (T v : fleet) {
            System.out.println(v);
        }
    }
}

public class FleetManager {
    public static void main(String[] args) {

        FleetManagerGeneric<Truck> truckFleet = new FleetManagerGeneric<>();
        truckFleet.addVehicle(new Truck("Tata Truck"));
        truckFleet.addVehicle(new Truck("Mahindra Truck"));

        System.out.println("Truck Fleet:");
        truckFleet.showFleet();

        FleetManagerGeneric<Bike> bikeFleet = new FleetManagerGeneric<>();
        bikeFleet.addVehicle(new Bike("Royal Enfield"));
        bikeFleet.addVehicle(new Bike("Yamaha"));

        System.out.println("\nBike Fleet:");
        bikeFleet.showFleet();
    }
}