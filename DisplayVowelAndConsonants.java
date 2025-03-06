// Creating CountVowelsAndConsonants to count vowels and consonants
import java.util.Scanner;

public class DisplayVowelAndConsonants {
      //Method to convet uppercase letters to lowercase letters and remove all characters which are not alphabet
      public static String lowerCase(String str) {

          String newStr = "";
       
          for(int i=0; i< str.length(); i++) {
              // change from uppercase to lowercase
              if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                    int ascii = (int)str.charAt(i);

                    newStr += (char)(ascii + 32);
               }
              else {
                   newStr += str.charAt(i);
              }

             }
           return newStr;
          
       }

      // Count vowels and consonants
      public static String[][] count(String str) {
         
           String[][] vowelConsonant = new String[str.length()][2];

           for(int i = 0;i<str.length(); i++) {
                 char check = str.charAt(i);
 
                  vowelConsonant[i][0] = String.valueOf(check);

                 // Check vowels or not
                 if(check == 'a' || check == 'e' || check == 'i' || check == 'o' || check == 'u'){
                        vowelConsonant[i][1] = "Vowel";
                 }
                 else if(check >= 'a' && check <= 'z'){
                      vowelConsonant[i][1] = "Consonant";
                 }
                 else vowelConsonant[i][1] = "Not a Letter";
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
          String[][] countVowelConsonant = count(str);

          for(int i = 0;i<str.length(); i++){
             System.out.println(countVowelConsonant[i][0] + "\t\t" + countVowelConsonant[i][1]);
          }

     }}


