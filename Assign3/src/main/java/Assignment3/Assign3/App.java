package Assignment3.Assign3;

import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
      Scanner sc=new Scanner(System.in);
      
      
      
      //Putting code inside try block and any error occurred it will throw the error
      try {
        
        System.out.println("Enter an integer");
        
        //reading input from user
        int number=sc.nextInt();
        
        //condition to check number is integer or not
        if(number<-2147483648||number>2147483647) {
          throw new Exception("Invalid input");
        }
        
        String sum="";
        
         /*
           Extracting last digit
           Adding that digit to string variable
           Perform division operator to reduce number
         */
        while(number!=0) {
          int m=number%10;
          sum=m+" "+sum;
          number=number/10;
        }
        //Displaying sum
        System.out.print(sum);
      }
      catch(Exception e) {
        System.out.println("Invalid input: "+e.getMessage());
      }
      finally {
        sc.close();
      }
    }
}
