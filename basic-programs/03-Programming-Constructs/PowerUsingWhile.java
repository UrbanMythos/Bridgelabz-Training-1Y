import java.util.Scanner;
public class PowerUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer as the base number: ");
        int number = sc.nextInt();
        System.out.print("Enter a positive integer as the power: ");
        int power = sc.nextInt();
        if (number <= 0 || power < 0) {
            System.out.println("Please enter positive integers for base and power.");
        } else {
            int result = 1;
            int counter = 0;
            while (counter < power) {
                result *= number; 
                counter++;        
            }
            System.out.println(number + " raised to the power " + power + " is: " + result);
        }
    }
}
