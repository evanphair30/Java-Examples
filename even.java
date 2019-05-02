//Evan Phair			
//10/18/2015		
//if statement			
//even or odd
import java.util.Scanner;

public class even 
{
	private static Scanner input;

	public static void main(String args[]) 
	{
	input = new Scanner(System.in);
	int number; 
	int oddEven;

	System.out.println("enter your number: ");
	number = input.nextInt();

	oddEven = number%2;

	switch (oddEven) 
	{
	case 0:
	System.out.println(number+" is odd.");
	
	case 1:
	System.out.println(number+" is even.");

	}
	}
	}

