//Create the CompareSting class to compare two string
import java.util.Scanner;

public class CompareString {
   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in); // scanner class to get user's input

      System.out.print("Enter first string: ");
      String string1 = scanner.nextLine();

      System.out.print("Enter second string: ");
      String string2 = scanner.nextLine();

     int result = string1.compareTo(string2); // using compareTo  function to compare both strings

     if(result < 0){
        System.out.print(string1 +" comes before " + string2 +" in lexographical order");
      }
     else{
        System.out.print(string2 + " comes before " + string1 + " in lexographical order");
      }
}}

// Input: Enter first string: apple
//        Enter second string: banana
// Output: apple comes before banana in lexographical order
