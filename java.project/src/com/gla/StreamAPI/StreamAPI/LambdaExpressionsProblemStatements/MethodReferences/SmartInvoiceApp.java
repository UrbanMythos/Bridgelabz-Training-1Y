package StreamAPI.LambdaExpressionsProblemStatements.MethodReferences;
import java.util.*;

class Invoice {
    int transactionId;
    double amount;

    public Invoice(int transactionId) {
        this.transactionId = transactionId;
        this.amount = transactionId * 10.5;
    }

    public String toString() {
        return "Invoice ID: " + transactionId + " | Amount: " + amount;
    }

    public double getAmount() {
        return amount;
    }
}

public class SmartInvoiceApp {

    public static void main(String[] args) {

        List<Integer> transactionIds = Arrays.asList(100, -1, 102, 0, 105);

        List<Invoice> invoices = transactionIds.stream()
                .filter(id -> id > 0)
                .map(Invoice::new)
                .toList();

        invoices.stream()
                .filter(inv -> inv.getAmount() > 1000)
                .forEach(System.out::println);
    }
}