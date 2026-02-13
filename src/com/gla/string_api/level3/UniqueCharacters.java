package com.gla.string_api.level3;
import java.util.*;
public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        int len = getLength(text);
        char[] uniqueChars = findUniqueCharacters(text, len);
        System.out.print("Unique characters in the string: ");
        for (char c : uniqueChars) {
            if (c != '\0') {
                System.out.print(c + " ");
            }
        }
        sc.close();
    }
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }
    public static char[] findUniqueCharacters(String str, int len) {
        char[] temp = new char[len];
        int index = 0;

        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < index; j++) {
                if (temp[j] == c) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                temp[index] = c;
                index++;
            }
        }
        char[] unique = new char[index];
        for (int i = 0; i < index; i++) {
            unique[i] = temp[i];
        }

        return unique;
    }
}
