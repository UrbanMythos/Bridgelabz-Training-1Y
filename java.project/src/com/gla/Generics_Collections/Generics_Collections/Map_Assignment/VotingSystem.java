package Map_Assignment;
import java.util.*;

public class VotingSystem {
    public static void main(String[] args) {

        Map<String, Integer> votes = new HashMap<>();

        castVote(votes, "Aman");
        castVote(votes, "Riya");
        castVote(votes, "Aman");
        castVote(votes, "Rahul");
        castVote(votes, "Riya");
        castVote(votes, "Aman");
        castVote(votes, "Rahul");
        castVote(votes, "Riya");
        castVote(votes, "Riya");
        castVote(votes, "Aman");

        String winner = null;
        int maxVotes = 0;

        for (Map.Entry<String, Integer> entry : votes.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());

            if (entry.getValue() > maxVotes) {
                maxVotes = entry.getValue();
                winner = entry.getKey();
            }
        }

        System.out.println("\nWinner: " + winner);
    }

    public static void castVote(Map<String, Integer> votes, String candidate) {
        votes.put(candidate, votes.getOrDefault(candidate, 0) + 1);
    }
}