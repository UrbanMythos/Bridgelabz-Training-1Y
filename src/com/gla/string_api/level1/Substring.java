package com.gla.string_api.level1;
import java.util.Scanner;
public class Substring {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String text = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();
        String charAtSubstring = "";
        for (int i = start; i < end; i++) {
            charAtSubstring = charAtSubstring + text.charAt(i);
        }
        String builtInSubstring = text.substring(start, end);
        boolean isEqual = true;

        if (charAtSubstring.length() != builtInSubstring.length()) {
            isEqual = false;
        } else {
            for (int i = 0; i < charAtSubstring.length(); i++) {
                if (charAtSubstring.charAt(i) != builtInSubstring.charAt(i)) {
                    isEqual = false;
                    break;
                }
            }
        }
        System.out.println("\nSubstring using charAt: " + charAtSubstring);
        System.out.println("Substring using substring: " + builtInSubstring);
        System.out.println("Are both substrings equal? " + isEqual);
    }
}
