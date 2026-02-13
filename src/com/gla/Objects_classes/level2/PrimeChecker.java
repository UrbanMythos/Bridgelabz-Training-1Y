package com.gla.Objects_classes.level2;
import java.util.*;
public class PrimeChecker {
    static boolean isPrime(int num) {
        if (num <= 1) return false;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPrime(num))
            System.out.println("It is a Prime number.");
        else
            System.out.println("It is NOT a Prime number.");
    }
}
