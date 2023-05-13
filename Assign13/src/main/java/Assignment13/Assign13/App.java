package Assignment13.Assign13;

import java.util.Date;
import java.text.SimpleDateFormat;
/**
 Program for print current date in different formats
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
      
        
         //getting current date
         Date currentDateTime=new Date();
         
         //format 1:MM/dd/yyyy HH:mm:ss
         SimpleDateFormat format1=new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
         String formattedDate1 = format1.format(currentDateTime);
         System.out.println("Format 1: " + formattedDate1);

         // format 2: yyyy-MM-dd'T'HH:mm:ssZ       
         SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
         String formattedDate2 = format2.format(currentDateTime);
         System.out.println("Format 2: " + formattedDate2);

         // format 3: hh:mm a
         SimpleDateFormat format3 = new SimpleDateFormat("hh:mm a");
         String formattedDate3 = format3.format(currentDateTime);
         System.out.println("Format 3: " + formattedDate3);

         // format 4: HH:mm:ss
         SimpleDateFormat format4 = new SimpleDateFormat("HH:mm:ss");
         String formattedDate4 = format4.format(currentDateTime);
         System.out.println("Format 4: " + formattedDate4);

         // format 5: MMM dd yyyy
         SimpleDateFormat format5 = new SimpleDateFormat("MMM dd yyyy");
         String formattedDate5 = format5.format(currentDateTime);
         System.out.println("Format 5: " + formattedDate5);
     
         
        
     
    }
}
