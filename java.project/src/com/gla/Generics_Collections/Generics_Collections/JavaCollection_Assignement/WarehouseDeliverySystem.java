package JavaCollection_Assignement;
import java.util.*;

class PackageItem {
    String id;
    String customer;

    public PackageItem(String id, String customer) {
        this.id = id;
        this.customer = customer;
    }

    public String toString() {
        return "Package: " + id + " -> " + customer;
    }
}

public class WarehouseDeliverySystem {
    public static void main(String[] args) {

        Queue<PackageItem> deliveryQueue = new LinkedList<>();
        Set<String> packageIds = new HashSet<>();
        List<PackageItem> delivered = new ArrayList<>();
        Stack<PackageItem> returned = new Stack<>();

        addPackage(deliveryQueue, packageIds, new PackageItem("P101", "Aman"));
        addPackage(deliveryQueue, packageIds, new PackageItem("P102", "Riya"));
        addPackage(deliveryQueue, packageIds, new PackageItem("P103", "Rahul"));
        addPackage(deliveryQueue, packageIds, new PackageItem("P101", "Duplicate"));

        while (!deliveryQueue.isEmpty()) {
            PackageItem p = deliveryQueue.remove();

            if (p.id.equals("P102")) {
                returned.push(p);
            } else {
                delivered.add(p);
            }
        }

        System.out.println("Delivered Packages:");
        for (PackageItem p : delivered) {
            System.out.println(p);
        }

        System.out.println("\nReturned Packages:");
        for (PackageItem p : returned) {
            System.out.println(p);
        }

        System.out.println("\nSummary:");
        System.out.println("Total Delivered: " + delivered.size());
        System.out.println("Total Returned: " + returned.size());
    }

    public static void addPackage(Queue<PackageItem> queue, Set<String> ids, PackageItem p) {
        if (ids.add(p.id)) {
            queue.add(p);
        }
    }
}