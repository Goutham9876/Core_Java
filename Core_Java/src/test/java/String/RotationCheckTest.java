package String;

import org.junit.Assert;
import org.junit.Test;

public class RotationCheckTest {
    RotationCheck rotationCheck = new RotationCheck();
    @Test
    public void testStringRationCheck(){
        boolean output = rotationCheck.isRotation("JavaMass","MassJava");
        Assert.assertTrue(output);
    }
    @Test
    public void testStringRationCheck_Fail(){
        boolean output = rotationCheck.isRotation("JavaMass"," ");
        Assert.assertFalse(output);
    }


}
