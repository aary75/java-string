//Creating the Frequency class to find most frequent character
import java.util.Scanner;

public class FrequentCharacter {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in); // get user's input

          System.out.print("Enter the string; ");

          String text = scanner.nextLine(); // getting string from user

            text = text.toLowerCase(); // lowercase all characters

         int[] ascii = new int[256];  // creating a interarray
          
         // calculating frequency of all characters in text string
          for(int i = 0;i<text.length();i++){
              int asciiValue = (int)text.charAt(i);

              ascii[asciiValue]++;
          }
           

          // Finding first - non repeating character in text string

          int max = Integer.MIN_VALUE;
           int index = 0;

         for(int i = 0;i<ascii.length;i++){
              
              if(ascii[i] > max){
                   //System.out.println((char)i + " " + ascii[i]);
                  max = ascii[i];
                  index = i;
         }
}
          System.out.print("Most Frequent Character: " + (char)index);
}}

// Input: Enter the string; Success
// Output: Most Frequent Character: s
