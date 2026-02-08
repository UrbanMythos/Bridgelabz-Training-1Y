package com.gla.arrays.level2;
import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        double[] weights = new double[n];
        double[] heights = new double[n];
        double[] bmis = new double[n];
        String[] status = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.print("Enter weight (kg): ");
            weights[i] = sc.nextDouble();
            while (weights[i] <= 0) {
                System.out.print("Invalid weight. Enter again: ");
                weights[i] = sc.nextDouble();
            }
            System.out.print("Enter height (m): ");
            heights[i] = sc.nextDouble();
            while (heights[i] <= 0) {
                System.out.print("Invalid height. Enter again: ");
                heights[i] = sc.nextDouble();
            }
        }
        for (int i = 0; i < n; i++) {
            bmis[i] = weights[i] / (heights[i] * heights[i]);
            if (bmis[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmis[i] < 24.9) {
                status[i] = "Normal weight";
            } else if (bmis[i] < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        System.out.println("\nBMI Report");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(m)", "Weight(kg)", "BMI", "Status");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n",
                    heights[i], weights[i], bmis[i], status[i]);
        }
    }
}
