package hashset;
import hashset.HashSetIterator;
import org.junit.Test;
import java.util.HashSet;

public class HashSetIteratorTest {
    @Test
    public void testSetIterations(){
        HashSet<String> stringSet = new HashSet<>();

        // Add 10 strings to the HashSet
        stringSet.add("Rama");
        stringSet.add("Sita");
        stringSet.add("Hanuman");
        stringSet.add("Lakshman");
        stringSet.add("Bharath");
        stringSet.add("Dasharatha");
        stringSet.add("Janaka");
        stringSet.add("Shatrughna");
        stringSet.add("Lava");
        stringSet.add("Kusha");
        HashSetIterator.setUsingIterator(stringSet);
        HashSetIterator.setUsingForLoop(stringSet);
        HashSetIterator.setUsingEnhanced(stringSet);


    }

}
