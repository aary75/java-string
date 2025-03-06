// Creating a convertToUppercase class to capitalize the string
import java.util.Scanner;

public class ConvertToUpperCase {
     public static String convertToUppercase(String text) {  // Generate convertToUppercase function to capitalize the text using userbuild method
         
        String newText = "";

        // Converting the characters into uppercase characters using ascii values
        for(int i = 0; i<text.length(); i++) {
             int ascii = (int)text.charAt(i);  // change into integer using typecasting

             newText += (char)(ascii - 32);    // change into characters using typecasting
           }
      
          return newText;  // return capitalize text
        }
  
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Generate scanner class to get input from user

        String text = scanner.nextLine();

        String capitalText = text.toUpperCase();   // Capitalize the string using builtin method
        System.out.println("String Capitalize using toUpperCase method: " + capitalText);

        text = convertToUppercase(text);      // Capitalize the string using user-defined method
        System.out.println("String capitalize using userbuild method: " + text);

        // Checking that both are same or not
        if(capitalText.equals(text)) System.out.print("Both are same");
        else System.out.print("Both are not same");
}}

// 
// Input:  hello
// Output: String Capitalize using toUpperCase method: HELLO
//         String capitalize using userbuild method: HELLO
//         Both are same

        
