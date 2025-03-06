//Create trimming class to trim the spaces
import java.util.Scanner;

public class Trimming{
      public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // get user's input

        System.out.print("Enter the string: ");
        String str = scanner.nextLine();

        // getting the trimmed array of give string
        int[] trimArray = trimSpaces(str);

        // Adding the trimmed string into new string
        String trimmed = str.substring(trimArray[0],trimArray[1]+1);

        String trimmedBuiltIn = str.trim();  // trim the string using built in method
    
        // Printing the result  
        if(trimmed.equals(trimmedBuiltIn)) System.out.print("Both are same");
        else System.out.print("Both are not same");

}

// call the function trimSpaces 
public static int[] trimSpaces(String str) {
        
        int[] endPoints = new int[2];

        // starting and ending parameters
        int start = 0;
        int end = str.length() - 1;

        // find character from end
        while(end < 0 && str.charAt(end) == ' ') end--;
       
        // find character from starting
        while(start < str.length() && str.charAt(start) == ' ') start++;
     
        endPoints[0] = start;
        endPoints[1] = end;

       // return the starting and ending points of trimmed string
       return endPoints;

}
}


// Input:        Hello    Hai
// Output:   Both are same
