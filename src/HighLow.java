import java.util.Scanner;
import java.util.Random;

public class HighLow {
    public static void main(String[] args) {
//        The specs for the game are:
//        Game picks a random number between 1 and 100.
//        Prompts user to guess the number
//        All user inputs are validated
//        If user's guess is less than the number, it outputs "HIGHER"
//        If user's guess is more than the number, it outputs "LOWER"
//        If a user guesses the number, the game should declare "GOOD GUESS!"
//        Hints
//
        playGuessingGame();
//        Keep track of how many guesses a user makes
//        Set an upper limit on the number of guesses
    }
    public static int randomNum() {
        Random rand = new Random();
        return rand.nextInt(100) + 1;
    }
    public static void checkGuess(int gamePick, int guesses) {
        Scanner scan = new Scanner(System.in);
        System.out.print("You have " + guesses + " guesses left: ");
        int userGuess = scan.nextInt();
        if(guesses == 1){
            System.out.println("You've used all your guesses! The number was " + gamePick + " ! Play Again? [y/n] ");
            if(scan.next().startsWith("y")){
                playGuessingGame();
            }
        } else if(userGuess > gamePick) {
            System.out.println("LOWER");
            checkGuess(gamePick, guesses-1);
        } else if (userGuess < gamePick) {
            System.out.println("HIGHER");
            checkGuess(gamePick, guesses-1);
        } else if (userGuess == gamePick) {
            System.out.println("GOOD GUESS!");
            System.out.print("Play Again? [y/n] ");
            if(scan.next().startsWith("y")){
                playGuessingGame();
            }
        }
    }
    public static void playGuessingGame() {
        int gamePick = randomNum();
        System.out.println("Guess my random number between 1 and 100!");
        int guesses = 6;
        checkGuess(gamePick, guesses);
    }
}