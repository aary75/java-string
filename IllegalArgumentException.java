import java.util.Scanner;

public class IllegalArgumentException {

    // Method that generates a IllegalArgumentException
    public static void generateIllegalArgumentException(String text) {

        System.out.print(text.substring(text.length(),1)); // This will throw IllegalArgumentException

    }

    // Method that handles IllegalArgumentException
    public static void handleIllegalArgumentException(String text) {

        try {

            System.out.print(text.substring(text.length(),1)); // This will throw IllegalArgumentException

        } catch (Exception e) {

            // Catching the exception
            System.out.println("A IllegalArgumentException handle");

        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.next();

        System.out.println("Generate IllegalArgumentException");
//        generateIllegalArgumentException(text);  // This will throw the exception

        System.out.println("\nHandle IllegalArgumentException");
        handleIllegalArgumentException(text); // This will handle the exception
    }
}


// For generateIllegalArgument function
// Hello
// Generate IllegalArgumentException
// Exception in thread "main" java.lang.StringIndexOutOfBoundsException: Range [5, 1) out of bounds for length 5
//        at java.base/jdk.internal.util.Preconditions$1.apply(Preconditions.java:55)
  //      at java.base/jdk.internal.util.Preconditions$1.apply(Preconditions.java:52)
  //      at java.base/jdk.internal.util.Preconditions$4.apply(Preconditions.java:213)
  //      at java.base/jdk.internal.util.Preconditions$4.apply(Preconditions.java:210)
  //      at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:98)
  //      at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckFromToIndex(Preconditions.java:112)
  //      at java.base/jdk.internal.util.Preconditions.checkFromToIndex(Preconditions.java:349)
  //     at java.base/java.lang.String.checkBoundsBeginEnd(String.java:4963)
  //      at java.base/java.lang.String.substring(String.java:2925)
  //      at IllegalArgumentException.generateIllegalArgumentException(IllegalArgumentException.java:8)
  //      at IllegalArgumentException.main(IllegalArgumentException.java:34)


// For handleIllegalArgumentException function
// Hello
// Generate IllegalArgumentException

// Handle IllegalArgumentException
// A IllegalArgumentException handle

