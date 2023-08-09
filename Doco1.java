package Solution;
import java.util.Random;
import java.util.Scanner;
  // guessing number game
public class Doco1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1; // it is min range of the number  
        int maxRange = 100;// it is maxrange of the number 
        int maxAttempts = 10; // user attemp
        int score = 0; // score are always zero

        System.out.println("Welcome to the Number Guessing Game!"); // it is title of the game 

        boolean playAgain = true;// is getting after complete 
        while (playAgain) {
            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange; // after the cross maxmunber 
            int attempts = 0; // it attemps is zero 
            boolean guessedCorrectly = false; // so return false 

            System.out.println("\nI've selected a number between " + minRange + " and " + maxRange + ". Can you guess it?");

            while (attempts < maxAttempts) { // atempt the max 
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == targetNumber) {
                    guessedCorrectly = true;
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Your guess is too low.");
                } else {
                    System.out.println("Your guess is too high.");
                }
            }

            if (guessedCorrectly) {
                score++;
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            } else {
                System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was: " + targetNumber);
            }

            System.out.print("\nDo you want to play again? (yes/no): ");
            String playAgainInput = scanner.next().toLowerCase();
            playAgain = playAgainInput.equals("yes");
        }

        System.out.println("Thanks for playing! Your final score is: " + score);
        scanner.close();
    }
}
