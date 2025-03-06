//Creating the SplitMethod class to split the string using user-defined and built-in method by spaces
import java.util.Scanner;
import java.util.Arrays;

public class SplitMethod {
      //count the number of letters and words in string
      public static int[] findLength(String str) {
    
        int letterlength = 0; // to count letters
        int wordindex = 0;   // to count words

        int[] length = new int[2];

        try {
           // try to get all letters and words
             while(true) {
               if(str.charAt(letterlength) == ' ') wordindex++;
               str.charAt(letterlength++);
             }
        }
        catch (Exception e){
           // catch the exception

           length[0] = wordindex+1;
           length[1] = letterlength;
           return length; // return the number of letters and words in string
        }
      }
      
      // to split the array by user-defined method by spaces
      public static String[] splitByUser(String str, String[] splitUserDefined,int length) {

          int index = 0;
           String sub = "";

           // Spliting the string
           for(int i=0;i<length;i++){

               if(str.charAt(i) == ' '){
                   splitUserDefined[index++] = sub;
                   sub = "";
               }
               else{
                  sub += str.charAt(i);
               }
          }
           
          splitUserDefined[index++] = sub;
        return splitUserDefined; // return the splited array in form of array
   
      }
         
      public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);

         // Getting user's input
         String str = scanner.nextLine();

         int[] length = findLength(str);
  
      
         String[] splitUserDefined = new String[length[0]];

         splitUserDefined = splitByUser(str,splitUserDefined,length[1]); // Call the function to split
 
         String[] splitByBuilt = str.split("\\s+");   // Spliting by built-in method
          
         // Printing the splitted array by user-defined method
         System.out.println("Split by user-defined method: ");
         for(int i = 0;i < splitUserDefined.length;i++) {
             System.out.println(splitUserDefined[i]);
         }
          
         System.out.println();

         // Printing the splitted array by built-in method
         System.out.println("Split by built-in method: ");
         for(int i = 0;i < splitByBuilt.length; i++) {
             System.out.println(splitByBuilt[i]);
         }
 
         System.out.println();

         // Comparing the both splitted arrays
         if(Arrays.equals(splitUserDefined,splitByBuilt)) System.out.print("Both are same");
         else System.out.print("Both are not same");
}}
  

// Input: Hello My Name is Aaryan
// Output: Split by user-defined method:
//        Hello
//        My 
//        Name
//        is
//        Aaryan
//
//        Split by built-in method:
//        Hello
//        My
//        Name
//        is
//        Aaryan
//
//        Both are same
