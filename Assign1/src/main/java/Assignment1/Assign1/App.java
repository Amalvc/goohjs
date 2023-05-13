package Assignment1.Assign1;

import java.util.Scanner;
import java.util.InputMismatchException;


public class App 
{
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        //Taking input from user
        System.out.println("Enter a number between 0 and 1000");
        
        
        
        //Putting code inside try block and any error occurred it will throw the error
        try {
          int n=sc.nextInt();
          
          //checking the input
          if(n<0||n>1000) {
            throw new IllegalArgumentException("Number must be between 0 and 1000");
          }
          int m=0;
          int sum=0;
          
          //logic of program ,extracting each elements and adding them
          while(n!=0) {
            m=n%10;
            sum+=m;
            n=n/10;
          }
          System.out.println(sum);
        }
        
        //This will catch the exception and handle it
        catch(InputMismatchException e) {
          System.out.println("Enter a number not string");
        }
        catch(Exception e) {
          System.out.println("Invalid input");
        }
        
        
        
        
    }
}
