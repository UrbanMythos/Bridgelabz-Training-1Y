import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a 3-digit number: ");
            int num = sc.nextInt();
            
            int digit1 = num / 100;           // First digit
            int digit2 = (num / 10) % 10;     // Second digit
            int digit3 = num % 10;             // Third digit
            
            int result = (digit1 * digit1 * digit1) + 
                         (digit2 * digit2 * digit2) + 
                         (digit3 * digit3 * digit3);
            
            if (result == num) {
                System.out.println(num + " is an Armstrong number");
            } else {
                System.out.println(num + " is not an Armstrong number");
            }
        }
    }
}
