package additional;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeTest {
    Palindrome palindrome = new Palindrome();

    @Test
    public void test1(){
        boolean output = palindrome.reverseDigits(121);
        Assert.assertTrue(output);
    }
    @Test
    public void test2(){
        boolean output = palindrome.reverseDigits(987);
        Assert.assertFalse(output);
    }

}
