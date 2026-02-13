package com.gla.string_api.level2;
import java.util.*;
public class StudentVoting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int[] ages = new int[n];

        System.out.println("Enter the ages of " + n + " students:");
        for (int i = 0; i < n; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        String[][] result = new String[n][2];
        for (int i = 0; i < n; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "Cannot Vote";
            } else if (ages[i] >= 18) {
                result[i][1] = "Can Vote";
            } else {
                result[i][1] = "Cannot Vote";
            }
        }
        System.out.printf("%-8s %-5s %-15s\n", "Student", "Age", "Voting Eligibility");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-8d %-5s %-15s\n", (i + 1), result[i][0], result[i][1]);
        }

        sc.close();
    }
}
