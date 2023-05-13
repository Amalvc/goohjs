package Assignment12.Assign12;

import java.util.*;
import java.text.SimpleDateFormat;


public class App 
{
    public static void main( String[] args )
    {
        
        
        try {
                     
          TimeZone nyTimeZone = TimeZone.getTimeZone("America/New_York");
          
          // get current date and time in New York
          Calendar nyCalendar = Calendar.getInstance(nyTimeZone);
          Date nyDateTime = nyCalendar.getTime();
          
          // print day (in 3-letter format and full name)
          SimpleDateFormat dayShortNameFormatter = new SimpleDateFormat("EEE");
          String dayShortName = dayShortNameFormatter.format(nyDateTime);
          
          SimpleDateFormat dayFullNameFormatter = new SimpleDateFormat("EEEE");
          String dayFullName = dayFullNameFormatter.format(nyDateTime);
          
          System.out.println("Day (short name): " + dayShortName);
          System.out.println("Day (full name): " + dayFullName);
          
          // print date
          SimpleDateFormat dateFormatter = new SimpleDateFormat("dd");
          String date = dateFormatter.format(nyDateTime);
          System.out.println("Date: " + date);
          
          // print month (in 3-letter format and full name)
          SimpleDateFormat monthShortNameFormatter = new SimpleDateFormat("MMM");
          String monthShortName = monthShortNameFormatter.format(nyDateTime);
          
          SimpleDateFormat monthFullNameFormatter = new SimpleDateFormat("MMMM");
          String monthFullName = monthFullNameFormatter.format(nyDateTime);
          
          System.out.println("Month (short name): " + monthShortName);
          System.out.println("Month (full name): " + monthFullName);
          
          // print year
          SimpleDateFormat yearFormatter = new SimpleDateFormat("yyyy");
          String year = yearFormatter.format(nyDateTime);
          System.out.println("Year: " + year);
          
          // print epoch time
          long epochTime = nyDateTime.getTime() / 1000L;
          System.out.println("Epoch time: " + epochTime);
          
        }
        catch(Exception e) {
          System.out.println("Invalid Input"+e.getMessage());
        }
        
    }
}
