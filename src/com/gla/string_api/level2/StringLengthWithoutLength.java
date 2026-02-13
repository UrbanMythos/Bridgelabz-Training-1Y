package com.gla.string_api.level2;
import java.util.*;
public class StringLengthWithoutLength {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();
        int manualLength = findLength(input);
        int builtInLength = input.length();
        System.out.println("Length calculated using charAt method: " + manualLength);
        System.out.println("Length calculated using built-in length method: " + builtInLength);
    }
}
