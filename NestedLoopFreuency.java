//Creating the Frequency class to find the frequency of all characters
import java.util.Scanner;

public class NestedLoopFreuency {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in); // get user's input

          System.out.print("Enter the string; ");

          String text = scanner.nextLine(); // getting string from user

          char[] characters = text.toCharArray();

          String checked = "";
 
          for(int i = 0; i<text.length(); i++){
                 int count = 1;

                // calculating the frequeny of characters
               if(checked.contains(String.valueOf(text.charAt(i)))) continue;
               else { 
                      for(int j = i+1; j < text.length(); j++) {
                          if(text.charAt(j) == text.charAt(i)) count++;
                  }
                 checked += text.charAt(i);
              }
              
               // Printint the characters with their frequencies
              System.out.println(text.charAt(i) + " " + count);
          }
}}


// Input: Enter the string; Hello
// Output: Printing the frequency of characteres in string:
//        H 1
//        e 1
//        l 2
//        o 1
