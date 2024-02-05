package additional;

import java.util.ArrayList;

public class ReverseArrayList {
    /***
     * Reversing the array list using loop.
     * @param integerArrayList
     * @return
     */
    public ArrayList<Integer> getReverse(ArrayList<Integer> integerArrayList) {
        ArrayList<Integer> outputArrayList = new ArrayList<>();
        for(int i = integerArrayList.size() - 1; i >= 0; i--)
            outputArrayList.add(integerArrayList.get(i));

        return outputArrayList;
    }
}
