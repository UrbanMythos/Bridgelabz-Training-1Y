public class FessDiscount{
	public static void main(String[] args) {
	    double fees = 125000;
	    double discountPercent = 10;
	    double discount = (10*fees)/100;
	    double discountedfees = fees - discount;
		System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+discountedfees);
	}
}