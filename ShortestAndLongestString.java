//Creating the SplitMethod class to find the shortest and longest in string
import java.util.Scanner;
import java.util.Arrays;

public class ShortestAndLongestString {
      //count the number of letters and words in string
      public static int[] numberOfWords(String str) {
  ;  
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
  
    
      // to split the array by spaces without using split() method
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

          // If there is a word left at the end of the text (without trailing space)
           
          splitUserDefined[index++] = sub;
        return splitUserDefined; // return the splited array in form of array
   
      }


      // Method to find length of word without using length() method
      public static int findWordLength(String word) {

         int length = 0;

         try {

           while(true) {
               word.charAt(length++);
            }
         }
         catch(Exception e){
            return length - 1;
        }

      }


      // Method to add words with their length in 2D array
      public static String[][] countWordLength( String[] splitUserDefined ) {

         String[][] wordLengthArray = new String[splitUserDefined.length][2];

         for(int i = 0; i< splitUserDefined.length; i++) {
            wordLengthArray[i][0] = splitUserDefined[i]; // word
            wordLengthArray[i][1] = String.valueOf(findWordLength(splitUserDefined[i])); //Length as String
         }

       return wordLengthArray;
      }

             
      public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);

         // Getting user's input
         String str = scanner.nextLine();

         int[] length = numberOfWords(str);
  
      
         String[] splitUserDefined = new String[length[0]];

         splitUserDefined = splitByUser(str,splitUserDefined,length[1]); // Call the function to split
 
         
         String[][] wordLengthArray = new String[length[0]][length[0]]; 

         wordLengthArray = countWordLength(splitUserDefined);

        // Creating variable of maximum and minimum integer value
        int maxIndex = Integer.MIN_VALUE;
        int minIndex = Integer.MAX_VALUE;

        
        int max = 0;
        int min = 0;;

        // Finding longest and shortest string
        for(int i = 0; i < length[0]; i++) {
             int len = Integer.parseInt(wordLengthArray[i][1]);

             if(len > maxIndex){
                 maxIndex = len;
                 max = i;
             }

             if(len < minIndex){
                 minIndex = len;
                 min = i;
             }
       }

       // Getting the shortest and longest string
       String[] measure = new String[2];
       measure[0] = wordLengthArray[max][0];
       measure[1] = wordLengthArray[min][0];

       // Printing the shortest and longest string
       System.out.println("Longest" + "\t\t" + "Shortest");
       System.out.print(measure[0] + "\t\t" + measure[1]);
       
}}
  

// Input:  My Name is Aaryan
// Output: Longest         Shortest
//         Aaryan          My
