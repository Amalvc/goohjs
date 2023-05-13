package Assignment14.Assign14;

import java.util.*;
import java.text.SimpleDateFormat;


public class App 
{
    public static void main( String[] args )
    {
      
      //creating Calendar 
      Calendar todayCalendar = Calendar.getInstance();
      Date today = todayCalendar.getTime();

      // get the date 10 days before today
      Calendar tenDaysBeforeCalendar = Calendar.getInstance();
      tenDaysBeforeCalendar.setTime(today);
      tenDaysBeforeCalendar.add(Calendar.DAY_OF_MONTH, -10);
      Date tenDaysBefore = tenDaysBeforeCalendar.getTime();
      

      // get the date 10 days after today
      Calendar tenDaysAfterCalendar = Calendar.getInstance();
      tenDaysAfterCalendar.setTime(today);
      tenDaysAfterCalendar.add(Calendar.DAY_OF_MONTH, 10);
      Date tenDaysAfter = tenDaysAfterCalendar.getTime();
      

      // create date formatters
      SimpleDateFormat dateFormatter = new SimpleDateFormat("MM/dd/yyyy");
      SimpleDateFormat dateTimeFormatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
      SimpleDateFormat timeFormatter = new SimpleDateFormat("hh:mm a");
      SimpleDateFormat time24Formatter = new SimpleDateFormat("HH:mm:ss");
      SimpleDateFormat monthFormatter = new SimpleDateFormat("MMM dd yyyy");
      

      // print the dates
      System.out.println("Date 10 days before today: " + dateFormatter.format(tenDaysBefore));
      System.out.println("Today's date: " + dateFormatter.format(today));
      System.out.println("Date 10 days after today: " + dateFormatter.format(tenDaysAfter));
      

      // get the current month
      Calendar currentMonthCalendar = Calendar.getInstance();
      int currentMonth = currentMonthCalendar.get(Calendar.MONTH);
      

      // create a list of the remaining months in the year
      List<String> remainingMonths = new ArrayList<>();
      for (int i = currentMonth; i <= 11; i++) {
          currentMonthCalendar.set(Calendar.MONTH, i);
          remainingMonths.add(monthFormatter.format(currentMonthCalendar.getTime()));
      }
      

      // print the remaining months
      System.out.println("Remaining months in the year: " + remainingMonths);

      // calculate the difference in minutes between the dates
      long minutesBetween = (tenDaysAfter.getTime() - tenDaysBefore.getTime()) / (60 * 1000);

      // print the difference in minutes
      System.out.println("Difference in minutes between dates: " + minutesBetween);
  
      
      
      
    }
}
