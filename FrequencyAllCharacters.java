//Creating the Frequency class to find first non-repeating character
import java.util.Scanner;

public class FrequencyAllCharacters {
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
          System.out.println("Printing the first non-repeating character in string: ");
         for(int i = 0;i<ascii.length;i++){
              if(ascii[i] != 0){
                  System.out.println((char)i + " " + ascii[i]);
         }
}}}


// Input: Enter the string; Hello
// Output: Printing the first non-repeating character in string:
//        H 1
//        e 1
//        l 2
//        o 1

