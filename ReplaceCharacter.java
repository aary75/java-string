// Creating ReplaceCharacter class to replace a word with another word
import java.util.Scanner;

public class ReplaceCharacter {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in); // scanner class to get user's input

      System.out.print("String: ");
      String str = scanner.nextLine(); // getting string input

      System.out.print("Word to replace: ");
      String targetWord = scanner.nextLine(); // replace word  

     System.out.print("Word after replacing: ");
      String outcomeWord = scanner.nextLine(); // that word which comes after replacement

     String modifiedString = str.replace(targetWord,outcomeWord); // replacing the targetWord with outcomeWord


     System.out.print("Modified String: " + modifiedString); //print the string
 }}

// Input: String: Hello World
//        Word to replace: World
//        Word after replacing: Java
// Output: Modified String: Hello Java
