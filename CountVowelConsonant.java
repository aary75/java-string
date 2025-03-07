//Creating a class CountvowelConsonant to count vowels and consonants
import java.util.Scanner;

public class CountVowelConsonant { 
      public static void main(String[] args){
          Scanner scanner = new Scanner(System.in); // scanner class to get user's input

          String text = scanner.next();

         int[] letters = new int[2]; // array to store vowels and consonants

          letters = count(text); // call the function to count vowels and consonants
 
      // Printing the vowels and consonants
      System.out.println("Vowels: " + letters[0]);
      System.out.print("Consonants: "+ letters[1]);
 }

// Function to count vowels and consonants
public static int[] count(String text){
      int vowel = 0;
      int consonants = 0;

      int[] letters = new int[2];

      for(int i = 0;i<text.length();i++){
         char ch = text.charAt(i);

          // check the letter is consonant or vowel
          if(ch != 'a' && ch != 'e' && ch != 'o' && ch != 'i' && ch != 'u') consonants++;
          else vowel++;
      }

       letters[0] = vowel;
       letters[1] = consonants;

 return letters;
}}

// Input: Hello
// Output: Vowels: 2
//        Consonants: 3

