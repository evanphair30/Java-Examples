public class StringSample
{
    //Simple string and char sample



    public static void main(String[] args)
    {
        String myString = new String("This is my Sample String");
        char ch; //holds one character
        //Separate into characters
        int size = myString.length();

        for (int I=0; I < size; I++)
        {
            ch = myString.charAt(I);
            System.out.println("Character " + I + " is " + ch);
            if ((ch>='A') && (ch <= 'Z'))
            {
                System.out.println(" ** Character is UpperCase  **");
            }
            else
            {
                //NOP
            }

        }
        System.out.println("String in UpperCase " + myString.toUpperCase() );
        System.out.println("String in Original Form " + myString );
    }

}