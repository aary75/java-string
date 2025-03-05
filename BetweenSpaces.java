// Creating a BetweenSpaces class to remove spaces between in string
// importing the scanner class to get user's input
import java.util.Scanner;

public class BetweenSpaces {
      public static void main(String[] args) {
         
         // Creating the scanner class to get user's input
         Scanner scanner = new Scanner(System.in);

         // Getting user's input
         String str = scanner.nextLine();

         // Replace all space with null
         str = str.replace(" ","");
 
        System.out.print(str);

}}

