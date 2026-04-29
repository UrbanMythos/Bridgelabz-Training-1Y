package JavaCollection_Assignement;
import java.util.*;

class Parcel implements Comparable<Parcel> {
    String id;
    String address;
    int priority;

    public Parcel(String id, String address, int priority) {
        this.id = id;
        this.address = address;
        this.priority = priority;
    }

    public int compareTo(Parcel p) {
        return p.priority - this.priority;
    }

    public String toString() {
        return id + " -> " + address + " (Priority: " + priority + ")";
    }
}

public class CourierRoutingSystem {
    public static void main(String[] args) {

        PriorityQueue<Parcel> priorityQueue = new PriorityQueue<>();
        Queue<Parcel> normalQueue = new LinkedList<>();
        Set<String> assignedIds = new HashSet<>();
        List<Parcel> completed = new ArrayList<>();

        addParcel(priorityQueue, normalQueue, assignedIds, new Parcel("P1", "Delhi", 5));
        addParcel(priorityQueue, normalQueue, assignedIds, new Parcel("P2", "Noida", 2));
        addParcel(priorityQueue, normalQueue, assignedIds, new Parcel("P3", "Gurgaon", 4));
        addParcel(priorityQueue, normalQueue, assignedIds, new Parcel("P1", "Duplicate", 3));

        while (!priorityQueue.isEmpty()) {
            Parcel p = priorityQueue.poll();
            completed.add(p);
        }

        while (!normalQueue.isEmpty()) {
            Parcel p = normalQueue.remove();
            completed.add(p);
        }

        System.out.println("Completed Deliveries:");
        for (Parcel p : completed) {
            System.out.println(p);
        }
    }

    public static void addParcel(PriorityQueue<Parcel> pq, Queue<Parcel> nq, Set<String> ids, Parcel p) {
        if (ids.add(p.id)) {
            if (p.priority >= 4) {
                pq.add(p);
            } else {
                nq.add(p);
            }
        }
    }
}