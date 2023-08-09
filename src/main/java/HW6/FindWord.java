package HW6;

import java.util.Random;
import java.util.Scanner;

public class FindWord {

    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        Random random = new Random();
        String chosenWord = words[random.nextInt(words.length)];
        int wordLength = chosenWord.length();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Word Guessing Game!");
        System.out.println("Try to guess the hidden word.");

        while (true) {
            System.out.print("Enter your guess: ");
            String userGuess = scanner.nextLine().toLowerCase();

            if (userGuess.equals(chosenWord)) {
                System.out.println("Congratulations! You've guessed the word: " + chosenWord);
                break;
            } else {
                StringBuilder revealedLetters = new StringBuilder("###############");
                int minLength = Math.min(wordLength, userGuess.length());

                for (int i = 0; i < minLength; i++) {
                    if (userGuess.charAt(i) == chosenWord.charAt(i)) {
                        revealedLetters.setCharAt(i, userGuess.charAt(i));
                    }
                }

                System.out.println("Not quite right. Revealed letters: " + revealedLetters);
            }
        }

        scanner.close();
    }
}
