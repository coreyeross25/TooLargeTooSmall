import java.util.Random;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        // allows for user input

        Random random = new Random();
        // a tool that calculates random numbers

        int mysteryNum = random.nextInt(100) + 1;
        // This will change your range to 1 - 100 instead of 0 - 99. + 1 ,makes it inclusive
        int userGuess = 0;
        int totalGuesses = 0;

        while (userGuess != mysteryNum) {
            System.out.println("Guess a mystery number between 1 and 100");
            userGuess = Integer.parseInt(scanner.nextLine());
            // Integer.parseInt turns a integer primative into a String value
            totalGuesses ++;
            // total guesses will increase by 1 each time

            if (userGuess < mysteryNum) {
                System.out.println("Too small, please try again");
            } else if (userGuess > mysteryNum) {
                System.out.println("Too large, please try again");
            } else {
                System.out.println("Correct guess! You guessed the " + mysteryNum + " in " + totalGuesses + " attempts");

            }


        }



    }
}
