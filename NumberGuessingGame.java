package Guessingapplication;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        boolean Retry;

        do {
            PlayingGame(number);

            System.out.println("Do you want to play again?\n");
            System.out.println("(yes/no): ");
            String response = number.next().toLowerCase();
            Retry = response.equals("yes");

            if (!Retry) {
                float rating = getRating(number);
                
                System.out.println("Your input is highly appreciated,Thank you for the rating and feedback!");
                System.out.println("Have a nice day,Goodbye.");
            }

        } while (Retry);

        number.close();
    }

    private static void PlayingGame(Scanner game) {
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Let's start the game");
        System.out.println("I have selected a random number between 1 and 100.");

        int secretNumber = (int) (Math.random() * 100) + 1;
        int guess;
        int attempts = 0;
        int maxAttempts = 5;

        while (attempts < maxAttempts) {
            System.out.print("Please Enter your guess: ");
            guess = game.nextInt();
            attempts++;

            if (guess < secretNumber) {
                System.out.println("Your guess is Too low!Retry");
            } else if (guess > secretNumber) {
                System.out.println("Your guess is Too high!Retry");
            } else {
                System.out.println("Congratulations! You guessed the secret number " + secretNumber + " in " + attempts + " attempts.");
                return; 
            }
        }
        System.out.println("Sorry, you've reached the maximum number of attempts.");
        System.out.println("The secret number was: " + secretNumber);
    }

    private static float getRating(Scanner game) {
        System.out.print("Please rate the game: \n");
        String ratingInput = game.next();

        try {
           
            return Float.parseFloat(ratingInput);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input>");
            return 3.0f;  
        }
    }
}
