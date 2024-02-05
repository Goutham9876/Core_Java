package lambda;

    import java.util.Arrays;

    public class CapitalizeAndSort {
        public void capitalizer(){
            // Example usage
            String[] inputStrings = {"apple", "banana", "Orange", "grape"};

            // Capitalize the first letter of each string
            String[] capitalizedStrings = capitalizeFirstLetter(inputStrings);

            // Sort the strings in alphabetical order
            Arrays.sort(capitalizedStrings);

            // Print the sorted strings
            for (String string : capitalizedStrings) {
                System.out.println(string);
            }
        }

        private static String[] capitalizeFirstLetter(String[] strings) {
            // Capitalize the first letter of each string
            for (int i = 0; i < strings.length; i++) {
                strings[i] = strings[i].substring(0, 1).toUpperCase() + strings[i].substring(1).toLowerCase();
            }
            return strings;
        }
    }

