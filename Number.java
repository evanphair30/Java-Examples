import java.util.Scanner;
 
public class Number
{
    private static Scanner inputNumScanner;

	public static void main(String[] args)
{
      int sum = 0;int average=0; int firstNumber; int secondNumber;
      inputNumScanner = new Scanner(System.in);
      System.out.println("Enter First Number: ");
      firstNumber = inputNumScanner.nextInt();
 
      System.out.println("Enter Second Number: ");
      secondNumber = inputNumScanner.nextInt();
 
      sum = firstNumber + secondNumber;
      average= sum/2;
 
      System.out.println("The sum of the two numbers you entered = " + sum);
      System.out.println("The average of the two numbers is " + average);
    }
}



