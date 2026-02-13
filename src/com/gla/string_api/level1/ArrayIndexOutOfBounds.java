package com.gla.string_api.level1;
import java.util.*;
public class ArrayIndexOutOfBounds {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of names: ");
        int n = sc.nextInt();
        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.next();
        }
        System.out.println("\nGenerating ArrayIndexOutOfBoundsException:");
        System.out.println("\nHandling ArrayIndexOutOfBoundsException:");

        if (n < names.length) {
            System.out.println("Valid access: " + names[n]);
        } else {
            System.out.println("Invalid index " + n + " detected. Access skipped to avoid exception.");
        }
        System.out.println("\nProgram executed safely.");
    }
}
