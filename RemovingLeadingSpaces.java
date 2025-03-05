// Creating the class RemovingLeadingSpaces to delete the starting spaces of string
// Importing the scanner class to get input from user
import java.util.Scanner;

public class RemovingLeadingSpaces {
      public static void main(String[] args) {
           // Creating the scanner class to get user's class
           Scanner scanner = new Scanner(System.in);

           // When we use .next() functions then it takes input upto first space break between two words
           // when we use .nextLine() functions then it takes complete string with all space breaks
           String str = scanner.nextLine();

           // Printing the string with using trim() functions
           // trim() functions is used to delete the starting and trailing functions
           System.out.print(str.trim());

           scanner.close();
}}
