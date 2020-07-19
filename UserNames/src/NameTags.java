import java.util.Random;
import java.util.Scanner;

public class NameTags
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		
		System.out.print("What is your first name?: ");
		String first = scan.nextLine();
		char fnitial = first.charAt(0); //converting first name to first letter
		
		System.out.print("What is your last name?: ");
		String last = scan.nextLine();
		String lnitial = last.substring(0, 4); //converting last name to first four letters
		
		Random gen = new Random();
		int randnum = 10 + gen.nextInt(89); //creating random integer
		
		System.out.println("Your username is: " + lnitial + fnitial + randnum);
	}
}
