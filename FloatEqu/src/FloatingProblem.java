
public class FloatingProblem {

	public static void main(String[] args) {
		
		final double TOLERANCE = 0.001;
		
		double prob1 = (1.0/10) * (1.0/10);
		double prob2 = (1.0/100);
		
		if (Math.abs(prob1 - prob2) < TOLERANCE)
				System.out.println("EQUAL");
		else
			System.out.println("NOT EQUAL");
//If you leave the line at (prob1 == prob2), the program will try to compare the numbers based on computation assignments,
//You have to set a threshold so that program is comparing a "rounded" answer.		

	}

}