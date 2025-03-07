// Creating the class Palindrome to check the string in palindrome or not
import java.util.Scanner;


public class CheckPalindrome {
      public static void main(String[] args){
          Scanner scanner = new Scanner(System.in); // get input from user

          String text = scanner.nextLine(); // get text string from user

         int start = 0;
         int end = text.length() - 1;

         int count = 0;
         
         String newString = ""; // create new string

         // changing uppercase letters to lowercase letters
         for(int i = 0;i<text.length(); i++){
            if(text.charAt(i) >= 'A' && text.charAt(i) <= 'Z') {
                  int ascii = (int)text.charAt(i);

                  char ch = (char)(ascii + 32);  // changing the ascii value
                 
                 newString += ch;
           }
           else{
               newString += text.charAt(i);
           }
         }

         // iterating the string from starting to ending 
         while(start < end){

            
             if(newString.charAt(start) != newString.charAt(end)){
                  count++;
                  break;
            }
            start++;
            end--;
       }

        if(count == 0){
            System.out.print("This string is palindrome"); 
        }
        else{
            System.out.print("This string is not palindrome");
        }
 }}


// Input: Madam
// Output: This string is palindrome

// Input: Hello
// Output: This string is not palindrome
