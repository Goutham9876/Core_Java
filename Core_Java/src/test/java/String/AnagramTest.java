package String;

import org.junit.Assert;
import org.junit.Test;

public class AnagramTest {
    Anagram Anagram = new Anagram();

    @Test
    public void testStringAnagram(){
        boolean output = Anagram.areAnagrams("Goutham","mahtuoG");
        Assert.assertTrue(output);

    }
    @Test
    public void testStringAnagram_Fail(){
        boolean output = Anagram.areAnagrams("Goutham","Nalla");
        Assert.assertFalse(output);

    }

}
