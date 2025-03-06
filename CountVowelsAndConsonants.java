// Creating CountVowelsAndConsonants to count vowels and consonants
import java.util.Scanner;

public class CountVowelsAndConsonants {
      //Method to convet uppercase letters to lowercase letters and remove all characters which are not alphabet
      public static String lowerCase(String str) {

          String newStr = "";
       
          for(int i=0; i< str.length(); i++) {
              // change from uppercase to lowercase
              if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                    int ascii = (int)str.charAt(i);

                    newStr += (char)(ascii + 32);
               }
              else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                   newStr += str.charAt(i);
              }

             }
           return newStr;
          
       }

      // Count vowels and consonants
      public static int[] count(String str) {
         
           int[] vowelConsonant = new int[2];

           for(int i = 0;i<str.length(); i++) {
                 char check = str.charAt(i);

                 // Check vowels or not
                 if(check == 'a' || check == 'e' || check == 'i' || check == 'o' || check == 'u') vowelConsonant[0]++;
                 else vowelConsonant[1]++; //check consonants or not
           }
        

         return vowelConsonant;
 
      }

      public static void main(String[] args){
          // Create scanner class to get user's input
          Scanner scanner = new Scanner(System.in);

          String str = scanner.nextLine();

          // call method for lowercase
          str = lowerCase(str);
          
          // call method to count vowels and consonants
          int[] countVowelConsonant = count(str);

          System.out.println("Number of vowels: " + countVowelConsonant[0]);
          System.out.println("Number of consonant: " + countVowelConsonant[1]);

     }}


// Input:  Hello Java
// Output: Number of vowels: 4
//         Number of consonant: 5
