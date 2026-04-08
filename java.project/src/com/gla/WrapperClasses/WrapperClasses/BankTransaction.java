package WrapperClasses;

public class BankTransaction {
    public static double getRemainingLimit(Double limit, double withdrawn) {
        if (limit == null) {
            return 0.0;
        }
        double remaining = limit - withdrawn;
        return remaining >= 0 ? remaining : 0.0;
    }

    public static void main(String[] args) {
        Double dailyLimit1 = 1000.0;
        Double dailyLimit2 = null;
        double withdrawn1 = 250.0;
        double withdrawn2 = 100.0;

        System.out.println("Remaining limit 1 = " + getRemainingLimit(dailyLimit1, withdrawn1));
        System.out.println("Remaining limit 2 = " + getRemainingLimit(dailyLimit2, withdrawn2));
    }
}
