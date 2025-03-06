import java.util.Scanner;
import java.lang.Integer;

public class NumberFormatException {

    // Method that generates a NumberFormatException
    public static void generateNumberFormatException(String text) {

        // Integer.parseInt() is a built-in function in java.lang.Integer class to extract the number from text.
        System.out.print(Integer.parseInt(text)); // This will throw NumberFormatException

    }

    // Method that handles NumberFormatException
    public static void handleNumberFormatException(String text) {

        try {

            System.out.print(Integer.parseInt(text)); // This will throw NumberFormatException

        } catch (Exception e) {

            // Catching the exception
            System.out.println("A NumberFormatException handle");

        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.next();

        System.out.println("Generate NumberFormatException");
  //      generateNumberFormatException(text);  // This will throw the exception

        System.out.println("\nHandle NumberFormatException");
        handleNumberFormatException(text); // This will handle the exception
    }
}

// For generateNumberFormatException function
// Hello
// Generate NumberFormatException
// Exception in thread "main" java.lang.NumberFormatException: For input string: "Hello"
//        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//        at java.base/java.lang.Integer.parseInt(Integer.java:588)
//        at java.base/java.lang.Integer.parseInt(Integer.java:685)
//        at NumberFormatException.generateNumberFormatException(NumberFormatException.java:10)
//        at NumberFormatException.main(NumberFormatException.java:36)

// For handleNumberFormatException function


// For handleNumberFormatException function
// Hello
// Generate NumberFormatException

// Handle NumberFormatException
// A NumberFormatException handle


