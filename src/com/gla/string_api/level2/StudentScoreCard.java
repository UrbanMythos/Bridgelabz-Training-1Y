package com.gla.string_api.level2;
import java.util.*;
public class StudentScoreCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] marks = generateMarks(n);
        double[][] totals = calculateTotals(marks);
        String[] grades = calculateGrades(totals);
        displayScoreCard(marks, totals, grades);

        sc.close();
    }
    public static int[][] generateMarks(int n) {
        int[][] marks = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = 50 + (int)(Math.random() * 51);
            }
        }
        return marks;
    }
    public static double[][] calculateTotals(int[][] marks) {
        int n = marks.length;
        double[][] totals = new double[n][3];
        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = (double) total / 3;
            double percent = (double) total / 3;

            totals[i][0] = total;
            totals[i][1] = Math.round(avg * 100.0) / 100.0;
            totals[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return totals;
    }
    public static String[] calculateGrades(double[][] totals) {
        int n = totals.length;
        String[] grades = new String[n];
        for (int i = 0; i < n; i++) {
            double percent = totals[i][2];
            if (percent >= 90) grades[i] = "A+";
            else if (percent >= 80) grades[i] = "A";
            else if (percent >= 70) grades[i] = "B+";
            else if (percent >= 60) grades[i] = "B";
            else if (percent >= 50) grades[i] = "C";
            else grades[i] = "F";
        }
        return grades;
    }
    public static void displayScoreCard(int[][] marks, double[][] totals, String[] grades) {
        System.out.println("\nStudent\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t\t%.0f\t%.2f\t%.2f\t\t%s\n",
                    i + 1,
                    marks[i][0],
                    marks[i][1],
                    marks[i][2],
                    totals[i][0],
                    totals[i][1],
                    totals[i][2],
                    grades[i]);
        }
    }
}
