/**
 * @author Evan Phair
 * Date: 12/21/15
 * Description: This program asks for text and a skip character from the user.
 * It then replaces every 'skip'th character with a random character.
 * 
 * Ex) msg = abcd; skip = 1; finalMessage = XYZO --- where the output are random chars.
 * Ex) msg = hello world; skip=3 finalMessage = heElogwoXld% --- where the output are random chars.
 */

import java.io.IOException;
import java.util.Scanner;
import java.util.Random;

public class SkipCode
{
	private static Scanner inputNumScanner;
	private static Random randomGenerator;
	
	public static void main(String[] args) throws IOException
	{
	    inputNumScanner = new Scanner(System.in);
	    randomGenerator = new Random();
	    
		// Get the text.
		System.out.println("Enter text to be encrypted:\n");
    	String msg = inputNumScanner.nextLine();
	    
		// Get the skip number.
		System.out.println("Enter a skip number:\n");
		int skip = inputNumScanner.nextInt();
		while(skip > msg.length() || skip < 1)
		{
			System.out.println("Your skip number must be within the length of the text:\n");
			skip = inputNumScanner.nextInt();
		}
		
		// Replace the character 
		String finalMessage = "";
		for(int i = 0; i < msg.length(); i += skip)
		{
	    	// ASCII chart ranges from 0-127 decimal.
		    char replacementChar = (char)randomGenerator.nextInt(128);
			int nextIndex = i+skip-1;
			if(nextIndex <= msg.length())
			{
                finalMessage += msg.substring(i, nextIndex) + replacementChar;
			}
			else
			{
				finalMessage += msg.substring(i);
			}
	    }
		System.out.println(finalMessage);
    }
}
