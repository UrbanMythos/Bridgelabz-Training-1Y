package StreamAPI.LambdaExpressionsProblemStatements.LambdaExpressions;
import java.util.*;
import java.util.function.Predicate;

class Alert {
    String type;
    String message;
    int priority;

    public Alert(String type, String message, int priority) {
        this.type = type;
        this.message = message;
        this.priority = priority;
    }

    public String toString() {
        return type + " | " + message + " | Priority: " + priority;
    }
}

public class SmartHospitalApp {

    public static void main(String[] args) {

        List<Alert> alerts = new ArrayList<>();

        alerts.add(new Alert("Emergency", "Heart rate critical", 3));
        alerts.add(new Alert("General", "Daily checkup", 1));
        alerts.add(new Alert("Reminder", "Medicine time", 2));
        alerts.add(new Alert("Emergency", "BP high urgent", 3));

        Predicate<Alert> smartFilter = alert ->
                alert.priority == 3 ||
                        alert.type.equals("Emergency") ||
                        alert.message.toLowerCase().contains("medicine");

        alerts.stream()
                .filter(smartFilter)
                .forEach(System.out::println);
    }
}