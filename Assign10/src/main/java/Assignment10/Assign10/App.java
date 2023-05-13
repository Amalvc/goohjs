package Assignment10.Assign10;

import java.util.Scanner;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;


public class App 
{
    public static void main( String[] args )
    {
      Scanner sc=new Scanner(System.in);
      try {
      
      //reading string and substring from user
        System.out.println( "Enter the Date and Time in this format> 2023-05-08 15:30:00" );
        String date=sc.nextLine();
        System.out.println( "Enter the time zone in this format> Asia/Kolkata" );
        String timeZone=sc.nextLine();
        
        //calling method and displaying result
        System.out.println(toUTC(date,timeZone));
        
        
        
      }
      catch(Exception e) {
        System.out.println("Invalid Input"+e.getMessage());
      }
      finally {
        sc.close();
      }
    }
    
    public static Calendar toUTC(String date,String timeZone)throws ParseException{
      
      //creating new date format
      DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
      
      //set Time zone in newly created format
      format.setTimeZone(TimeZone.getTimeZone(timeZone));
      
      //Creating new calendar
      Calendar calendar=Calendar.getInstance();
      
      //set time in calendar by converting string into Date
      calendar.setTime(format.parse(date));
      
      //setting time zone in calendar
      calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
      
      return calendar;
    }
    
    public static Calendar toUTC(Calendar calendar,TimeZone timezone) {
      
      //setting time zone in calendar using given time zone
      calendar.setTimeZone(timezone);
      calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
      
      return calendar;
    }
}
