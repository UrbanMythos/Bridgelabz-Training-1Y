package JavaCollection_Assignement;
import java.util.*;

class Account {
    int accountId;
    String name;

    public Account(int accountId, String name) {
        this.accountId = accountId;
        this.name = name;
    }

    public int hashCode() {
        return Objects.hash(accountId);
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Account)) return false;
        Account a = (Account) obj;
        return this.accountId == a.accountId;
    }

    public String toString() {
        return "Account " + accountId + " - " + name;
    }
}

class Transaction {
    int txnId;
    int accountId;
    double amount;

    public Transaction(int txnId, int accountId, double amount) {
        this.txnId = txnId;
        this.accountId = accountId;
        this.amount = amount;
    }

    public String toString() {
        return "TxnID: " + txnId + ", AccID: " + accountId + ", Amount: " + amount;
    }
}

public class BankingTransactionSystem {
    public static void main(String[] args) {

        Set<Account> accounts = new HashSet<>();
        accounts.add(new Account(101, "Aman"));
        accounts.add(new Account(102, "Riya"));
        accounts.add(new Account(103, "Rahul"));

        Queue<Transaction> txnQueue = new LinkedList<>();
        txnQueue.add(new Transaction(1, 101, 500));
        txnQueue.add(new Transaction(2, 102, 1000));
        txnQueue.add(new Transaction(3, 105, 700)); // invalid account

        List<Transaction> history = new ArrayList<>();

        Stack<Transaction> rollbackStack = new Stack<>();

        System.out.println("Processing Transactions:");

        while (!txnQueue.isEmpty()) {
            Transaction txn = txnQueue.remove();

            boolean isValid = false;
            for (Account acc : accounts) {
                if (acc.accountId == txn.accountId) {
                    isValid = true;
                    break;
                }
            }

            if (isValid) {
                System.out.println("Success: " + txn);
                history.add(txn);
                rollbackStack.push(txn);
            } else {
                System.out.println("Failed (Invalid Account): " + txn);
            }
        }

        System.out.println("\nRollback Last Transaction:");

        if (!rollbackStack.isEmpty()) {
            Transaction last = rollbackStack.pop();
            history.remove(last);
            System.out.println("Rolled Back: " + last);
        }

        System.out.println("\nFinal Transaction History:");
        for (Transaction t : history) {
            System.out.println(t);
        }
    }
}