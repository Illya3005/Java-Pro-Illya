package HW6;

public class SymbolCounter {
    public static int findSymbolOccurance(String inputString, char symbol) {
        int count = 0;
        for (char c : inputString.toCharArray()) {
            if (c == symbol) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String inputString = "Nobody dies a virgin... Life fucks us all";
        char symbolToFind = 'o';
        int occurrences = findSymbolOccurance(inputString, symbolToFind);
        System.out.println("The symbol '" + symbolToFind + "' occurs " + occurrences + " times in the input string.");
    }
}

