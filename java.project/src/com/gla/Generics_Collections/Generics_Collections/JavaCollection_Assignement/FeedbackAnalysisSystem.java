package JavaCollection_Assignement;
import java.util.*;

public class FeedbackAnalysisSystem {
    public static void main(String[] args) {

        List<String> feedbackList = new ArrayList<>();
        feedbackList.add("Good service");
        feedbackList.add("Fast delivery");
        feedbackList.add("Good service");
        feedbackList.add("Average experience");

        Set<String> uniqueFeedback = new HashSet<>(feedbackList);

        Queue<String> feedbackQueue = new LinkedList<>(uniqueFeedback);

        Stack<String> recentStack = new Stack<>();

        while (!feedbackQueue.isEmpty()) {
            String f = feedbackQueue.remove();
            recentStack.push(f);
        }

        System.out.println("Processed Feedback:");
        for (String f : uniqueFeedback) {
            System.out.println(f);
        }

        System.out.println("\nRecent Feedbacks:");
        int count = 0;
        while (!recentStack.isEmpty() && count < 3) {
            System.out.println(recentStack.pop());
            count++;
        }
    }
}