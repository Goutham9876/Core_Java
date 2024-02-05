package additional;

public class StringRotation {
    /***
     * Check whether one string is rotated of another.
     * @param inputOne
     * @param inputTwo
     * @return
     */
    public boolean isStringRotated(String inputOne, String inputTwo) {
        String output = inputOne + inputOne;
        return output.contains(inputTwo);
    }
}
