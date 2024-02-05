package additional;

import org.junit.Assert;
import org.junit.Test;

public class SumItemsTest {

    SumItems sumItems = new SumItems();

    /***
     * Testing the sum of all elements in an array.
     */
    @Test
    public void testGetSumItems() {
        Assert.assertEquals(15, sumItems.getSumItems(new int[]{1,2,3,4,5}));
        Assert.assertNotEquals(2, sumItems.getSumItems(new int[]{1,2,3,4}));
    }

}
