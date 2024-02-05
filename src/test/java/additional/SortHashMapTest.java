package additional;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class SortHashMapTest {

    SortHashMap sortHashMap = new SortHashMap();

    /***
     * Testing the hash map.
     */
    @Test
    public void testSortHashMap() {
        Map<Integer, String> hashMap =  createHashMap();
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Sai");
        map.put(2, "Shiva");
        map.put(3, "A");
        Assert.assertEquals(map,sortHashMap.sortHashMap(hashMap));
    }
    public Map<Integer, String> createHashMap() {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(2, "Shiva");
        hashMap.put(1, "Sai");
        hashMap.put(3, "A");
        return hashMap;
    }




}
