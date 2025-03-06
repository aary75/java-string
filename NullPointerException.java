
   public class NullPointerException {
    
    // Method that generates a NullPointerException
    public static void generateNullPointerException() {

        String text = null; 

        
        System.out.print(text.length()); // This will throw NullPointerException

    }

    // Method that handles NullPointerException
    public static void handleNullPointerException() {

        try {

            String text = null; 

          
            System.out.print(text.length()); // This will throw NullPointerException

        } catch (Exception e) {

            // Catching the exception 
            System.out.println("A NullPointerException handle");

        }
    }

    public static void main(String[] args) {

        System.out.println("Generate NullPointerException");
//        generateNullPointerException();  // This will throw the exception

        System.out.println("\nHandle NullPointerException");
        handleNullPointerException(); // This will handle the exception
    }
}

