import java.util.Scanner;

public class Hangman {

    private static String[] wordList = {"toaster", "dinosaur", "keyboard", "gorilla", "motherboard", "pineapple", "butterfly" };
    private static String word = wordList[(int) (Math.random() * wordList.length)];
    private static String underscore = new String(new char[word.length()]).replace("\0", "_");
    private static int count = 0;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to hangman!");
        System.out.println("You will have 15 tries to attempt to win the game.");

        while (count < 15 && underscore.contains("_")) {
            System.out.println("Guess a letter in the word.");
            System.out.println(underscore);
            String guess = keyboard.next();
            hang(guess);
        }
        keyboard.close();
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
            System.out.println("___|___");
            System.out.println("You have 14 tries remaining.");
        }
        if (count == 2) {
            System.out.println("Wrong guess, try again.");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
            System.out.println("You have 13 tries remaining.");
        }
        if (count == 3) {
            System.out.println("Wrong guess, try again.");
            System.out.println("   ____________");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
            System.out.println("You have 12 tries remaining.");
        }
        if (count == 4) {
            System.out.println("Wrong guess, try again.");
            System.out.println("   ____________");
            System.out.println("   |          O");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
            System.out.println("You have 11 tries remaining.");
        }
        if (count == 5) {
            System.out.println("Wrong guess, try again.");
            System.out.println("   ____________");
            System.out.println("   |          O");
            System.out.println("   |          |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
            System.out.println("You have 10 tries remaining.");
        }
        if (count == 6) {
            System.out.println("Wrong guess, try again.");
            System.out.println("   ____________");
            System.out.println("   |          O");
            System.out.println("   |         _|_");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
            System.out.println("You have 9 tries remaining.");
        }
        if (count == 7) {
            System.out.println("Wrong guess, try again.");
            System.out.println("   ____________");
            System.out.println("   |          O");
            System.out.println("   |         _|_");
            System.out.println("   |        |   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
            System.out.println("You have 8 tries remaining.");
        }
        if (count == 8) {
            System.out.println("Wrong guess, try again.");
            System.out.println("   ____________");
            System.out.println("   |          O");
            System.out.println("   |         _|_");
            System.out.println("   |        |   |");
            System.out.println("   |        |   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
            System.out.println("You have 7 tries remaining.");
        }
        if (count == 9) {
            System.out.println("Wrong guess, try again.");
            System.out.println("   ____________");
            System.out.println("   |          O");
            System.out.println("   |         _|_");
            System.out.println("   |        | | |");
            System.out.println("   |        | | |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
            System.out.println("You have 6 tries remaining.");
        }
        if (count == 10) {
            System.out.println("Wrong guess, try again.");
            System.out.println("   ____________");
            System.out.println("   |          O");
            System.out.println("   |         _|_");
            System.out.println("   |        | | |");
            System.out.println("   |        | | |");
            System.out.println("   |          |");
            System.out.println("   |          |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
            System.out.println("You have 5 tries remaining.");
        }
        if (count == 11) {
            System.out.println("Wrong guess, try again.");
            System.out.println("   ____________");
            System.out.println("   |          O");
            System.out.println("   |         _|_");
            System.out.println("   |        | | |");
            System.out.println("   |        | | |");
            System.out.println("   |          |");
            System.out.println("   |          |");
            System.out.println("   |         / \\");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
            System.out.println("You have 4 tries remaining.");
        }
        if (count == 12) {
            System.out.println("Wrong guess, try again.");
            System.out.println("   ____________");
            System.out.println("   |          O");
            System.out.println("   |         _|_");
            System.out.println("   |        | | |");
            System.out.println("   |        | | |");
            System.out.println("   |          |");
            System.out.println("   |          |");
            System.out.println("   |         / \\");
            System.out.println("   |        /   \\");
            System.out.println("   |");
            System.out.println("___|___");
            System.out.println("You have 3 tries remaining.");
        }
        if (count == 13) {
            System.out.println("Wrong guess, try again.");
            System.out.println("   ____________");
            System.out.println("   |          O");
            System.out.println("   |         _|_");
            System.out.println("   |        | | |");
            System.out.println("   |        | | |");
            System.out.println("   |          |");
            System.out.println("   |          |");
            System.out.println("   |         / \\");
            System.out.println("   |       _/   \\_");
            System.out.println("   |");
            System.out.println("___|___");
            System.out.println("You have 2 tries remaining.");
        }
        if (count == 14) {
            System.out.println("Wrong guess, try again.");
            System.out.println("   ____________");
            System.out.println("   |          O");
            System.out.println("   |         _|_");
            System.out.println("   |        | | |");
            System.out.println("   |       _| | |_");
            System.out.println("   |          |");
            System.out.println("   |          |");
            System.out.println("   |         / \\");
            System.out.println("   |       _/   \\_");
            System.out.println("   |");
            System.out.println("___|___");
            System.out.println("You have 1 try remaining.");
        }
        if (count == 15) {
            System.out.println("Wrong guess, try again.");
            System.out.println("   ____________");
            System.out.println("   |          O");
            System.out.println("   | L       _|_");
            System.out.println("   |        | | |");
            System.out.println("   |       _| | |_");
            System.out.println("   | You Lose |");
            System.out.println("   |          |");
            System.out.println("   |         / \\");
            System.out.println("   |       _/   \\_");
            System.out.println("   |");
            System.out.println("___|___");
            System.out.println("Game over! The word was " + word);
            System.out.println("Try again to win!");


        }
    }
}