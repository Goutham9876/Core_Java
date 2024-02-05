package additional;

import java.util.Map;
import java.util.TreeMap;

public class SortHashMap {
    /***
     * Sorted Hash map
     * @param hashMap
     * @return
     */
    public Map<Integer, String> sortHashMap(Map<Integer, String> hashMap) {
        return new TreeMap<>(hashMap);
    }

}
