package com.gla.string_api.level2;
import java.util.*;
public class WordsWithLengths {
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }
    public static String[] splitWords(String text) {
        int len = findLength(text);
        int wordCount = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        wordCount++;

        String[] words = new String[wordCount];
        int start = 0;
        int w = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                String word = "";
                for (int j = start; j < i; j++) {
                    word += text.charAt(j);
                }
                words[w++] = word;
                start = i + 1;
            }
        }
        String lastWord = "";
        for (int j = start; j < len; j++) {
            lastWord += text.charAt(j);
        }
        words[w] = lastWord;

        return words;
    }
    public static String[][] wordsWithLengths(String[] words) {
        int n = words.length;
        String[][] result = new String[n][2];

        for (int i = 0; i < n; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = sc.nextLine();
        String[] words = splitWords(text);
        String[][] wordLengths = wordsWithLengths(words);
        System.out.println("\nWord\t\tLength");
        for (int i = 0; i < wordLengths.length; i++) {
            System.out.println(wordLengths[i][0] + "\t\t" + Integer.parseInt(wordLengths[i][1]));
        }
    }
}
