package JavaCollection_Assignement;
import java.util.*;

class Question {
    int id;
    String text;

    public Question(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public String toString() {
        return "Q" + id + ": " + text;
    }
}

class Student {
    String studentId;
    String name;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public String toString() {
        return name + " (" + studentId + ")";
    }
}

public class OnlineExamSystem {
    public static void main(String[] args) {

        Set<String> studentIds = new HashSet<>();

        studentIds.add("S101");
        studentIds.add("S102");
        studentIds.add("S103");
        studentIds.add("S101");

        System.out.println("Enrolled Students IDs:");
        System.out.println(studentIds);

        Queue<Student> examQueue = new LinkedList<>();
        examQueue.add(new Student("S101", "Aman"));
        examQueue.add(new Student("S102", "Riya"));
        examQueue.add(new Student("S103", "Rahul"));

        List<Question> questions = new ArrayList<>();
        questions.add(new Question(1, "What is Java?"));
        questions.add(new Question(2, "Explain OOP concepts"));
        questions.add(new Question(3, "What is Polymorphism?"));

        Collections.shuffle(questions);

        System.out.println("\nRandomized Questions:");
        for (Question q : questions) {
            System.out.println(q);
        }

        System.out.println("\nServing Students:");
        while (!examQueue.isEmpty()) {
            Student s = examQueue.remove();
            System.out.println("Now taking exam: " + s);

            Stack<Question> history = new Stack<>();

            for (Question q : questions) {
                System.out.println("Showing: " + q);
                history.push(q);
            }

            System.out.println("Navigating Back:");
            while (!history.isEmpty()) {
                System.out.println("Back to: " + history.pop());
            }

            System.out.println();
        }
    }
}