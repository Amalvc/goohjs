package Assignment16.Assign16;

import java.util.Scanner;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.HashMap;
 
public class App 
{
    public static void main( String[] args )
    {
      Scanner scanner = new Scanner(System.in);
     
      try {
                    
          System.out.println("Enter the string");
          // Accept a collection of numbers from the user
          String input = scanner.nextLine();
          
          
          // Create a list to hold the numbers
          List<Integer> numbers = new ArrayList<>();

          // Parse the input string and add each number to the list
          String[] parts = input.split(" ");
          for (String part : parts) {
              numbers.add(Integer.parseInt(part));
          }
          
          // Print the occurrence of each element
          Map<Integer, Integer> occurrenceMap = new HashMap<Integer, Integer>();
          for (int number : numbers) {
              int occurrence = occurrenceMap.getOrDefault(number, 0);
              occurrenceMap.put(number, occurrence + 1);
          }
          System.out.println("Occurrence of each element:");
          for (int number : occurrenceMap.keySet()) {
              int occurrence = occurrenceMap.get(number);
              System.out.println(number + " occurs " + occurrence + " times");
          }
          
          // Sort the collection in ascending and descending order
          List<Integer> ascendingNumbers = new ArrayList<Integer>(numbers);
          Collections.sort(ascendingNumbers);
          List<Integer> descendingNumbers = new ArrayList<Integer>(numbers);
          Collections.sort(descendingNumbers, Collections.reverseOrder());
          System.out.println("Sorted in ascending order: " + ascendingNumbers);
          System.out.println("Sorted in descending order: " + descendingNumbers);
          
          // Print the input in reverse order
          System.out.print("Input in reverse order: ");
          for (int i = numbers.size() - 1; i >= 0; i--) {
              System.out.print(numbers.get(i) + " ");
          }
          System.out.println();
          
          // Take a number from the user and search the first occurrence in the collection
          System.out.print("Enter a number to search: ");
          int searchNumber = scanner.nextInt();
          scanner.nextLine();
          int index = numbers.indexOf(searchNumber);
          if (index == -1) {
              System.out.println(searchNumber + " not found in the collection");
          } else {
              System.out.println(searchNumber + " found at index " + index);
          }
          
          // Accepts another collection of numbers from the user and appends it to the existing collection. Print the output in sorted order.
          System.out.print("Enter more numbers (separated by spaces): ");
          
     
          
          String input2 = scanner.nextLine();
          
          

          // Parse the input string and add each number to the list
          String[] parts2 = input2.split(" ");
          for (String part : parts2) {
              numbers.add(Integer.parseInt(part));
          }
          
          //sorting using collection
          Collections.sort(numbers);
          System.out.println("Sorted collection after appending more numbers: " + numbers);
          
          
          
          
      }
      catch(Exception e) {
        System.out.println("Invalid Input"+e.getMessage());
      }
      finally {
        scanner.close();
      }
      
      
      
    }
}
