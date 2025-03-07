// Creating RemoveCharacter class to remove specific character
import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in); // scanner class to get user's input

      System.out.print("String: ");
      String str = scanner.nextLine(); // getting string input

      System.out.print("Character to remove: ");
      char ch = scanner.nextLine().charAt(0); // getting special character 

     String modifiedString = str.replace(String.valueOf(ch),""); // replacing the special character with none


     System.out.print("Modified String: " + modifiedString); //print the string
 }}

// Input: String: Hello World
//        Character to remove: l
// Output: Modified String: Heo Word
