package ThreadsinJava;
import java.util.*;

class Ticket extends Thread {
    private int ticketId;
    private String type;
    private int priority;
    private int queuePosition;

    private static Map<Integer, List<Long>> waitTimes = new HashMap<>();

    public Ticket(int ticketId, String type, int priority, int queuePosition) {
        this.ticketId = ticketId;
        this.type = type;
        this.priority = priority;
        this.queuePosition = queuePosition;

        waitTimes.putIfAbsent(priority, new ArrayList<>());
    }

    public int getPriorityValue() {
        return priority;
    }

    @Override
    public void run() {
        Random rand = new Random();
        long startTime = System.currentTimeMillis();

        System.out.println("START → Ticket#" + ticketId +
                " | Type: " + type +
                " | Priority: " + priority +
                " | Agent: " + getName() +
                " | Queue Pos: " + queuePosition);

        try {
            int processingTime = (rand.nextInt(5) + 1) * 1000;
            Thread.sleep(processingTime);
        } catch (InterruptedException e) {
            System.out.println("Ticket interrupted: " + ticketId);
        }

        long endTime = System.currentTimeMillis();
        long totalTime = (endTime - startTime) / 1000;

        synchronized (waitTimes) {
            waitTimes.get(priority).add(totalTime);
        }

        System.out.println("END   → Ticket#" + ticketId +
                " | Type: " + type +
                " | Agent: " + getName() +
                " | Time Taken: " + totalTime + " sec");
    }

    public static void printStatistics() {
        System.out.println("\n--- Average Time per Priority ---");

        for (Map.Entry<Integer, List<Long>> entry : waitTimes.entrySet()) {
            int priority = entry.getKey();
            List<Long> times = entry.getValue();

            double avg = times.stream()
                    .mapToLong(Long::longValue)
                    .average()
                    .orElse(0);

            System.out.println("Priority " + priority +
                    " → Avg Time: " + String.format("%.2f", avg) + " sec");
        }
    }
}

public class TicketSystem {
    public static void main(String[] args) {

        List<Ticket> tickets = new ArrayList<>();

        tickets.add(new Ticket(1, "Critical Bug", 10, 1));
        tickets.add(new Ticket(2, "Feature Request", 4, 5));
        tickets.add(new Ticket(3, "General Query", 2, 7));
        tickets.add(new Ticket(4, "Feedback", 1, 9));
        tickets.add(new Ticket(5, "Critical Bug", 10, 2));
        tickets.add(new Ticket(6, "General Query", 2, 8));
        tickets.add(new Ticket(7, "Feature Request", 4, 6));
        tickets.add(new Ticket(8, "Critical Bug", 10, 3));
        tickets.add(new Ticket(9, "Feedback", 1, 10));
        tickets.add(new Ticket(10, "Feature Request", 4, 4));

        int agentNum = 1;
        for (Ticket t : tickets) {
            t.setName("Agent-" + agentNum++);
            t.setPriority(t.getPriorityValue());
        }

        tickets.sort((a, b) -> b.getPriorityValue() - a.getPriorityValue());

        long startTime = System.currentTimeMillis();

        for (Ticket t : tickets) {
            t.start();
        }

        for (Ticket t : tickets) {
            try {
                t.join();
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted");
            }
        }

        long endTime = System.currentTimeMillis();

        System.out.println("\nTotal Processing Time: " +
                (endTime - startTime) / 1000 + " sec");

        Ticket.printStatistics();
    }
}