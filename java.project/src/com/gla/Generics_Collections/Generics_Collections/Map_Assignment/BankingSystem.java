package Map_Assignment;
import java.util.*;

public class BankingSystem {
    public static void main(String[] args) {

        Map<String, Double> accounts = new HashMap<>();

        accounts.put("ACC101", 5000.0);
        accounts.put("ACC102", 12000.0);
        accounts.put("ACC103", 8000.0);
        accounts.put("ACC104", 15000.0);
        accounts.put("ACC105", 3000.0);

        deposit(accounts, "ACC101", 2000);
        withdraw(accounts, "ACC103", 9000);
        withdraw(accounts, "ACC105", 500);

        List<Map.Entry<String, Double>> list = new ArrayList<>(accounts.entrySet());

        list.sort((a, b) -> Double.compare(b.getValue(), a.getValue()));

        System.out.println("Customers sorted by balance:");
        for (Map.Entry<String, Double> e : list) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }

        System.out.println("\nTop 3 Customers:");
        for (int i = 0; i < Math.min(3, list.size()); i++) {
            System.out.println(list.get(i).getKey() + " : " + list.get(i).getValue());
        }
    }

    public static void deposit(Map<String, Double> accounts, String acc, double amount) {
        if (accounts.containsKey(acc)) {
            accounts.put(acc, accounts.get(acc) + amount);
        }
    }

    public static void withdraw(Map<String, Double> accounts, String acc, double amount) {
        if (accounts.containsKey(acc)) {
            double balance = accounts.get(acc);
            if (amount > balance) {
                System.out.println(acc + " Withdrawal failed: Insufficient balance");
            } else {
                accounts.put(acc, balance - amount);
            }
        }
    }
}