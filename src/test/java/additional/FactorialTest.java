package additional;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

    Factorial factorial = new Factorial();

    @Test
    public void test1(){
        int output = factorial.factNum(0);
        Assert.assertEquals(1,output);
    }
    @Test
    public void test2(){
        int output = factorial.factNum(4);
        Assert.assertEquals(24,output);
    }

}
