import java.util.Scanner;
public class AreaOfTriangleUser{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    double base = sc.nextDouble();
	    double height = sc.nextDouble();
	    double areaSqInches = 0.5 * base * height;
	    double areaSqCm = areaSqInches * 6.4516;
	    
		System.out.println("Area of triangle in sqcm is "+areaSqCm+" sqcm and in sqinches is "+areaSqCm);
	}
}