import java.util.Scanner;
public class StudentGradeDetailed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks for Physics: ");
        double physics = sc.nextDouble();
        System.out.print("Enter marks for Chemistry: ");
        double chemistry = sc.nextDouble();
        System.out.print("Enter marks for Maths: ");
        double maths = sc.nextDouble();
        if (physics < 0 || physics > 100 || chemistry < 0 || chemistry > 100 || maths < 0 || maths > 100) {
            System.out.println("Please enter valid marks between 0 and 100 for all subjects.");
        } else {
            double total = physics + chemistry + maths;
            double percentage = total / 3.0;
            String grade;
            String remarks;
            if (percentage >= 80) {
                grade = "A";
                remarks = "Level 4, above agency-normalized standards";
            } else if (percentage >= 70) {
                grade = "B";
                remarks = "Level 3, at agency-normalized standards";
            } else if (percentage >= 60) {
                grade = "C";
                remarks = "Level 2, below, but approaching agency-normalized standards";
            } else if (percentage >= 50) {
                grade = "D";
                remarks = "Level 1, well below agency-normalized standards";
            } else if (percentage >= 40) {
                grade = "E";
                remarks = "Level 1-, too below agency-normalized standards";
            } else {
                grade = "R";
                remarks = "Remedial standards";
            }
            System.out.println("\n--- Student Report ---");
            System.out.printf("Physics: %.2f, Chemistry: %.2f, Maths: %.2f%n", physics, chemistry, maths);
            System.out.printf("Average Marks: %.2f%%%n", percentage);
            System.out.println("Grade: " + grade);
            System.out.println("Remarks: " + remarks);
        }
    }
}
