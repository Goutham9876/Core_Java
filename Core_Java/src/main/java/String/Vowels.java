
    package String;
import java.util.Scanner;

    public class Vowels {


        // Method to count vowels in a string
        public  int countVowels(String str) {
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

