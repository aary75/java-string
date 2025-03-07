//Creating the Frequency class to find first non-repeating character
import java.util.Scanner;

public class Frequency {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in); // get user's input

          System.out.print("Enter the string; ");

          String text = scanner.nextLine(); // getting string from user

         int[] ascii = new int[256];  // creating a interarray
          
         // calculating frequency of all characters in text string
          for(int i = 0;i<text.length();i++){
              int asciiValue = (int)text.charAt(i);

              ascii[asciiValue]++;
          }
           

          // Finding first - non repeating character in text string
          System.out.print("Printing the first non-repeating character in string: ");
         for(int i = 0;i<ascii.length;i++){
              if(ascii[i] == 1){
                char ch = (char)i;

                System.out.print(ch);
                break;
              }
         }
}}

// Input: AAArecer
// Output: c

