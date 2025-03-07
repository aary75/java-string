import java.util.Scanner;

public class AnagramChecker {

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Remove spaces and convert both strings to lowercase for comparison
        text1 = text1.replaceAll("\\s", "").toLowerCase();
        text2 = text2.replaceAll("\\s", "").toLowerCase();
        
        // If lengths are not equal, they cannot be anagrams
        if (text1.length() != text2.length()) {
            return false;
        }
        
        // Create an array to store frequency of characters for both texts
        int[] frequency1 = new int[26]; // For English lowercase letters (a-z)
        int[] frequency2 = new int[26]; // For English lowercase letters (a-z)
        
        // Loop to find frequency of characters in both strings
        for (int i = 0; i < text1.length(); i++) {
            frequency1[text1.charAt(i) - 'a']++;  // Increment frequency for text1
            frequency2[text2.charAt(i) - 'a']++;  // Increment frequency for text2
        }
        
        // Compare the frequencies of characters in both texts
        for (int i = 0; i < 26; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;  // Frequencies are different, so texts are not anagrams
            }
        }
        
        return true;  // The texts are anagrams
    }

    public static void main(String[] args) {
        // Take input from the user
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first text: ");
        String text1 = scanner.nextLine();
        
        System.out.print("Enter the second text: ");
        String text2 = scanner.nextLine();
        
        // Check if the two texts are anagrams
        if (areAnagrams(text1, text2)) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }
        
        scanner.close();
    }
}
