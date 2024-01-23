
    package String;
import java.util.Scanner;

    public class Vowels {
        public static void main(String[] args) {
            // Read input string from the user
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String inputString = scanner.nextLine();

            // Call the method to count vowels
            int vowelCount = countVowels(inputString);

            // Display the result
            System.out.println("Number of vowels: " + vowelCount);

            // Close the scanner
            scanner.close();
        }

        // Method to count vowels in a string
        public static int countVowels(String str) {
            int count = 0;
            // Convert the string to lowercase to handle both upper and lower case vowels
            str = str.toLowerCase();

            // Loop through each character in the string
            for (int i = 0; i < str.length(); i++) {
                // Check if the character is a vowel
                char bh = str.charAt(i);
                if (bh == 'a' || bh == 'e' || bh == 'i' || bh == 'o' || bh == 'u') {
                    count++;
                }
            }
            return count;
        }
    }

