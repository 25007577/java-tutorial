import java.util.Random;
import java.util.Scanner;

public class lab4q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int p1Score = 0;
        int p2Score = 0;
        int currentPlayer = 1;

        System.out.println("=== Two-Player Dice Game ===");

        while (p1Score <= 100 && p2Score <= 100) {
            System.out.print("\nPlayer " + currentPlayer + "'s turn. Press ENTER to roll...");
            scanner.nextLine();

            int roll = random.nextInt(6) + 1; // Roll a number between 1 and 6
            System.out.println("Player " + currentPlayer + " rolled a " + roll + "!");

            // Update scores
            if (currentPlayer == 1) {
                p1Score += roll;
                System.out.println("Current Scores -> Player 1: " + p1Score + " | Player 2: " + p2Score);

                if (p1Score > 100) {
                    System.out.println("\n🎉 Player 1 wins with " + p1Score + " points!");
                    break;
                }
            } else {
                p2Score += roll;
                System.out.println("Current Scores -> Player 1: " + p1Score + " | Player 2: " + p2Score);

                if (p2Score > 100) {
                    System.out.println("\n🎉 Player 2 wins with " + p2Score + " points!");
                    break;
                }
            }

            // Rule: Rolling a 6 grants an extra turn
            if (roll == 6) {
                System.out.println("Bonus! Player " + currentPlayer + " rolled a 6 and gets to roll again.");
            } else {
                // Switch turn to the other player
                currentPlayer = (currentPlayer == 1) ? 2 : 1;
            }
        }

        scanner.close();
    }
}