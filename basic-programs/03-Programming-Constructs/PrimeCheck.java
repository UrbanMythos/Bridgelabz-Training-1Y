import java.util.Scanner;
public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number greater than 1: ");
        int number = sc.nextInt();
        if (number <= 1) {
            System.out.println("Number should be greater than 1 to check for prime.");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= number - 1; i++) {
                if (number % i == 0) {
                    isPrime = false; 
                    break; 
                }
            }
            if (isPrime) {
                System.out.println(number + " is a Prime Number.");
            } else {
                System.out.println(number + " is NOT a Prime Number.");
            }
        }
    }
}
