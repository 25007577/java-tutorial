import java.util.Random;

public class lab4q6 {
    public static void main(String[] args) {
        Random random = new Random();

        // Generate a non-negative random integer [0, Integer.MAX_VALUE - 1]
        int number = random.nextInt(Integer.MAX_VALUE);
        System.out.println("Generated Integer: " + number);

        // Count digits using a loop
        int count = 0;
        int temp = number;

        if (temp == 0) {
            count = 1;
        } else {
            while (temp > 0) {
                temp /= 10; // Remove the last digit
                count++;    // Increment digit count
            }
        }

        System.out.println("Number of digits: " + count);
    }
}