//Creating the StringArrayComparison class to compare two string arrays
import java.util.Scanner;
import java.util.Arrays;

public class StringArrayComparison {
     // Create a string array using by user method
     public static char[] createArray(String string,char[] arrayByUserMethod) {

          // Adding string characters into array by user method
          for(int i = 0;i<string.length();i++) {
              arrayByUserMethod[i] = string.charAt(i);
          }

        // Return the array
        return arrayByUserMethod;
     }

     public static void main(String[] args) {
         //Creating the scanner class to get user's input
         Scanner scanner = new Scanner(System.in);

         // Getting the string from user's
         String string = scanner.next();

         // Declare a character array
         char[] arrayByUserMethod = new char[string.length()];

         // Adding the elements in character array using user method
         arrayByUserMethod = createArray(string, arrayByUserMethod);
        
        // Declare an another character array and fill it with toCharArray() method
        char[] arrayByBuildInMethod = string.toCharArray();
        
        // Printing the first Array
        System.out.print("Character array using user-method: "); 
        for(int i =0; i< arrayByUserMethod.length(); i++){
             System.out.print(arrayByUserMethod.charAt(i) + " ");
        } 
 
        //Printing the second Array
        System.out.print("Character array using built-in method: ");
        for(int i = 0; i < arrayByBuildInMethod.length(); i++) {
             System.out.print(arrayByBuildInMethod.charAt(i) + " ");
        }

        //Comparing both the arrays and printing the result
        if(Arrays.equals(arrayByUserMethod,arrayByBuildInMethod)) System.out.print("Both arrays are same");
        else System.out.print("Both arrays are not same");
    }}
