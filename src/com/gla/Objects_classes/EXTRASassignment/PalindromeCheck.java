package com.gla.Objects_classes.EXTRASassignment;
import java.util.*;
public class PalindromeCheck {
    public static boolean isPalindrome(String str) {
        int start = 0, end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (isPalindrome(str))
            System.out.println("It is a Palindrome.");
        else
            System.out.println("It is not a Palindrome.");
    }
}
