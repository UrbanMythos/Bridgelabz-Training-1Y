package com.gla.string_api.level1;
import java.util.*;
public class UpperCaseConversion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = sc.nextLine();
        String manualUpper = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                manualUpper += (char)(ch - 32);
            } else {
                manualUpper += ch;
            }
        }
        String builtInUpper = text.toUpperCase();
        boolean isEqual = true;

        if (manualUpper.length() != builtInUpper.length()) {
            isEqual = false;
        } else {
            for (int i = 0; i < manualUpper.length(); i++) {
                if (manualUpper.charAt(i) != builtInUpper.charAt(i)) {
                    isEqual = false;
                    break;
                }
            }
        }
        System.out.println("\nUppercase using manual method: " + manualUpper);
        System.out.println("Uppercase using toUpperCase: " + builtInUpper);
        System.out.println("Are both uppercase strings equal? " + isEqual);
    }
}
