package com.gla.Objects_classes.EXTRASassignment;
import java.util.*;
public class MostFrequentChar {
    public static char mostFrequent(String str) {
        int[] freq = new int[256];
        int max = 0;
        char result = ' ';

        for (int i = 0; i < str.length(); i++)
            freq[str.charAt(i)]++;

        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] > max) {
                max = freq[str.charAt(i)];
                result = str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Most Frequent Character: " + mostFrequent(str));
    }
}
