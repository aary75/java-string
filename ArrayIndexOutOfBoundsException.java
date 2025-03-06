import java.util.Scanner;
import java.lang.Integer;

public class ArrayIndexOutOfBoundsException {

    // Method that generates a ArrayIndexOutOfBoundsException
    public static void generateArrayIndexOutOfBoundsException(String[] names) {

        System.out.print(names[names.length]); // This will throw ArrayIndexOutOfBoundsException

    }

    // Method that handles ArrayIndexOutOfBoundsException
    public static void handleArrayIndexOutOfBoundsException(String[] names) {

        try {

            System.out.print(names[names.length]); // This will throw ArrayIndexOutOfBoundsException

        } catch (Exception e) {

            // Catching the exception
            System.out.println("A ArrayIndexOutOfBoundsException handle");

        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();  // getting the size of array

        String[] names = new String[size]; // creating the string array with name names 

        for(int i = 0; i< size; i++) {
             names[i] = scanner.next();
         }

        System.out.println("Generate ArrayIndexOutOfBoundsException");
//        generateArrayIndexOutOfBoundsException(names);  // This will throw the exception

        System.out.println("\nHandle ArrayIndexOutOfBoundsException");
        handleArrayIndexOutOfBoundsException(names); // This will handle the exception
    }
}


// For generateArrayIndexOutOfBoundsException function
// 5
// Aaryan
// Gayant
// Gukesh
// Hitesh
// Yash
// Generate ArrayIndexOutOfBoundsException
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
//        at ArrayIndexOutOfBoundsException.generateArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException.java:9)
//        at ArrayIndexOutOfBoundsException.main(ArrayIndexOutOfBoundsException.java:41)

//For handleArrayIndexOutOfBoundsException function
// 5
// Aaryan
// Gayant
// Gukesh
// Hitesh
// Yash
// Generate ArrayIndexOutOfBoundsException

// Handle ArrayIndexOutOfBoundsException

