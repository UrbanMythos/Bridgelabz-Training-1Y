package com.gla.string_api.level3;
import java.util.*;
public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char firstUnique = findFirstNonRepeatingChar(text);
        if (firstUnique != '\0') {
            System.out.println("The first non-repeating character is: " + firstUnique);
        } else {
            System.out.println("No non-repeating character found in the string.");
        }

        sc.close();
    }
    public static char findFirstNonRepeatingChar(String str) {
        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            freq[c]++;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (freq[c] == 1) {
                return c;
            }
        }
        return '\0';
    }
}
