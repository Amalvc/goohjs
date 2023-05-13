package Assignment2.Assign2;
import java.util.*;


public class App 
{
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        
        try {
          //reading input from user
          System.out.println("Enter distance in metre");
          int distance=sc.nextInt();
          
          System.out.println("Enter time taken in hour");
          int hour=sc.nextInt();
          
          System.out.println("Enter time taken in minute");
          int minute=sc.nextInt();
          
          System.out.println("Enter time taken in second");
          int second=sc.nextInt();
          
          //converting total time into seconds
          double timeInSecond=hour*3600+minute*60+second;
          
          //check exceptional case
          if(timeInSecond<0||distance<=0) {
            throw new Exception("Invalid input");
          }
          
          //calling method
          SpeedCalculation(distance,timeInSecond);
          
        }
        //catching the exception and resolve it
        catch(Exception e) {
          System.out.println("Invalid input "+e.getMessage());
        }
        
        
    }
    public static void SpeedCalculation(int distance,double timeInSecond) {
        
        //calculating speed in different units
        double speedInMetrePerSecond=distance/timeInSecond;
        double speedInKmPerHour=(distance/1000)/(timeInSecond/3600);
        double speedInMetrePerHour=(distance/1609)/(timeInSecond/3600);
        
        //displaying the calculated speed
        System.out.println("speed In MetrePerSecond "+speedInMetrePerSecond);
        System.out.println("speed In KmPerHour "+speedInKmPerHour);
        System.out.println("speed In MetrePerHour "+speedInMetrePerHour);
    }
}
