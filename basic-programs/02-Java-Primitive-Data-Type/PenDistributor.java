public class PenDistributor{
	public static void main(String[] args) {
	    int pen = 14;
	    int distributed = pen / 3;
	    int left = pen % 3;
		System.out.println("The Pen Per Student is "+distributed+" and the remaining pen not distributed is "+left);
	}
}