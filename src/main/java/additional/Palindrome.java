package additional;

public class Palindrome {

    public boolean reverseDigits(int num) {
        int originalNum = num;
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return originalNum == reversed;


    }
}
