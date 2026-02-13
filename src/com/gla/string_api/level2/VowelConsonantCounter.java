package com.gla.string_api.level2;
import java.util.*;
public class VowelConsonantCounter {
    public static String charType(char ch) {

        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32); // 'A'->'a', 'B'->'b', etc.
        }
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        }
        if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        }
        return "Not a Letter";
    }
    public static int[] countVowelsConsonants(String text) {
        int vowels = 0;
        int consonants = 0;

        int len = 0;
        try {
            while (true) {
                text.charAt(len);
                len++;
            }
        } catch (IndexOutOfBoundsException e) {
        }

        for (int i = 0; i < len; i++) {
            String type = charType(text.charAt(i));
            if (type.equals("Vowel")) {
                vowels++;
            } else if (type.equals("Consonant")) {
                consonants++;
            }
        }

        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        int[] counts = countVowelsConsonants(text);
        System.out.println("\nVowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);
    }
}
