package additional;

import org.junit.Assert;
import org.junit.Test;

public class SwapTest {
    Swap swap = new Swap();
    @Test
    public void testSwap(){
        int[] expectedArray ={7,6};
        int[] outputArray = swap.swappingElement(6,7);
        Assert.assertArrayEquals(expectedArray,outputArray);

    }

}
