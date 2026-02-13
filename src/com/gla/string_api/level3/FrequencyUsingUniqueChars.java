package com.gla.string_api.level3;
import java.util.*;
public class FrequencyUsingUniqueChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        String[][] freqResult = getFrequencyUsingUnique(text);
        System.out.println("\nCharacter\tFrequency");
        for (int i = 0; i < freqResult.length; i++) {
            System.out.println(freqResult[i][0] + "\t\t" + freqResult[i][1]);
        }

        sc.close();
    }
    public static char[] uniqueCharacters(String str) {
        int length = str.length();
        char[] temp = new char[length];
        int count = 0;

        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < count; j++) {
                if (temp[j] == ch) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[count] = ch;
                count++;
            }
        }
        char[] uniqueChars = new char[count];
        for (int i = 0; i < count; i++) {
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }
    public static String[][] getFrequencyUsingUnique(String str) {
        char[] unique = uniqueCharacters(str);
        String[][] result = new String[unique.length][2];
        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }
        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }

        return result;
    }
}
