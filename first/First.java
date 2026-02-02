import java.util.Scanner;
class First{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter something: ");
        String input = sc.nextLine();
        System.out.println("You entered: " + input);
    }
}