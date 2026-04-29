package JavaCollection_Assignement.QueueInterface;
import java.util.*;

class MyStack<T> {

    Queue<T> q1 = new LinkedList<>();
    Queue<T> q2 = new LinkedList<>();

    public void push(T x) {
        q2.add(x);

        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        Queue<T> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public T pop() {
        if (q1.isEmpty()) return null;
        return q1.remove();
    }

    public T top() {
        if (q1.isEmpty()) return null;
        return q1.peek();
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }
}

public class StackUsingQueues {
    public static void main(String[] args) {

        MyStack<Integer> stack = new MyStack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top: " + stack.top());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Top after pop: " + stack.top());
    }
}