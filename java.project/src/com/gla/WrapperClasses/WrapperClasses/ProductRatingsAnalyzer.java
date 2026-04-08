package WrapperClasses;
import java.util.ArrayList;
import java.util.Objects;

public class ProductRatingsAnalyzer {

    public static void main(String[] args) {

        int[] oldRatings = {4, 5, 3, 4};

        ArrayList<Integer> newRatings = new ArrayList<>();
        newRatings.add(5);
        newRatings.add(null);
        newRatings.add(4);

        ArrayList<Integer> combinedRatings = new ArrayList<>();

        for (int rating : oldRatings) {
            combinedRatings.add(rating);
        }

        for (Integer rating : newRatings) {
            combinedRatings.add(rating);
        }

        int sum = 0;
        int count = 0;

        for (Integer rating : combinedRatings) {
            if (Objects.nonNull(rating)) {
                sum += rating;
                count++;
            }
        }

        double average = count > 0 ? (double) sum / count : 0.0;

        System.out.println("Average rating = " + average);
    }
}