package hashMap;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotSame;

    public class TargetSumTest {

        // True case
        @Test
        public void testSum() {
            TargetSum s = new TargetSum();
            int[] nums = {10, 20, 30, 40, 50, 60};
            int target = 100;
            int[] expected = {3, 5};
            int[] actual = s.twoSumIndices(nums, target);
            assertArrayEquals(expected, actual);
        }

        // False case
        @Test
        public void testSum2() {
            TargetSum s = new TargetSum();
            int[] nums = {10, 20, 30, 40, 50, 60};
            int target = 100;
            int[] notExpected = {2, 4};
            int[] actual = s.twoSumIndices(nums, target);
            for (int i = 0; i < notExpected.length; i++) {
                assertNotSame(notExpected[i], actual[i]);
            }
        }

        // Empty Output Case
        @Test
        public void testSum3() {
            TargetSum s = new TargetSum();
            int[] nums = {10, 20, 30, 40, 50, 70};
            int target = 100;
            int[] a = {};
            for (int i = 0; i < a.length; i++) {
                Assert.assertSame(a[i], s.twoSumIndices(nums, target)[i]);
            }
        }
    }

