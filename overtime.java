import java.util.Scanner;
public class overtime 
{
	private static Scanner inputNumScanner;
	
	public static void main(String[] args)
	{
		int ihours;
		int iovertime = 0;
		
		
		inputNumScanner = new Scanner(System.in);
	      
		System.out.println("Enter hours: ");
	    ihours = inputNumScanner.nextInt();

        if (ihours > 40) {
        	 iovertime = ihours - 40;	
        } 
       
        	System.out.println("The user has worked over 40 hours is "+ iovertime);
        	
       
        
    }
}