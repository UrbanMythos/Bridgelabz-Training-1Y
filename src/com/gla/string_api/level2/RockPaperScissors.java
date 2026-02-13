package com.gla.string_api.level2;
import java.util.*;
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of games to play: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] userChoices = new String[n];
        String[] computerChoices = new String[n];
        String[] winners = new String[n];

        int userWins = 0, computerWins = 0, draws = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Game " + (i + 1) + " - Enter your choice (rock/paper/scissors): ");
            String user = sc.nextLine().toLowerCase();
            String computer = getComputerChoice();

            userChoices[i] = user;
            computerChoices[i] = computer;

            String winner = getWinner(user, computer);
            winners[i] = winner;

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) computerWins++;
            else draws++;
        }
        System.out.printf("\n%-8s %-12s %-12s %-10s\n", "Game", "User Choice", "Computer Choice", "Winner");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-8d %-12s %-12s %-10s\n", (i + 1), userChoices[i], computerChoices[i], winners[i]);
        }
        double userPercent = ((double) userWins / n) * 100;
        double computerPercent = ((double) computerWins / n) * 100;

        System.out.println("\nTotal Games: " + n);
        System.out.println("User Wins: " + userWins + " (" + String.format("%.2f", userPercent) + "%)");
        System.out.println("Computer Wins: " + computerWins + " (" + String.format("%.2f", computerPercent) + "%)");
        System.out.println("Draws: " + draws);

        sc.close();
    }
    public static String getComputerChoice() {
        double rand = Math.random();
        if (rand < 0.33) return "rock";
        else if (rand < 0.66) return "paper";
        else return "scissors";
    }
    public static String getWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";
        if (user.equals("rock") && computer.equals("scissors")) return "User";
        if (user.equals("scissors") && computer.equals("paper")) return "User";
        if (user.equals("paper") && computer.equals("rock")) return "User";
        return "Computer";
    }
}
