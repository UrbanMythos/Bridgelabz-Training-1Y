package StreamAPI.LambdaExpressionsProblemStatements.MethodReferences;
import java.util.*;

public class HRLetterApp {

    public static void printFormatted(String name) {
        System.out.println("Employee: " + name);
    }

    public static void main(String[] args) {

        List<String> names = Arrays.asList("  rahul", "an", "sneha  ", "", "amit");

        names.stream()
                .map(String::trim)
                .filter(name -> !name.isEmpty() && name.length() > 2)
                .map(String::toUpperCase)
                .forEach(HRLetterApp::printFormatted);
    }
}