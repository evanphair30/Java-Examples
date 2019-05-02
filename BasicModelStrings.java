

public class BasicModelStrings 
{
    //shows string and character use
   
    public BasicModelStrings ( )
    {
    }
    
//Everything is done in method
 //
    public static void main(String[] args) {
        String StrClearText = "ABCDEFGHIJKLMNO.QRSTUVWXYZ";
 
        int length = StrClearText.length();
        System.out.println("Size of String " + length);
        //grab a char at some point in the string
        char ch = StrClearText.charAt(0);//0 is the first character
        System.out.println(ch + " = "+ ((int)ch));//prints character and unicode value
        
        //sets string to lower case
        String lowercase = StrClearText.toLowerCase();
        System.out.println("All lower case " + lowercase);
        
        //now put in all uppercase
        String UpperCase = StrClearText.toUpperCase();
        System.out.println("All Upper case " + UpperCase);
        
        //for loop to grab one letter at a time and say whether it is a letter or not
        for (int I=0;I<length;I++)
        {
             ch = StrClearText.charAt(I);//grab char at a time
             if ((ch>='A')&&(ch <= 'Z'))
             {
                  System.out.println("Letter from A to Z - "+ ch);
             }
             else
             {
                 System.out.println("NOT a Letter from A to Z - "+ ch);
             }
        }
        }
    }// main
    
