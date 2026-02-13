package com.gla.string_api.level2;
import java.util.*;
public class SplitTextWithoutSplit {
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

    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = sc.nextLine();
        String[] manualWords = splitWords(text);
        String[] builtInWords = text.split(" ");
        System.out.println("\nWords using manual method:");
        for (String word : manualWords) {
            System.out.println(word);
        }

        System.out.println("\nWords using built-in split() method:");
        for (String word : builtInWords) {
            System.out.println(word);
        }
        boolean isEqual = compareStringArrays(manualWords, builtInWords);
        System.out.println("\nAre both word arrays equal? " + isEqual);
    }
}
