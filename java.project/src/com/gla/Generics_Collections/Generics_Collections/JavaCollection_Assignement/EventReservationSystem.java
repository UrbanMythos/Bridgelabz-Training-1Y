package JavaCollection_Assignement;
import java.util.*;

class Booking implements Comparable<Booking> {
    String userId;
    String name;
    boolean isVIP;

    public Booking(String userId, String name, boolean isVIP) {
        this.userId = userId;
        this.name = name;
        this.isVIP = isVIP;
    }

    public int compareTo(Booking b) {
        if (this.isVIP == b.isVIP) return 0;
        return b.isVIP ? 1 : -1;
    }

    public String toString() {
        return name + " (" + userId + ") " + (isVIP ? "[VIP]" : "");
    }
}

public class EventReservationSystem {
    public static void main(String[] args) {

        List<Booking> allBookings = new ArrayList<>();
        Set<String> users = new HashSet<>();
        Queue<Booking> bookingQueue = new LinkedList<>();
        PriorityQueue<Booking> vipQueue = new PriorityQueue<>();

        addBooking(users, bookingQueue, new Booking("U101", "Aman", false));
        addBooking(users, bookingQueue, new Booking("U102", "Riya", true));
        addBooking(users, bookingQueue, new Booking("U103", "Rahul", false));
        addBooking(users, bookingQueue, new Booking("U102", "Duplicate", true));

        vipQueue.addAll(bookingQueue);

        while (!vipQueue.isEmpty()) {
            Booking b = vipQueue.poll();
            allBookings.add(b);
        }

        System.out.println("Confirmed Bookings:");
        for (Booking b : allBookings) {
            System.out.println(b);
        }
    }

    public static void addBooking(Set<String> users, Queue<Booking> queue, Booking b) {
        if (users.add(b.userId)) {
            queue.add(b);
        }
    }
}