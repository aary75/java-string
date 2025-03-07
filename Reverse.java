//Creating a class CountvowelConsonant to count vowels and consonants
import java.util.Scanner;

public class Reverse { 
      public static void main(String[] args){
          Scanner scanner = new Scanner(System.in); // scanner class to get user's input
          
          System.out.print("Enter the string: ");
          String text = scanner.next();

          String reverseText = ""; // string to store  the reverse string

          // reversing the string
          for(int i = text.length() - 1; i >= 0; i--){
             reverseText += text.charAt(i);
          }
 
      // Printing the reverse string
      System.out.println("Reversed string: " + reverseText);
    
 }
}

// Input: Enter the string: Hello
// Output: Reversed string: olleH

