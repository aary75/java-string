//Create a UniqueCharacter class to find unique characters in string
import java.util.Scanner;

public class UniqueCharacter {
     public static void main(String[] args) {
         Scanner scanner  = new Scanner(System.in); // Scanner to get user's input

         String text = scanner.nextLine();

         int length = length(text); // Call the function to get length of text
          
         int index = 1;
         String newString = "";

         // Finding unique characters in string
         for(int i = 0; i<length; i++) {
                
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
         

         char[] array = new char[newString.length()];
          
         // Printing the array of unique characters
         for(int i = 0;i < array.length; i++){
             array[i] = newString.charAt(i);
             System.out.print(array[i]+ " ");
         }

}




// Calculating the length of text string
public static int length(String text) {
         
        int length = 0;
        
        try {
            while(true){
                  text.charAt(length++);
            }
        }
        catch(Exception e){
            return length - 1;
        }
  }
        
}

// Input: Heliicliscessij
// Output: Helicsj
