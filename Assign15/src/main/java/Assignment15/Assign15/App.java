package Assignment15.Assign15;


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
        System.out.println("Enter numbers separated by space:");
        String input = scanner.nextLine();
        
        
        // Create a list to hold the numbers
        List<Integer> numbers = new ArrayList<>();

        // Parse the input string and add each number to the list
        String[] parts = input.split(" ");
        for (String part : parts) {
            numbers.add(Integer.parseInt(part));
        }

        // Create a map to count the occurrences of each number
        Map<Integer, Integer> occurrences = new HashMap<>();
        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            if (occurrences.containsKey(number)) {
                occurrences.put(number, occurrences.get(number) + 1);
            } else {
                occurrences.put(number, 1);
            }
        }

        // Print the occurrences of each number
        System.out.println("Occurrences:");
        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Sort the list in ascending order
        Collections.sort(numbers);
        System.out.println("Ascending order: " + numbers);

        // Sort the list in descending order
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Descending order: " + numbers);
      }
      
      catch(Exception e) {
        System.out.println("Invalid Input"+e.getMessage());
      }
      finally {
        scanner.close();
      }

      
      
      
      
      
    }
    
}
