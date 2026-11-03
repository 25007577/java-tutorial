import java.util.Scanner;

public class lab4q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        System.out.print("Enter first day of the year (0 for Sunday, 1 for Monday, ..., 6 for Saturday): ");
        int startDayOfYear = scanner.nextInt();

        // Print the calendar for November (Month 11)
        printMonthCalendar(year, 11, "November", startDayOfYear);

        scanner.close();
    }

    public static void printMonthCalendar(int year, int month, String monthName, int startDayOfYear) {
        // Determine leap year status
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // Days in each month (1-indexed: index 1 = Jan, index 2 = Feb, etc.)
        int[] daysInMonth = {0, 31, isLeapYear ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Calculate cumulative days from Jan 1 up to the 1st of the target month
        int daysBeforeMonth = 0;
        for (int m = 1; m < month; m++) {
            daysBeforeMonth += daysInMonth[m];
        }

        // Calculate starting day of the target month (0 = Sun, 1 = Mon, ..., 6 = Sat)
        int startDayOfMonth = (startDayOfYear + daysBeforeMonth) % 7;

        // Convert Sunday-based day index to a Monday-first column index
        int mondayFirstStartDay = (startDayOfMonth + 6) % 7;

        // Print month header
        System.out.println("          " + monthName + " " + year);
        System.out.println("-----------------------------");
        System.out.println(" Mon Tue Wed Thu Fri Sat Sun");

        // Print leading alignment spaces for the first week
        for (int i = 0; i < mondayFirstStartDay; i++) {
            System.out.print("    ");
        }

        // Print days 1 through total days in month
        for (int day = 1; day <= daysInMonth[month]; day++) {
            System.out.printf("%4d", day);

            // Wrap line after Sunday (column index 6)
            if ((day + mondayFirstStartDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}