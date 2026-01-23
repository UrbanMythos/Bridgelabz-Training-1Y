import java.util.Scanner;
public class FeesPerDiscount{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int fees = sc.nextInt();
	    int discountPercent = sc.nextInt();
	    double discount = (discountPercent*fees)/100;
	    double discountedfees = fees - discount;
		System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+discountedfees);
	}
}