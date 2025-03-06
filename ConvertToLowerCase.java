// Creating a convertToLowercase class to capitalize the string
import java.util.Scanner;

public class ConvertToLowerCase {
     public static String convertToLowercase(String text) {  // Generate convertToLowercase function to change the text from uppercase to lowercase using userbuild method

        String newText = "";

        // Converting the characters into lowercase characters using ascii values
        for(int i = 0; i<text.length(); i++) {
             int ascii = (int)text.charAt(i);  // change into integer using typecasting

             newText += (char)(ascii + 32);    // change into characters using typecasting
           }

          return newText;  // return lowercase text
        }

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Generate scanner class to get input from user

        String text = scanner.nextLine();

        String lowerCaseText = text.toLowerCase();   // Lowercase the string using builtin method
        System.out.println("String change into lowercase using toLowerCase method: " + lowerCaseText);

        text = convertToLowercase(text);      // Lowercase the string using user-defined method
        System.out.println("String change into lowercase using userbuild method: " + text);

        // Checking that both are same or not
        if(lowerCaseText.equals(text)) System.out.print("Both are same");
        else System.out.print("Both are not same");
}}

//
// Input:  HELLO
// Output: String change into lowercase using toLowerCase method: hello
//         String change into lowercase using userbuild method: hello
//         Both are same


