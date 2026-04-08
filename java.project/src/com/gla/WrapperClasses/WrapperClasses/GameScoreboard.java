package WrapperClasses;
public class GameScoreboard {

    public static void main(String[] args) {

        Integer[] scores = {50, null, 75, 100, null, 25};

        int notPlayedCount = 0;
        int totalScore = 0;

        for (Integer score : scores) {
            if (score == null) {
                notPlayedCount++;
            } else {
                totalScore += score;
            }
        }

        System.out.println("Players not played = " + notPlayedCount);
        System.out.println("Total of valid scores = " + totalScore);
    }
}