package Assignment8.Assign8;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      Scanner sc=new Scanner(System.in);
      try {
      
        //reading string and substring from user
        System.out.println( "Enter the string" );
        String str=sc.nextLine();
        String answer="";
        
        //iterate string and check each character is special or not
        //if it is special then we add underscore otherwise add the normal character
        for(int i=0;i<str.length();i++) {
          char c=str.charAt(i);
          if (c == '/' || c == '\\' || c == ':' || c == '*' || c == '?' || c == '"' || c == '<' || c == '>' || c == '|') {
            answer+="_";
          }
          else {
            answer+=c;
          }
        }
        
        //check the string length above 10....if it is we reduce string into 7 and put three dot in last to indicate ellipsis
        if(answer.length()>10) {
          answer=answer.substring(0,7)+"...";
        }
        System.out.println(answer);
      }
      catch(Exception e) {
        System.out.println("Invalid Input"+e.getMessage());
      }
      finally {
        sc.close();
      }
    }
}
