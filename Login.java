// Evan Phair
// 10/15/2015
// Loop exercise
// Computer Science 1

import java.util.Scanner;  
  
public class Login {
  
        private static Scanner scan;

		public static void main(String[] args) {  
          
                 String username, password;  
                 scan = new Scanner(System.in);  
                   
                 System.out.println("Enter user name : ");  
                 username = scan.nextLine();  
                 System.out.println("Enter password : ");  
                 password = scan.nextLine();  
                 
                 while((!(username.equals("quit"))) && (!(password.equals("exit"))))  
                  { 
                    if(username.equals("joy") && password.equals("sun"))  
                        System.out.println("You have logged in with priority 4.");  
                      
                    else if(username.equals("gates") && password.equals("monopoly"))  
                        System.out.println("You have logged in with priority 1.");  
                      
                    else if(username.equals("jobs") && password.equals("apple"))  
                        System.out.println("You have logged in with priority 3.");  
                      
                    else if(username.equals("root") && password.equals("secret"))  
                        System.out.println("You have logged in with priority 5.");  
                      
                    else  
                        System.out.println("Login failed.");  
                      
                    System.out.println("Enter user name : ");  
                    username = scan.nextLine();  
                    System.out.println("Enter password : ");  
                    password = scan.nextLine();  
                          
                 }  
                 System.out.println("System shutting down ");
                 System.out.println("Bye.....");  
        }  
  
}  