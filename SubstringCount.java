import java.util.Scanner;

public class SubstringCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        String substring = scanner.nextLine();

        int count = 0;
        int index = 0;

        // Loop to find all occurrences of the substring
        while ((index = str.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length();  // Move the index forward to continue searching
        }

        System.out.println("The substring '" + substring + "' appears " + count + " times.");
    }
}


// Input: This is Java. Java is high-level language
// Output: The substring Java appears 2 times.
