package additional;

import org.junit.Assert;
import org.junit.Test;

public class CountUniqueWordsTest {

    CountUniqueWords countUniqueWords = new CountUniqueWords();
    /***
     * Testing unique word count.
     */
    @Test
    public void testGetUniqueWords() {
        Assert.assertEquals(6, countUniqueWords.getCountUniqueWords("This is a sample string and string have characters"));
        //Failure
        Assert.assertNotEquals(3, countUniqueWords.getCountUniqueWords("Goutham"));
        //Edge case
        Assert.assertEquals(0, countUniqueWords.getCountUniqueWords(""));
    }

}
