package HW6;

public class Reverse {
    public static String stringReverse(String inputString) {
        StringBuilder reversed = new StringBuilder();
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversed.append(inputString.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        String inputString = "Hello, world!";
        String reversedString = stringReverse(inputString);
        System.out.println("Original string: " + inputString);
        System.out.println("Reversed string: " + reversedString);
    }
}

