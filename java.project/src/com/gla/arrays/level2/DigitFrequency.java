package com.gla.arrays.level2;
import java.util.Scanner;
public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = sc.nextLong();
        if (number < 0) {
            number = -number;
        }
        long tempNumber = number;
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
            digits[i] = (int)(tempNumber % 10);
            tempNumber /= 10;
        }
        int[] frequency = new int[10];
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }
        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " time(s)");
            }
        }
    }
}
