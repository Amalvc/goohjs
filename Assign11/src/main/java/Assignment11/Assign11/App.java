package Assignment11.Assign11;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class App 
{
    public static void main( String[] args )
    {
      Scanner sc=new Scanner(System.in);
      
      try {
      
        //reading date and time from user
        System.out.println( "Enter the Date" );
        String date=sc.nextLine();
        System.out.println( "Enter the time" );
        String time=sc.nextLine();
        
        
        
        //reading time separately from user
        System.out.println( "Enter the Hour in integer" );
        int hour=sc.nextInt();
        System.out.println( "Enter the Minutes in Integer" );
        int minutes=sc.nextInt();
        System.out.println( "Enter the seconds in Integer" );
        int seconds=sc.nextInt();
        
        
        
        //calling and printing both functions
        System.out.println("Date Time using string"+ merge(date,time));
        System.out.println("Date Time using Date Time value"+merge(date,hour,minutes,seconds));
        
        
      }
      catch(Exception e) {
        System.out.println("Invalid input"+e.getMessage());
      }
      finally {
        sc.close();
      }
      
      
    }
    
    
    
    public static LocalDateTime merge(String date,String time) {
      
      //creating new date formatter
      DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
      
      //appending date and time together
      String dateTimeStr=date+" "+time+":00";
      
      //convert into local time
      LocalDateTime localDateTime=LocalDateTime.parse(dateTimeStr,formatter);
      
      return localDateTime;
    }
    
    
    
    public static LocalDateTime merge(String date,int hour,int minute,int second) {
      
      //creating new date formatter
      DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
      
      //formatting time into string
      String timeStr = String.format("%02d:%02d:%02d", hour, minute, second);
      
      //appending above string with date
      String dateTimeStr = date + " " + timeStr;
      
      //converting to local date time
      LocalDateTime dateTime = LocalDateTime.parse(dateTimeStr, formatter);
      return dateTime;
      
      
    }
}
