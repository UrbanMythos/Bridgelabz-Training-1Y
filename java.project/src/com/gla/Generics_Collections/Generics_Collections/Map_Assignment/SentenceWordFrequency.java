package Map_Assignment;
import java.util.*;

public class SentenceWordFrequency {
    public static void main(String[] args) {

        String sentence = "Java is fun and Java is powerful";

        Map<String, Integer> freq = new HashMap<>();

        sentence = sentence.toLowerCase().replaceAll("[^a-z ]", "");
        String[] words = sentence.split("\\s+");

        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}