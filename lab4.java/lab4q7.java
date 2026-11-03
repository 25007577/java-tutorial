import java.util.Scanner;

public class lab4q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user inputs
        System.out.print("Enter principal amount: ");
        double P = scanner.nextDouble();

        System.out.print("Enter interest in %: ");
        double i = scanner.nextDouble();

        System.out.print("Enter total number of month(s): ");
        int N = scanner.nextInt();

        // Calculate monthly interest rate
        double r = i / (12.0 * 100.0);

        // Monthly Payment M formula: M = (P * r) / (1 - (1 + r)^(-N))
        double M = (P * r) / (1.0 - Math.pow(1.0 + r, -N));

        // Table Header Output
        System.out.printf("%-8s %-16s %-14s %-12s %-18s %-15s%n", 
                "Month", "Monthly Payment", "Principal", "Interest", "Unpaid Balance", "Total Interest");

        double totalInterest = 0.0;

        // Amortization Table Generation
        for (int n = 1; n <= N; n++) {
            // Principal portion due: C_n = M * (1 + r)^(-(1 + N - n))
            double Cn = M * Math.pow(1.0 + r, -(1 + N - n));

            // Interest due: L_n = M - C_n
            double Ln = M - Cn;

            // Remaining principal balance due: R_n = (L_n / r) - C_n
            double Rn = (Ln / r) - Cn;

            // Handle potential tiny floating-point rounding issue for final month
            if (n == N || Math.abs(Rn) < 0.001) {
                Rn = 0.0;
            }

            totalInterest += Ln;

            // Display month row formatted to 2 decimal places
            System.out.printf("%-8d %-16.2f %-14.2f %-12.2f %-18.2f %-15.2f%n", 
                    n, M, Cn, Ln, Rn, totalInterest);
        }

        scanner.close();
    }
}