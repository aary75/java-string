//Creating the FreuencyUniqueCharacter class to find the frequency of unique characters
import java.util.Scanner;

public class FreuencyUniqueCharacter {
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
          System.out.println("Printing the unique characters with frequency in string: ");
         for(int i = 0;i<ascii.length;i++){
              if(ascii[i] == 1){
                char ch = (char)i;

                System.out.println(ch + " " + ascii[i]);
                
              }
         }
}}

// Input:  Enter the string; Aaryan
// Output: Printing the unique characters with frequency in string:
//         A 1
//         n 1
//         r 1
//         y 1
