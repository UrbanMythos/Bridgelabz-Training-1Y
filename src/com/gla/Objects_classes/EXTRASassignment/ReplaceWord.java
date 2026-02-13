package com.gla.Objects_classes.EXTRASassignment;
import java.util.Scanner;
public class ReplaceWord {
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        String[] words = sentence.split(" ");
        String result = "";

        for (String word : words) {
            if (word.equals(oldWord))
                result += newWord + " ";
            else
                result += word + " ";
        }

        return result.trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Enter word to replace: ");
        String oldWord = sc.nextLine();

        System.out.print("Enter new word: ");
        String newWord = sc.nextLine();

        System.out.println("Modified Sentence: " + replaceWord(sentence, oldWord, newWord));
    }
}
