package String;

import org.junit.Assert;
import org.junit.Test;

public class ReverseTest {
    Reverse reverse = new Reverse();
    @Test
    public void testStringReverse() {
        String output = reverse.reverseWords(" hi Reddy");
        Assert.assertNotEquals("yddeR ih", output);
    }
    @Test
    public void testStringReverse_Pass(){
          String output = reverse.reverseWords("hello h");
          Assert.assertEquals("olleh h",output);
    }



}
