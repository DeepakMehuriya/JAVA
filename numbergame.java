import java.util.Random;
import java.util.Scanner;

public class numbergame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int totalScore = 0;
        int rounds = 0;

        System.out.println("===== NUMBER GUESSING GAME BY DEEPAK =====");

        while (true) {
            rounds++;
            System.out.println("\n--- Round " + rounds + " ---");
            int number = rand.nextInt(100) + 1;   // Random number from 1 to 100
            int attemptsAllowed = 7;
            int attempts = 0;
            boolean guessed = false;

            System.out.println("I have selected a number between 1 and 100.");
            System.out.println("You have " + attemptsAllowed + " attempts.");

            while (attempts < attemptsAllowed) {
                attempts++;
                System.out.print("Attempt " + attempts + " - Enter your guess: ");
                int guess = sc.nextInt();

                if (guess == number) {
                    System.out.println(" Correct! You guessed the number.");
                    guessed = true;

                    int score = 100 - (attempts * 10);
                    totalScore += score;

                    System.out.println("Your score for this round: " + score);
                    break;
                } 
                else if (guess < number) {
                    System.out.println("Too low! Try again.");
                } 
                else {
                    System.out.println("Too high! Try again.");
                }
            }

            if (guessed) {
                System.out.println("\n You failed to guess the number.");
                System.out.println("The correct number was: " + number);
                System.out.println("Score for this round: 0");
            }

            System.out.print("\nDo you want to play another round? (yes/no): ");
            String ch = sc.next().toLowerCase();

            if (!ch.equals("yes")) {
                break;
            }
        }

        System.out.println("\n===== GAME OVER KHATAM =====");
        System.out.println("Total Rounds Played: " + rounds);
        System.out.println("Total Score: " + totalScore);
        System.out.println("Thanks for playing!  ");

        sc.close();
    }
}

