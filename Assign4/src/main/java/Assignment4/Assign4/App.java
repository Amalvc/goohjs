package Assignment4.Assign4;

import java.util.Scanner;

/*
 
 * 
 * *
 * * *
 * * * *  pattern
 
 */
public class App 
{
    public static void main( String[] args )
    {
        
        Scanner scanner=new Scanner(System.in);
        
        try {
          System.out.println("Enter the limit");
          int limit=scanner.nextInt();
          
          System.out.println("Select method");
          System.out.println("1.Using loops");
          System.out.println("2.Using Recursion");
          int choice=scanner.nextInt();
          
          //user can select method
          if(choice==1) {
            pattern1(limit);
          }
          else if(choice==2) {
            pattern2(limit);
          }
          else {
            System.out.println("Invalid Choice");
          }
                           
        }
        catch(Exception e) {
          System.out.println("Invalid input");
        }
        finally {
          scanner.close();
        }
            
    }
    
    //Method for printing pattern using single loop
    public static void pattern1(int limit) {
      
      String pattern="";
      
      /*
         Iterate for loop limit times
         each time appending * to string variable called pattern 
         After that,display the string variable
       */
      for(int i=0;i<limit;i++) {
        pattern="*"+" "+pattern;
        System.out.println(pattern);
      }
    }
    
    //Method for printing pattern using recursion
    public static void pattern2(int limit) {
      
      //edge case for recursion..when the time limit became zero it will return
      if(limit==0) {
        return;
      }
      
      //recursion call
      pattern2(limit-1);
      
      //printing patterns
      for(int i=0;i<limit;i++) {
        System.out.print("* ");
      }
      System.out.println();
    }
}
