package com.gla.string_api.level1;
import java.util.*;
public class IllegalArgumentException {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.println("If uncommented, this line would cause .");
        System.out.println("\nHandling IllegalArgumentException :");

        try {
            System.out.println(text.substring(5, 2));
        }  catch (RuntimeException e) {
            System.out.println("Generic RuntimeException handled: " + e);
        }


    }
}
