package Assignment6.Assign6;

import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {   
      
      
        Scanner sc=new Scanner(System.in);
        try {
          
          //reading string and substring from user
          System.out.println( "Enter the string" );
          String str=sc.next();
          System.out.println( "Enter the sub-string" );
          String subStr=sc.next();
          
          //string function split is used here
          //it will make group according to given subStr and we can find the length of that
          int count=(str.split(subStr,-1).length)-1;
          System.out.println(count);
          
          
        }
        catch(Exception e) {
          System.out.println("Invalid input"+e.getMessage());
        }
        finally {
          sc.close();
        }
    }
}
