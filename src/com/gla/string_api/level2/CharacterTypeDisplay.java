package com.gla.string_api.level2;
import java.util.*;
public class CharacterTypeDisplay {
    public static String charType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        }
        if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        }
        return "Not a Letter";
    }
    public static String[][] analyzeString(String text) {
        int len = 0;
        try {
            while (true) {
                text.charAt(len);
                len++;
            }
        } catch (IndexOutOfBoundsException e) {
        }

        String[][] result = new String[len][2];

        for (int i = 0; i < len; i++) {
            result[i][0] = String.valueOf(text.charAt(i));
            result[i][1] = charType(text.charAt(i));
        }

        return result;
    }
    public static void displayTable(String[][] table) {
        System.out.println("\nCharacter\tType");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t\t" + table[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        String[][] analysis = analyzeString(text);
        displayTable(analysis);
    }
}
