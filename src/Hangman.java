import java.util.Scanner;

public class Hangman {

    private static String[] words = {"toaster", "dinosaur", "keyboard", "gorilla", "motherboard", "pineapple", "butterfly" };
    private static String word = words[(int) (Math.random() * words.length)];
    private static String underscore = new String(new char[word.length()]).replace("\0", "_");
    private static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to hangman!");
        System.out.println("You will have 15 tries to attempt to win the game.");

        while (count < 15 && underscore.contains("_")) {
            System.out.println("Guess a letter in the word.");
            System.out.println("You will have 15 tries to attempt to win the game.");
            System.out.println(underscore);
            String guess = sc.next();
            hang(guess);
        }
        sc.close();
    }

    public static void hang(String guess) {
        String newUnderscore = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess.charAt(0)) {
                newUnderscore += guess.charAt(0);
            } else if (underscore.charAt(i) != '_') {
                newUnderscore += word.charAt(i);
            } else {
                newUnderscore += "_";
            }
        }

        if (underscore.equals(newUnderscore)) {
            count++;
            hangmanPicture();
        } else {
            underscore = newUnderscore;
        }
        if (underscore.equals(word)) {
            System.out.println("Correct! You win! The word was " + word);
        }
    }

    public static void hangmanPicture() {
        if (count == 1) {
            System.out.println("Wrong guess, try again.");
            System.out.println("__|__");
        }

    }
}