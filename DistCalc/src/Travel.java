import java.text.DecimalFormat;

public class Travel 
{

	public static void main(String[] args) 
	{
		int x1, x2, y1, y2;
			x1 = 1;
			x2 = 2;
			y1 = 3;
			y2 = 4;
		
		double distance;
		
		distance = Math.sqrt(((x2 - x1)*(x2-x1)) + ((y2 - y1) * (y2 - y1)));
		
		System.out.println("Point 1: (" + x1 + ", " + y1 + ")");
		System.out.println("Point 2: (" + x2 + ", " + y2 + ")");
		
		DecimalFormat df = new DecimalFormat("#.###");
		System.out.println("\nCalculated Distance: " + df.format(distance));
	}

}
