package Assignment5.Assign5;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        
        //Enter the limit of numbers
        System.out.println("Enter the total number of array elements");
        
        try {
          int number=sc.nextInt();
          //initialize array
          int a[]=new int[number];
          
          //reading array elements from user
          System.out.println("Enter the array elemnts");
          for(int i=0;i<number;i++) {
            a[i]=sc.nextInt();
          }
          //calling methods and displaying
          System.out.println("second largest number is"+largest(number,a));
          System.out.println("second smallest number is "+smallest(number,a));
          
        }
        catch(Exception e) {
          System.out.println("Invalid input"+e.getMessage());
        }
        finally {
          sc.close();
        }
        
    }
    
    //function for finding second largest number
    public static int largest(int n,int a[]) {
      int large=Integer.MIN_VALUE;
      int second=Integer.MIN_VALUE;
      int i=0;
      
      /*
      check current element is larger
           then..>store second largest to second,current to large
      
      check current is larger than second and current element is not equal to large
           then..>store current value to second largest
      
     */
      while(i!=n) {
        if(a[i]>large) {
          second=large;
          large=a[i];
        }
        else if(a[i]>second && a[i]!=large) {
          second=a[i];
        }
        i++;
      }
      return second;
      
    }
    
    //function for finding second smallest number
    public static int smallest(int n,int a[]) {
      int small=Integer.MAX_VALUE;
      int second=Integer.MAX_VALUE;
      int i=0;
      
      /*
        check current element is smaller
             then..>store second smallest to second,smallest to small
        
        check current is smaller than second and current element is not equal to smallest
             then..>store current value to second smallest
        
       */
      while(i!=n) {
        if(a[i]<small) {
          second=small;
          small=a[i];
        }
        else if(a[i]<second && a[i]!=small) {
          second=a[i];
        }
        i++;
      }
      return second;
    }
}
