package StreamAPI.StreamAPIProblemStatements.forEachMethod;
import java.util.*;

public class NotificationService {
    public static void main(String[] args) {
        List<String> emails = Arrays.asList(
                "alice@example.com",
                "bob@example.com",
                "charlie@example.com"
        );

        emails.forEach(email -> sendEmailNotification(email));
    }

    private static void sendEmailNotification(String email) {
        // Logic to connect to an SMTP server or email API
        System.out.println("Sending notification to: " + email);
    }
}