/**
 * @author Evan Phair
 * Data: 12/22/15
 * Description: First, the user enters text to be encrypted and an order to
 * rotate the text. Next, we strip out all the non-alphabet characters from
 * the input. Next, we group in 5's. Then, rearrange according to the users
 * rotate input. Finally, we output the original input, the groups of 5, and
 * the encrypted/rotated text.
 */

import java.io.IOException;
import java.util.Scanner;

public class TranspositionCode
{
	private static Scanner inputNumScanner;
	
	public static void main(String[] args) throws IOException
	{
	    inputNumScanner = new Scanner(System.in);
	    
		// Get the text.
		System.out.println("Enter text to be encrypted:\n");
    	String input = inputNumScanner.nextLine();
	    
		// Get the order.
		System.out.println("Enter an order. Type a value [1,5]:\n");
		int rotate = inputNumScanner.nextInt();
		while(rotate < 1 || rotate > 5)
		{
			System.out.println("Your order must be in the range [1,5]:\n");
			rotate = inputNumScanner.nextInt();
		}
		
		// Strip all non-letters.
		String msg = input.replaceAll("[^\\p{Alpha}]", "");
		
		// Use new lines to separate into groups of 5.
		String groupedBy5 = "";
		for(int i = 0; i < msg.length(); i+=5)
		{
			if(i+5 <= msg.length())
			{
				groupedBy5 += msg.substring(i, i+5) + "\n";
			}
			else
			{
				groupedBy5 += msg.substring(i) + "\n";
			}
	    }
		
		// Rearrange each group according to specified rotation.
		int start = 0;
		int end = 0;
		String finalString = "";;
		while((end = groupedBy5.indexOf('\n', end+1)) != -1)
		{
		    String group = groupedBy5.substring(start, end);
		    if(rotate <= group.length()) {
			    finalString += group.substring(rotate) + group.substring(0, rotate);
		    }
		    else {
		    	finalString += group;
		    }
		    start = end+1;
		}
		
		// Display the information.
		System.out.println("Input:\n" + input + "\n");
		System.out.println("Groups of 5:\n" + groupedBy5+ "\n");
		System.out.println("Encrypted:\n" + finalString + "\n");
    }
}
