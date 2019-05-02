//Evan Phair			
//10/18/2015		
//Encryption 1			
//ROT13

import java.io.IOException;
			
public class ROT13 { 
	public static void main(String[] args) throws IOException {
		// input your data   
		System.out.println("Enter text to be encrypted");
		// this is rotation key	
		int rot=13;
					
			while(true) {
				if(System.in.available() != 0) {
        		int msg = System.in.read();
        		     
        		//Uppercase calculation
        		if((msg >= 'A') && (msg <= 'Z')) {
        		msg += rot;
        		if(msg > 'Z') msg -= 26;
        	    } 
        		// lowercase calculation
        		else if((msg >= 'a') && (msg <= 'z')) {
        	    msg += rot;
        		// starts all over again at the end of alphabet
        		if(msg > 'z') msg -= 26;      		          
        	    // output is shown
        		System.out.print((char)msg);
        		      }
        		    }
        		  }
			}
		}
