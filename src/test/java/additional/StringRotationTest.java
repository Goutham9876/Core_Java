package additional;

import org.junit.Assert;
import org.junit.Test;

public class StringRotationTest {

    StringRotation stringRotation = new StringRotation();

    @Test
    public void testStringRotation() {
        boolean output = stringRotation.isStringRotated("Goutham123", "123Goutham");
        Assert.assertTrue("return", output);
    }
}


