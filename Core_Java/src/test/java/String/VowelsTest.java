package String;

import org.junit.Assert;
import org.junit.Test;

public class VowelsTest {
    Vowels vowels = new Vowels();
    @Test
    public void testVowels(){
        int output = vowels.countVowels("aeiou");
        Assert.assertEquals(5,output);
    }

}
