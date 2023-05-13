package Assignment7.Assign7;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {    
        Scanner sc=new Scanner(System.in);
        try {
        
         //reading string and substring from user
          System.out.println( "Enter the string" );
          String str=sc.nextLine();
          System.out.println( "Enter the sub-string" );
          String subStr=sc.nextLine();
          
          System.out.println("Enter the starting index which we need to start in string");
          int strNum=sc.nextInt();
          
          System.out.println("Enter the starting index which we need to start in substring");
          int subNum=sc.nextInt();
          
          System.out.println("Enter the length needed to compare");
          int length=sc.nextInt();
          
          
          //calling method
          StringMatch(str,strNum,subStr,subNum,length);
          
          
        }
        catch(Exception e) {
          System.out.println("Invalid Input"+e.getMessage());
        }
        finally {
          sc.close();
        }
    }
    public static void StringMatch(String str,int strNum, String subStr,int subNum,int length) {
      //string function which will compare string and substring..and check there is any matched 
      //if there is any matched then replace all 'd' with 'f' and print the final
      
      if(str.regionMatches(strNum, subStr, subNum, length)) {
        String matched=str.substring(strNum,strNum+length).replace('d', 'f');
        System.out.println(matched);
      }
      else {
        System.out.println("There is no matched string");
      }
    }
}
