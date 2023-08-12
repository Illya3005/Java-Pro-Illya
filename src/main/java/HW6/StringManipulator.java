package HW6;

public class StringManipulator {
    public static int findWordPosition(String source, String target) {
        int index = source.indexOf(target);
        return index;
    }

    public static void main(String[] args) {
        String source = "Hello, world! How are you?";
        String target = "world";
        int position = findWordPosition(source, target);

        if (position != -1) {
            System.out.println("Target found at position: " + position);
        } else {
            System.out.println("Target not found.");
        }
    }
}
