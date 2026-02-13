package com.gla.string_api.level1;
import java.util.*;
public class NumberFormatException {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to convert to integer: ");
        String text = sc.next();
        System.out.println("\nGenerating NumberFormatException:");

        if (text.matches("\\d+")) {
            int number = Integer.parseInt(text);
            System.out.println("Converted number safely: " + number);
        } else {
            System.out.println("Input is not numeric. avoid NumberFormatException.");
        }
    }
}
