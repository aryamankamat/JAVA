import java.util.Random;
import java.util.Scanner;

class Game {
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game() {
        Random r = new Random();
        this.number = r.nextInt(100);
    }

    void takeUserInput() {
        System.out.print("Please Guess the number : ");
        Scanner s = new Scanner(System.in);
        inputNumber = s.nextInt();
    }

    boolean isCorrectNumber() {
        noOfGuesses++;
        if (inputNumber == number) {
            System.out.format("Right Guess!!!!!.\n The number was %d.\n You guessed it in %d attempts", number,
                    noOfGuesses);
            return true;
        } else if (inputNumber < number) {
            System.out.println("Too low...");
        } else if (inputNumber > number) {
            System.out.println("Too high...");
        }
        return false;
    }

}

public class Guess_the_Number {
    public static void main(String[] args) {
        /*
         * Create a class Game, which allows a user to play "Guess the Number"
         * game once. Game should have the following methods:
         * 1. Constructor to generate the random number
         * 2. takeUserInput() to take a user input of number
         * 3. isCorrectNumber() to detect whether the number entered by the user is true
         * 4. getter and setter for noOfGuesses
         * Use properties such as noOfGuesses(int), etc to get this task done!
         */

        Game g = new Game();
        boolean b = false;
        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
        }

    }
}