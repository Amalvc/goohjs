package Assignment9.Assign9;

import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {   
      
      
      
      Scanner sc=new Scanner(System.in);
      try {
      
      //reading string and substring from user
        System.out.println( "Enter the string" );
        String str=sc.nextLine();
        
        
        //calling valid function to check whether password is correct or not
        System.out.println(valid(str));
      }
      catch(Exception e) {
        System.out.println("Invalid Input"+e.getMessage());
      }
      finally {
        sc.close();
      }
        
    }
    public static boolean valid(String s) {
      
      
      //check length of password is at least 8
      if(s.length()<=8) {
        return false;
      }
      int LetterCount=0;
      int DigitCount=0;
      int SpecialCharacter=0;
      
      /*
        Iterate through the string and store each character accordingly
        -->if it is digit increase the digit count
        -->if it is letter increase letter count
        -->if it is special increase special character
        -->if it not the above mentioned then return false
        
        
        --> after iteration check the count of each for ...validating the password
        -->at least 2 digit,1 special character
       */
      for(int i=0;i<s.length();i++) {
        char c=s.charAt(i);
        
        if(Character.isLetter(c)) {
          LetterCount++;
        }
        else if(Character.isDigit(c)) {
          DigitCount++;
        }
        else if(c=='!'||c=='@'||c=='#'||c=='&'||c=='?') {
          SpecialCharacter++;
        }
        else {
          return false;
        }
      }
      if(DigitCount>=2 && SpecialCharacter>=1) {
        return true;
      }
      return false;
    }
}
