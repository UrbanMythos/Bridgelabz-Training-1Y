package com.gla.string_api.level1;
import java.util.Scanner;
public class CharArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String text = sc.next();
        char[] userArray = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            userArray[i] = text.charAt(i);
        }
        char[] builtInArray = text.toCharArray();

        boolean isEqual = true;

        if (userArray.length != builtInArray.length) {
            isEqual = false;
        } else {
            for (int i = 0; i < userArray.length; i++) {
                if (userArray[i] != builtInArray[i]) {
                    isEqual = false;
                    break;
                }
            }
        }
        System.out.print("\nCharacters using charAt: ");
        for (int i = 0; i < userArray.length; i++) {
            System.out.print(userArray[i] + " ");
        }
        System.out.print("\nCharacters using toCharArray: ");
        for (int i = 0; i < builtInArray.length; i++) {
            System.out.print(builtInArray[i] + " ");
        }
        System.out.println("\nAre both character arrays equal? " + isEqual);
    }
}
