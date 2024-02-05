package additional;

public class ConvertString {
    /***
     * Replace the lower case characters to upper case and vice versa.
     * Time complexity will be O(n).
     * @param input
     * @return
     */
    public String convertString(String input) {
        String outputString = "";
        char[] charArray = input.toCharArray();
        for (char c : charArray) {
            if (Character.isLowerCase(c)) {
                outputString += Character.toUpperCase(c);
            } else if (Character.isUpperCase(c))
                outputString += Character.toLowerCase(c);
            else
                outputString += c;

        }
        return outputString.toString();
    }
}
