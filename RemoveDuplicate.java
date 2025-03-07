//Create a UniqueCharacter class to find unique characters in string
import java.util.Scanner;

public class RemoveDuplicate {
     public static void main(String[] args) {
         Scanner scanner  = new Scanner(System.in); // Scanner to get user's input

         System.out.print("Enter the string: ");
         String text = scanner.nextLine();
          
         int index = 1;
         String newString = "";

         // remove duplicate character from text
         for(int i = 0; i<text.length(); i++) {
                
               int count = 0;

            for(int j = 0; j<index;j++){
               
               // Matching the characters are already present or not
               if(newString.length() == 0){
                    newString += text.charAt(i);
                    count++;
               }

               else if(text.charAt(i) == newString.charAt(j) ) count++;

              
            }
          if(count == 0){ newString += text.charAt(i); index++;}

         }
         
         System.out.print("String after removing of duplicates: ");
         System.out.print(newString);

}}

// Input: Hello
// Output: Helo
