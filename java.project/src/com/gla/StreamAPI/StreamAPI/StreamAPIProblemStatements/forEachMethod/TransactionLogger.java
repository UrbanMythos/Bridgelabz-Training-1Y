package StreamAPI.StreamAPIProblemStatements.forEachMethod;
import java.time.LocalDateTime;
import java.util.*;

public class TransactionLogger {
    public static void main(String[] args) {
        List<String> transactionIds = Arrays.asList("TXN-1001", "TXN-1002", "TXN-1003");

        transactionIds.forEach(id ->
                System.out.println(LocalDateTime.now() + " - Transaction: " + id)
        );
    }
}