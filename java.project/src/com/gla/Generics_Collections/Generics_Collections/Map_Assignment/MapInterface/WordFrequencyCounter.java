package Map_Assignment.MapInterface;
import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {

        String text = "Hello world, hello Java!";

        HashMap<String, Integer> map = new HashMap<>();

        text = text.toLowerCase().replaceAll("[^a-z ]", "");
        String[] words = text.split("\\s+");

        for (String word : words) {
            if (word.isEmpty()) continue;
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        System.out.println(map);
    }
}