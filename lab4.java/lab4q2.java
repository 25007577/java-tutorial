import java.util.Scanner;

public class lab4q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for n
        System.out.print("Enter integer n: ");
        int n = scanner.nextInt();

        int totalSum = 0;
        int currentTermSum = 0;

        // Loop from 1 to n
        for (int i = 1; i <= n; i++) {
            currentTermSum += i;  // Computes sub-sum (1, 1+2, 1+2+3, ...)
            totalSum += currentTermSum;  // Adds sub-sum to overall total
        }

        // Display total
        System.out.println("Sum of the series: " + totalSum);

        scanner.close();
    }
}