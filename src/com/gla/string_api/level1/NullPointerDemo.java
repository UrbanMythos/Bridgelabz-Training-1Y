package com.gla.string_api.level1;

public class NullPointerDemo {
    public static void main(String[] args) {
        System.out.println("Generating NullPointerException:");

        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Exception occurred: " + e);
        }
        System.out.println("\nHandling NullPointerException:");

        String text = null;

        try {
            System.out.println(text.toLowerCase());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled successfully.");
        }

        System.out.println("\nProgram executed successfully.");
    }
}
