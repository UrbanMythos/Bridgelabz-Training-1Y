package ThreadsinJava;
class Order implements Runnable {
    private int orderId;
    private String restaurantName;
    private int deliveryTime; // in seconds
    private String deliveryType;

    public Order(int orderId, String restaurantName, int deliveryTime, String deliveryType) {
        this.orderId = orderId;
        this.restaurantName = restaurantName;
        this.deliveryTime = deliveryTime;
        this.deliveryType = deliveryType;
    }

    @Override
    public void run() {
        Thread currentThread = Thread.currentThread();
        long startTime = System.currentTimeMillis();

        try {
            System.out.println("Agent: " + currentThread.getName() +
                    " | Order ID: " + orderId +
                    " | Restaurant: " + restaurantName +
                    " | Type: " + deliveryType +
                    " | Status: Picked up");

            Thread.sleep(deliveryTime * 500); // halfway simulation

            System.out.println("Agent: " + currentThread.getName() +
                    " | Order ID: " + orderId +
                    " | Status: In Transit");

            Thread.sleep(deliveryTime * 500); // remaining time

            long endTime = System.currentTimeMillis();

            System.out.println("Agent: " + currentThread.getName() +
                    " | Order ID: " + orderId +
                    " | Status: Delivered" +
                    " | Total Time: " + (endTime - startTime) / 1000 + " sec");

        } catch (InterruptedException e) {
            System.out.println("Order " + orderId + " interrupted.");
        }
    }
}

public class FoodDeliverySystem {
    public static void main(String[] args) {

        // Create orders
        Order o1 = new Order(101, "Pizza Palace", 4, "Express");
        Order o2 = new Order(102, "Burger Hub", 6, "Standard");
        Order o3 = new Order(103, "Sushi World", 5, "Economy");
        Order o4 = new Order(104, "Tandoori Treats", 3, "Express");
        Order o5 = new Order(105, "Pasta Point", 7, "Standard");

        // Create threads (delivery agents)
        Thread t1 = new Thread(o1, "Agent-A");
        Thread t2 = new Thread(o2, "Agent-B");
        Thread t3 = new Thread(o3, "Agent-C");
        Thread t4 = new Thread(o4, "Agent-D");
        Thread t5 = new Thread(o5, "Agent-E");

        // Set priorities
        t1.setPriority(Thread.MAX_PRIORITY); // Express = 10
        t4.setPriority(Thread.MAX_PRIORITY); // Express = 10

        t2.setPriority(Thread.NORM_PRIORITY); // Standard = 5
        t5.setPriority(Thread.NORM_PRIORITY); // Standard = 5

        t3.setPriority(3); // Economy = 3

        // Start all threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}