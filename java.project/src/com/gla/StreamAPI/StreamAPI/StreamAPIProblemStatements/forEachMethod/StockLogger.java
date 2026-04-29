package StreamAPI.StreamAPIProblemStatements.forEachMethod;
import java.util.*;

public class StockLogger {
    public static void main(String[] args) {
        List<Double> stockPrices = Arrays.asList(150.25, 151.10, 149.80, 152.05, 150.50);

        System.out.println("--- Live Stock Price Feed ---");

        stockPrices.stream()
                .forEach(price -> System.out.println("Update: $" + price));
    }
}