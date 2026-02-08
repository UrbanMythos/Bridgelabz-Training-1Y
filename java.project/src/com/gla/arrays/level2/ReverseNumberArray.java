package com.gla.arrays.level2;
import java.util.Scanner;
public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (number < 0) {
            number = -number;
        }
        int tempNumber = number;
        int count = 0;
        if (tempNumber == 0) {
            count = 1;
        }
        while (tempNumber != 0) {
            tempNumber /= 10;
            count++;
        }
        int[] digits = new int[count];
        tempNumber = number;
        for (int i = 0; i < count; i++) {
            digits[i] = tempNumber % 10;
            tempNumber /= 10;
        }
        int[] reversed = new int[count];
        for (int i = 0; i < count; i++) {
            reversed[i] = digits[count - 1 - i];
        }
        System.out.println("\nDigits of the number in reverse order:");
        for (int i = 0; i < count; i++) {
            System.out.print(reversed[i] + " ");
        }
    }
}
