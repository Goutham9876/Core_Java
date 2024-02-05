package additional;

public class SumItems {
    /***
     * Print sum of all the items of the array.
     * Time complexity will be O(n).
     * @param arr
     * @return
     */
    public int getSumItems(int[] arr) {
        int sum = 0;
        for(int i : arr) {
            sum += i;
        }
        return sum;
    }

}
