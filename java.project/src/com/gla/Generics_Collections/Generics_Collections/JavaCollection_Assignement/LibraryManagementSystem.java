package JavaCollection_Assignement;
import java.util.*;

class Book {
    String title;

    public Book(String title) {
        this.title = title;
    }

    public String toString() {
        return title;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        Set<String> members = new HashSet<>();
        Queue<Book> issueQueue = new LinkedList<>();
        Stack<Book> returnedStack = new Stack<>();

        books.add(new Book("Java"));
        books.add(new Book("DSA"));
        books.add(new Book("OS"));

        members.add("M101");
        members.add("M102");
        members.add("M101");

        issueQueue.add(books.get(0));
        issueQueue.add(books.get(1));

        while (!issueQueue.isEmpty()) {
            Book b = issueQueue.remove();
            returnedStack.push(b);
        }

        if (!returnedStack.isEmpty()) {
            Book b = returnedStack.pop();
            issueQueue.add(b);
        }

        System.out.println("Members:");
        System.out.println(members);

        System.out.println("\nBooks in Queue:");
        for (Book b : issueQueue) {
            System.out.println(b);
        }
    }
}