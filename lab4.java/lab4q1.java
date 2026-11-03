import java.util.Scanner;
import java.util.StringJoiner;

public class lab4q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter an Integer: ");
        int num = scanner.nextInt();

        // Find factors and build formatted output string
        StringJoiner factors = new StringJoiner(", ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors.add(String.valueOf(i));
            }
        }

        // Display results
        System.out.println("The factors are: " + factors);
        
        scanner.close();
    }
}
