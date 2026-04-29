package JavaCollection_Assignement.ListInterface;
import java.util.*;

public class FrequencyCounter {

    public static Map<String, Integer> findFrequency(List<String> list) {
        Map<String, Integer> freqMap = new HashMap<>();

        for (String item : list) {
            if (freqMap.containsKey(item)) {
                freqMap.put(item, freqMap.get(item) + 1);
            } else {
                freqMap.put(item, 1);
            }
        }

        return freqMap;
    }

    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("apple", "banana", "apple", "orange");

        Map<String, Integer> result = findFrequency(fruits);

        System.out.println("Frequency Map: " + result);
    }
}