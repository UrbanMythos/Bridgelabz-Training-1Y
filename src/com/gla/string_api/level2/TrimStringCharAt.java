package com.gla.string_api.level2;
import java.util.*;
public class TrimStringCharAt {
    public static int[] trimIndices(String text) {
        int start = 0;
        int end = 0;
        int len = 0;
        try {
            while (true) {
                text.charAt(len);
                len++;
            }
        } catch (IndexOutOfBoundsException e) {
        }
        for (start = 0; start < len; start++) {
            if (text.charAt(start) != ' ') {
                break;
            }
        }
        for (end = len - 1; end >= 0; end--) {
            if (text.charAt(end) != ' ') {
                break;
            }
        }

        return new int[]{start, end};
    }

    public static String substringCharAt(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }
    public static boolean compareStrings(String s1, String s2) {
        int len1 = 0, len2 = 0;
        try {
            while (true) { s1.charAt(len1); len1++; }
        } catch (IndexOutOfBoundsException e) { }
        try {
            while (true) { s2.charAt(len2); len2++; }
        } catch (IndexOutOfBoundsException e) { }

        if (len1 != len2) return false;

        for (int i = 0; i < len1; i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with spaces: ");
        String text = sc.nextLine();
        int[] indices = trimIndices(text);
        String trimmedManual = substringCharAt(text, indices[0], indices[1]);
        String trimmedBuiltIn = text.trim();
        System.out.println("\nTrimmed (Manual using charAt: \"" + trimmedManual + "\"");
        System.out.println("Trimmed (Built-in trim: \"" + trimmedBuiltIn + "\"");
        boolean isEqual = compareStrings(trimmedManual, trimmedBuiltIn);
        System.out.println("\nDo the manual trim and built-in trim match? " + isEqual);
    }
}
