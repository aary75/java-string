import java.util.Scanner;
   
public class StringIndexOutOfBoundException {

    // Method that generates a StringIndexOutOfBoundException
    public static void generateStringIndexOutOfBoundException(String text) {

        System.out.print(text.charAt(text.length())); // This will throw StringIndexOutOfBoundException

    }

    // Method that handles StringIndexOutOfBoundException
    public static void handleStringIndexOutOfBoundException(String text) {

        try {

            System.out.print(text.charAt(text.length())); // This will throw StringOutOfBoundException

        } catch (Exception e) {

            // Catching the exception
            System.out.println("A StringIndxOutOfBoundException handle");

        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.next();

        System.out.println("Generate StringIndexOutOfBoundException");
//        generateStringIndexOutOfBoundException(text);  // This will throw the exception

        System.out.println("\nHandle StringIndexOutOfBoundException");
        handleStringIndexOutOfBoundException(text); // This will handle the exception
    }
}


//For generateStringIndexOutOfBoundException function
//Input: Hello
//Output: Generate StringIndexOutOfBoundException
//Exception in thread "main" java.lang.StringIndexOutOfBoundsException: Index 5 out of bounds for length 5
  //      at java.base/jdk.internal.util.Preconditions$1.apply(Preconditions.java:55)
  //      at java.base/jdk.internal.util.Preconditions$1.apply(Preconditions.java:52)
  //      at java.base/jdk.internal.util.Preconditions$4.apply(Preconditions.java:213)
  //      at java.base/jdk.internal.util.Preconditions$4.apply(Preconditions.java:210)
  //      at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:98)
  //      at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
  //      at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
     //   at java.base/java.lang.String.checkIndex(String.java:4930)
   //     at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:46)
       // at java.base/java.lang.String.charAt(String.java:1629)
      //  at StringIndexOutOfBoundException.generateStringIndexOutOfBoundException(StringIndexOutOfBoundException.java:8)
      //  at StringIndexOutOfBoundException.main(StringIndexOutOfBoundException.java:34)



//FOr HandleStringIndexOutOfBoundException function

//Input: Hello
//Output: Generate StringIndexOutOfBoundException

//Handle StringIndexOutOfBoundException
//A StringIndxOutOfBoundException handle

