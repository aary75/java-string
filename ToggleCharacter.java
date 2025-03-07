// Creating a ToggleCharacter class to toggling the string
import java.util.Scanner;

public class ToggleCharacter {
     public static String toggle(String text) {  // Generate toggle function to change the text from uppercase to lowercase and vice-versa using userbuild method

        String newText = "";

        // Converting the characters into toggle characters using ascii values
        for(int i = 0; i<text.length(); i++) {

             char ch = text.charAt(i);
 
             if(ch >= 'A' && ch <= 'Z'){
                int ascii = (int)ch;

                newText += (char)(ascii + 32);  // change into lowercase character using typecasting
             }
             else{
   
             int ascii = (int)ch;  // change into integer using typecasting

             newText += (char)(ascii - 32);    // change into uppercase characters using typecasting
           }}

          return newText;  // return toggles text
        }

    

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Generate scanner class to get input from user

        String text = scanner.nextLine();


        text = toggle(text);      // Lowercase the string using user-defined method
        System.out.println("String toggled userbuild method: " + text);

}}

//
// Input:  HEllO
// Output: String toggled userbuild method: heLLo
//         
