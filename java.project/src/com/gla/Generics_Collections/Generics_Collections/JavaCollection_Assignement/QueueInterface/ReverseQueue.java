package JavaCollection_Assignement.QueueInterface;
import java.util.*;

public class ReverseQueue {

    public static <T> void reverseQueue(Queue<T> queue) {

        Queue<T> tempQueue = new LinkedList<>();

        while (!queue.isEmpty()) {
            T element = queue.remove();

            int size = tempQueue.size();
            tempQueue.add(element);

            for (int i = 0; i < size; i++) {
                tempQueue.add(tempQueue.remove());
            }
        }

        while (!tempQueue.isEmpty()) {
            queue.add(tempQueue.remove());
        }
    }

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        reverseQueue(queue);

        System.out.println("Reversed Queue: " + queue);
    }
}