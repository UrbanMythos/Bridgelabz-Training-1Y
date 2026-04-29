package StreamAPI.StreamAPIProblemStatements;
import java.util.*;
import java.util.stream.Collectors;

class Claim {
    String type;
    double amount;

    public Claim(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }
}

public class InsuranceAnalyzer {
    public static void main(String[] args) {
        List<Claim> claims = Arrays.asList(
                new Claim("Medical", 1500.0),
                new Claim("Auto", 3000.0),
                new Claim("Medical", 2500.0),
                new Claim("Home", 5000.0),
                new Claim("Auto", 1000.0),
                new Claim("Medical", 2000.0)
        );

        Map<String, Double> averageClaims = claims.stream()
                .collect(Collectors.groupingBy(
                        c -> c.type,
                        Collectors.averagingDouble(c -> c.amount)
                ));

        averageClaims.forEach((type, avg) ->
                System.out.println("Type: " + type + " | Average Amount: $" + avg));
    }
}