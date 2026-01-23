public class EarthVolume{
	public static void main(String[] args) {
	    double radius = 6378;
	    double volofearth = (4 * 3.14 * radius * radius * radius)/3;
	    double milesearth = ((4 * 3.14 * radius * radius * radius)/3)*1.6;
		System.out.println("The volume of earth in cubic kilometers is "+volofearth+" and cubic miles is "+milesearth);
	}
}