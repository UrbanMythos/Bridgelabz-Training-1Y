package JavaCollection_Assignement;
import java.util.*;

class Order {
    int orderId;
    String customerName;

    public Order(int orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
    }

    public int hashCode() {
        return Objects.hash(orderId);
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Order)) return false;
        Order o = (Order) obj;
        return this.orderId == o.orderId;
    }

    public String toString() {
        return "OrderID: " + orderId + ", Customer: " + customerName;
    }
}

public class ECommerceOrderSystem {
    public static void main(String[] args) {

        List<Order> orderList = new ArrayList<>();

        orderList.add(new Order(101, "Aman"));
        orderList.add(new Order(102, "Riya"));
        orderList.add(new Order(103, "Rahul"));
        orderList.add(new Order(101, "Duplicate")); // duplicate

        Set<Order> uniqueOrders = new HashSet<>(orderList);

        System.out.println("Unique Orders:");
        for (Order o : uniqueOrders) {
            System.out.println(o);
        }

        Queue<Order> orderQueue = new LinkedList<>(uniqueOrders);

        Stack<Order> failedOrders = new Stack<>();

        System.out.println("\nProcessing Orders:");

        while (!orderQueue.isEmpty()) {
            Order current = orderQueue.remove();
            System.out.println("Processing: " + current);

            if (current.orderId == 102) {
                System.out.println("Failed: " + current);
                failedOrders.push(current);
            } else {
                System.out.println("Success: " + current);
            }
        }

        System.out.println("\nRe-processing Failed Orders:");

        while (!failedOrders.isEmpty()) {
            Order retry = failedOrders.pop();
            System.out.println("Retrying: " + retry);
        }
    }
}