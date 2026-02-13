package com.gla.string_api.level3;
import java.util.*;
public class BMICalculator {
    public static String[] calculateBMIStatus(double weight, double height) {
        double heightInMeters = height / 100.0; // Convert cm to meters
        double bmi = weight / (heightInMeters * heightInMeters);

        String status;
        if (bmi < 18.5) status = "Underweight";
        else if (bmi < 25) status = "Normal";
        else if (bmi < 30) status = "Overweight";
        else status = "Obese";

        return new String[]{String.format("%.2f", weight), String.format("%.2f", height),
                String.format("%.2f", bmi), status};
    }
    public static String[][] processBMI(double[][] data) {
        String[][] result = new String[10][4];
        for (int i = 0; i < 10; i++) {
            result[i] = calculateBMIStatus(data[i][0], data[i][1]);
        }
        return result;
    }
    public static void displayResults(String[][] results) {
        System.out.println("Weight(kg)  Height(cm)  BMI      Status");
        for (int i = 0; i < results.length; i++) {
            System.out.printf("%-10s  %-10s  %-7s  %s%n",
                    results[i][0], results[i][1], results[i][2], results[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2]; // 10 persons, weight and height

        // Input for 10 persons
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }

        String[][] results = processBMI(data);
        displayResults(results);

        sc.close();
    }
}
