package com.gla.string_api.level3;
import java.util.*;
public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        String[][] freqResult = getCharFrequency(text);
        System.out.println("\nCharacter\tFrequency");
        for (int i = 0; i < freqResult.length; i++) {
            System.out.println(freqResult[i][0] + "\t\t" + freqResult[i][1]);
        }

        sc.close();
    }
    public static String[][] getCharFrequency(String str) {
        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            freq[c]++;
        }
        int uniqueCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (freq[c] != 0) {
                uniqueCount++;
                freq[c] = -freq[c];
            }
        }
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (freq[c] < 0) {
                result[index][0] = String.valueOf(c);
                result[index][1] = String.valueOf(-freq[c]);
                index++;
                freq[c] = 0;
            }
        }

        return result;
    }
}
