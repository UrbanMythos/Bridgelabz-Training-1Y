package StreamAPI.StreamAPIProblemStatements;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

class Member {
    String name;
    LocalDate expiryDate;

    public Member(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }
}

public class GymManager {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate threshold = today.plusDays(30);

        List<Member> members = Arrays.asList(
                new Member("Alice", LocalDate.of(2026, 4, 25)), // Expires in 5 days
                new Member("Bob", LocalDate.of(2026, 6, 10)),   // Expires in > 30 days
                new Member("Charlie", LocalDate.of(2026, 5, 15)), // Expires in 25 days
                new Member("Diana", LocalDate.of(2026, 8, 20))  // Expires in > 30 days
        );

        List<Member> expiringMembers = members.stream()
                .filter(m -> !m.expiryDate.isBefore(today) && m.expiryDate.isBefore(threshold))
                .collect(Collectors.toList());

        expiringMembers.forEach(m ->
                System.out.println("Alert: " + m.name + "'s membership expires on " + m.expiryDate));
    }
}