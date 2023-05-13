package Assignment18.Assign18;

/*
 
    Write a program to store names in a collection where duplication is not allowed. Copy this data into another collection having a key value pair where the key will be the index of the first collection and the value will be the data at that index of the first collection.
    Perform the following on second collection:
    1)List all key and corresponding values.
    2)List all available Values keys only in sorted order.
    3)Delete a provided value.
    4)Check whether provided value is available.
    5)Check for empty collections.
    NOTE: Try to create a menu based program for the above problem (For point 1 to 5).

 
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
      
        
        HashSet<String> names = new HashSet<>();
        ArrayList<String> keyValuePairs = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        
        //menu driven...>users can choose any options
        while (choice != 6) {
            System.out.println("1. Add name");
            System.out.println("2. List all key-value pairs");
            System.out.println("3. List all available values");
            System.out.println("4. Delete a value");
            System.out.println("5. Check whether a value is available");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            //switch case is used to implement menu driven
            switch (choice) {
              
                
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.next();
                    
                    //check that name already in list or not
                    if (names.contains(name)) {
                        System.out.println("Name already exists in the collection.");
                    } else {
                        names.add(name);
                        keyValuePairs.add(keyValuePairs.size() + ": " + name);
                    }

                    break;

                case 2:
                    //iterate through keyValuePairs and print each keyValue
                    if(keyValuePairs.size()==0) {
                      System.out.println("No keyValuePairs  found");
                      break;
                    }
                    for (String keyValue : keyValuePairs) {
                        System.out.println(keyValue);
                    }

                    break;

                case 3:
                    ArrayList<String> values = new ArrayList<>(names);
                    //here values are sorted in alphabetically thats why values.sort(null)
                    values.sort(null);
                    
                    //iterate through array List and print value
                    for (String value : values) {
                        System.out.println(value);
                    }

                    break;

                case 4:
                    System.out.print("Enter value to delete: ");
                    String valueToDelete = scanner.next();
                    boolean found = false;

                    for (int i = 0; i < keyValuePairs.size(); i++) {
                        String keyValue = keyValuePairs.get(i);
                        
                        //endsWith return a boolean ....>check whether keyValue end with value to delete or not
                        if (keyValue.endsWith(valueToDelete)) {
                          
                            //if it returns true then remove from map and set found as true ,then break the case
                            keyValuePairs.remove(i);
                            found = true;
                            break;
                        }
                    }
                    
                    //If value is true ..remove it from HashSet
                    if (found) {
                        names.remove(valueToDelete);
                        System.out.println("Value deleted successfully.");
                    } else {
                        System.out.println("Value not found.");
                    }

                    break;

                case 5:
                    System.out.print("Enter value to search: ");
                    String valueToSearch = scanner.next();
                    
                    //check the values is present in hash set or not
                    if (names.contains(valueToSearch)) {
                        System.out.println("Value found.");
                    } else {
                        System.out.println("Value not found.");
                    }

                    break;

                case 6:
                    //this case for exit the menu driven
                    break;

                default:
                  //default case is present in every switch..if User press any case that not mentioned above..then this will work
                    System.out.println("Invalid choice.");
            }

            System.out.println();
        }

        
    }

}
