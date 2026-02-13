package com.gla.string_api.level1;
import java.util.*;
public class StringIndexOutOfBoundsDemo {
    static void generateException(String text) {

        System.out.println(text.charAt(text.length()));
    }
    static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception handled: " + e);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
        System.out.println("\nGenerating StringIndexOutOfBoundsException:");
        try {
            generateException(text);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Program stopped due to exception.");
        }
        System.out.println("\nHandling StringIndexOutOfBoundsException:");
        handleException(text);
    }
}
