package ageGuess2; //I don't understand why I need this. None of my other programs require a package
import java.util.Scanner;
import java.util.Random;

public class NumberGuess2 {

	

		public static void main(String[] args) 
		{
			Random gen = new Random();
			int age = gen.nextInt(100);
			
			Scanner scan = new Scanner (System.in);
			
			System.out.print("Can you guess my age?: ");
			int ageGuess = scan.nextInt(); //Setting this part for Exercise 4
			
		if (ageGuess != age)
			System.out.println("You guessed wrong!");
			
		if (ageGuess < age)
			System.out.println("You need to guess higher.");
		else if (ageGuess > age)
			System.out.println("You need to guess lower.");
		else
			System.out.println("Correct!");
		
		System.out.println("You guessed: " + ageGuess);
		System.out.println("The correct answer is: " + age);
		}

	}