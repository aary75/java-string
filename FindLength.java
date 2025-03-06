//Creating the FindLength class to find length using user-defined method and built-in methods
import java.util.Scanner;

public class FindLength {
     // Initialize the length function to find length using user-defined function
     public static int length(String str) {

        int length = 0;

        try {        
               
           while(true){  //Infinite loop to access characters
           
              str.charAt(length++);  // try to access every character
             }
        }

        catch(Exception e) {
               // cacth the exception when index exceeds string length
               return length - 1;  // return the length of string
 
          }

     }

     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         // Take input from user
         String str = scanner.nextLine();

         // Call the user-defined method
         int lengthString = length(str);
 
         // Call the built-in method
         int lengthByMethod = str.length();

         // Print the user-defined length
         System.out.println("Length by user-defined method is " + lengthString);
         
         // Print the built-in method length
         System.out.println("Length by built-in method is " + lengthByMethod);

         // Compare both length
         if( lengthString == lengthByMethod) System.out.print("Both are same");
         else System.out.print("Both are not same");

}}

// Input: Hello
// Output: Length by user-defined method is 5
//         Length by built-in method is 5
//         Both are same
