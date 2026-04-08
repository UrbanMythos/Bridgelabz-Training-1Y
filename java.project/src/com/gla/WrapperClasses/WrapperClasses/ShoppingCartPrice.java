package WrapperClasses;

public class ShoppingCartPrice {
    public static void main(String[] args) {

        String[] prices = {"250", "499", "99", "abc"};

        int totalPrice = 0;

        for (int i = 0; i < prices.length; i++) {
            try {
                int price = Integer.parseInt(prices[i]);
                totalPrice += price;
            } catch (NumberFormatException e) {
                System.out.println("Invalid price skipped: " + prices[i]);
            }
        }

        System.out.println("Total price = " + totalPrice);
    }
}
