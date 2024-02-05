package additional;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class RepeatedCharactersTest {

    RepeatedCharacters repeatedCharacters = new RepeatedCharacters();

    /***
     * Testing repeated characters.
     */
    @Test
    public void testCharacterCount() {
        ArrayList<Character> arrayList = new ArrayList<>(java.util.Arrays.asList('m', 'a'));
        Assert.assertEquals(arrayList, repeatedCharacters.getRepeatedCharacters("madam"));
    }

}
