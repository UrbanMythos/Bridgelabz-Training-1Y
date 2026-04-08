package WrapperClasses;
import  java.util.ArrayList;
public class WrapperCollectionExample {
    public static void main(String[] args) {

        double[] prices = {10.5, 20.0, 35.75, 5.5};

        ArrayList<Double> priceList = new ArrayList<>();
        for (int i = 0; i < prices.length; i++) {
            priceList.add(prices[i]);
        }

        double max = priceList.get(0);
        double sum = 0;

        for (int i = 0; i < priceList.size(); i++) {
            double value = priceList.get(i);

            if (value > max) {
                max = value;
            }

            sum += value;
        }

        double average = sum / priceList.size();

        System.out.println("Highest price = " + max);
        System.out.println("Average price = " + average);
    }
}
