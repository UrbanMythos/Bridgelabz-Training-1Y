package com.gla.Objects_classes.level2;
import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {
    static int generateGuess(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max - min + 1) + min;
    }

    static String getFeedback(Scanner sc) {
        System.out.print("Is the guess High, Low, or Correct? ");
        return sc.nextLine().toLowerCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = 1, max = 100;
        String feedback = "";

        System.out.println("Think of a number between 1 and 100.");

        while (!feedback.equals("correct")) {
            int guess = generateGuess(min, max);
            System.out.println("Computer guesses: " + guess);

            feedback = getFeedback(sc);

            if (feedback.equals("high")) {
                max = guess - 1;
            } else if (feedback.equals("low")) {
                min = guess + 1;
            }
        }

        System.out.println("Yay! Computer guessed correctly.");
    }
}
