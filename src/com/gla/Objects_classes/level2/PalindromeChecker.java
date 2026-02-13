package com.gla.Objects_classes.level2;
import java.util.Scanner;
public class PalindromeChecker {
    static boolean checkPalindrome(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return str.equalsIgnoreCase(reversed);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (checkPalindrome(input))
            System.out.println("It is a Palindrome.");
        else
            System.out.println("It is NOT a Palindrome.");
    }
}
