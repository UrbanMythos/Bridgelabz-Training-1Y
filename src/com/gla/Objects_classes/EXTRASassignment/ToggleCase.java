package com.gla.Objects_classes.EXTRASassignment;
import java.util.Scanner;
public class ToggleCase {
    public static String toggle(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch))
                result += Character.toLowerCase(ch);
            else if (Character.isLowerCase(ch))
                result += Character.toUpperCase(ch);
            else
                result += ch;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Toggled string: " + toggle(str));
    }
}
