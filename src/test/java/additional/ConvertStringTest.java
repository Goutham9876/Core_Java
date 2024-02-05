package additional;

import org.junit.Assert;
import org.junit.Test;

public class ConvertStringTest {

    ConvertString convertString = new ConvertString();

    /***
     * Testing the conversion of a string.
     */
    @Test
    public void testConvertingString() {
        Assert.assertEquals("Namo", convertString.convertString("nAMO"));
        Assert.assertEquals("Nanda.", convertString.convertString("nANDA."));
        Assert.assertNotEquals("Shiva", convertString.convertString("Shiva"));
    }


}
