package JavaCollection_Assignement;
import java.util.*;

class RideRequest implements Comparable<RideRequest> {
    String customerName;
    int priority;

    public RideRequest(String customerName, int priority) {
        this.customerName = customerName;
        this.priority = priority;
    }

    public int compareTo(RideRequest r) {
        return r.priority - this.priority;
    }

    public String toString() {
        return customerName + " (Priority: " + priority + ")";
    }
}

class Driver {
    int driverId;
    String name;

    public Driver(int driverId, String name) {
        this.driverId = driverId;
        this.name = name;
    }

    public int hashCode() {
        return Objects.hash(driverId);
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Driver)) return false;
        Driver d = (Driver) obj;
        return this.driverId == d.driverId;
    }

    public String toString() {
        return "Driver " + driverId + " - " + name;
    }
}

class Ride {
    RideRequest request;
    Driver driver;

    public Ride(RideRequest request, Driver driver) {
        this.request = request;
        this.driver = driver;
    }

    public String toString() {
        return request.customerName + " served by " + driver.name;
    }
}

public class RideSharingSystem {
    public static void main(String[] args) {

        Queue<RideRequest> requestQueue = new LinkedList<>();

        PriorityQueue<RideRequest> priorityQueue = new PriorityQueue<>();

        requestQueue.add(new RideRequest("Aman", 2));
        requestQueue.add(new RideRequest("Riya", 5)); // high priority
        requestQueue.add(new RideRequest("Rahul", 3));

        priorityQueue.addAll(requestQueue);

        Set<Driver> drivers = new HashSet<>();
        drivers.add(new Driver(1, "Driver1"));
        drivers.add(new Driver(2, "Driver2"));
        drivers.add(new Driver(3, "Driver3"));

        List<Ride> completedRides = new ArrayList<>();

        System.out.println("Assigning Rides:");

        Iterator<Driver> driverIterator = drivers.iterator();

        while (!priorityQueue.isEmpty() && driverIterator.hasNext()) {

            RideRequest request = priorityQueue.poll();
            Driver driver = driverIterator.next();

            Ride ride = new Ride(request, driver);
            completedRides.add(ride);

            System.out.println("Assigned: " + ride);
        }

        System.out.println("\nCompleted Rides:");
        for (Ride r : completedRides) {
            System.out.println(r);
        }
    }
}