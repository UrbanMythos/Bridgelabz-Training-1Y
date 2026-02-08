package com.gla.arrays.level2;
import java.util.Scanner;
public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        double[][] marks = new double[n][3];
        double[] percentages = new double[n];
        char[] grades = new char[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.print("Enter marks in Physics: ");
            double physics = sc.nextDouble();
            while (physics < 0) {
                System.out.print("Invalid marks. Enter positive value for Physics: ");
                physics = sc.nextDouble();
            }
            System.out.print("Enter marks in Chemistry: ");
            double chemistry = sc.nextDouble();
            while (chemistry < 0) {
                System.out.print("Invalid marks. Enter positive value for Chemistry: ");
                chemistry = sc.nextDouble();
            }
            System.out.print("Enter marks in Maths: ");
            double maths = sc.nextDouble();
            while (maths < 0) {
                System.out.print("Invalid marks. Enter positive value for Maths: ");
                maths = sc.nextDouble();
            }
            marks[i][0] = physics;
            marks[i][1] = chemistry;
            marks[i][2] = maths;
        }
        for (int i = 0; i < n; i++) {
            double total = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (total / 300.0) * 100.0;

            double percent = percentages[i];
            if (percent >= 80) {
                grades[i] = 'A';
            } else if (percent >= 70) {
                grades[i] = 'B';
            } else if (percent >= 60) {
                grades[i] = 'C';
            } else if (percent >= 50) {
                grades[i] = 'D';
            } else if (percent >=40) {
                grades[i] = 'E';
            }else {
                grades[i] = 'F';
            }
        }
        System.out.println("\nStudent Marks, Percentage, and Grades");
        System.out.printf("%-10s %-10s %-10s %-10s %-12s %-6s\n", "Physics", "Chemistry", "Maths", "Total", "Percentage", "Grade");
        for (int i = 0; i < n; i++) {
            double total = marks[i][0] + marks[i][1] + marks[i][2];
            System.out.printf("%-10.2f %-10.2f %-10.2f %-10.2f %-12.2f %-6c\n",
                    marks[i][0], marks[i][1], marks[i][2], total, percentages[i], grades[i]);
        }
    }
}
