package com.gla.string_api.level1;
import java.util.*;
public class LowerCaseConversion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = sc.nextLine();
        String manualLower = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                manualLower += (char)(ch + 32);
            } else {
                manualLower += ch;
            }
        }
        String builtInLower = text.toLowerCase();
        boolean isEqual = true;

        if (manualLower.length() != builtInLower.length()) {
            isEqual = false;
        } else {
            for (int i = 0; i < manualLower.length(); i++) {
                if (manualLower.charAt(i) != builtInLower.charAt(i)) {
                    isEqual = false;
                    break;
                }
            }
        }
        System.out.println("\nLowercase using manual method: " + manualLower);
        System.out.println("Lowercase using toLowerCase: " + builtInLower);
        System.out.println("Are both lowercase strings equal? " + isEqual);
    }
}
