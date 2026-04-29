package StreamAPI.StreamAPIProblemStatements;
import java.util.*;
import java.util.stream.Collectors;

public class NameFormatter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("alice", "charlie", "bob", "david");

        List<String> formattedNames = names.stream()
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        formattedNames.forEach(System.out::println);
    }
}