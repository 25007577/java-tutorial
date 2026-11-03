import java.util.Scanner;

public class lab4q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        double sumX = 0;
        double sumX2 = 0;
        double minScore = Double.POSITIVE_INFINITY;
        double maxScore = Double.NEGATIVE_INFINITY;

        while (true) {
            System.out.print("Enter a score [negative score to quit]:");
            
            if (!scanner.hasNextDouble()) {
                break;
            }
            
            double score = scanner.nextDouble();

            // Negative score acts as sentinel value to terminate loop
            if (score < 0) {
                break;
            }

            count++;
            sumX += score;
            sumX2 += (score * score);

            if (score < minScore) {
                minScore = score;
            }
            if (score > maxScore) {
                maxScore = score;
            }
        }

        if (count > 1) {
            double average = sumX / count;

            // Formula: s^2 = (sum(X^2) - (sum(X))^2 / N) / (N - 1)
            double variance = (sumX2 - (sumX * sumX) / count) / (count - 1);
            double stdDev = Math.sqrt(variance);

            // Output matching sample output
            System.out.println(variance);
            System.out.printf("Minimum Score: %.0f%n", minScore);
            System.out.printf("Maximum Score: %.0f%n", maxScore);
            System.out.printf("Average Score: %.2f%n", average);
            System.out.printf("Standard Deviation: %.2f%n", stdDev);
        } else if (count == 1) {
            System.out.printf("Minimum Score: %.0f%n", minScore);
            System.out.printf("Maximum Score: %.0f%n", maxScore);
            System.out.printf("Average Score: %.2f%n", sumX);
            System.out.println("Standard deviation requires at least 2 scores.");
        } else {
            System.out.println("No valid scores entered.");
        }

        scanner.close();
    }
}