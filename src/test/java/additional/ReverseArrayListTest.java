package additional;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ReverseArrayListTest {

    ReverseArrayList reverseArrayList = new ReverseArrayList();

    /***
     * Testing reverse of an array list.
     */
    @Test
    public void testReverseArrayList() {
        ArrayList integerArrayList = new ArrayList<>(java.util.Arrays.asList(1, 2, 3, 4, 5));
        ArrayList outputArrayList = new ArrayList<>(java.util.Arrays.asList(5, 4, 3, 2, 1));

        Assert.assertEquals(outputArrayList,reverseArrayList.getReverse(integerArrayList));
    }

}
