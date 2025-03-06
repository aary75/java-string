//Creating the comparison class to compare two strings
import java.util.Scanner;

public class Compare {
     public static boolean comparison(String firstString, String secondString) {

          // checking the length of both strings are same or not
          if(firstString.length() != secondString.length()) {
                return false;
            }
          else {
             // Compare by charAt method
             for(int i = 0;i<firstString.length();i++) {
                if(firstString.charAt(i) != secondString.charAt(i)) return false;
             }
          }

        return true;
     }

     public static void main(String[] args) {
         //Create a scanner class to compare two strings
         Scanner scanner = new Scanner(System.in);

         // Getting both strings from user
 
         System.out.print("Enter first String: ");
         String firstString = scanner.nextLine();
 
         System.out.print("Enter second String: ");
         String secondString = scanner.nextLine();

         // Getting the answers by both charAt and equasl method
         boolean firstAnswer = comparison(firstString,secondString);
         boolean byEqualsMethod = firstString.equals(secondString);


         // Printing the answers
         if(firstAnswer && byEqualsMethod) System.out.print("Results are same");
         else System.out.print("Results are not same");
    }}
