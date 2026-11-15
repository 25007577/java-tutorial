public class to1 {
    public static void main(String[] args) {
        // a. Declare an array that is used to store 12 floating point numbers.
        double[] numbers = new double[12];

        // b. Initialize an array that is used to store the value of A to E.
        char[] letters = {'A', 'B', 'C', 'D', 'E'};

        // c. Declare an array that is used to store 100 students' names.
        String[] studentNames = new String[100];

        // d. Declare an array for a table with 6 rows 2 columns that stores integer values.
        int[][] table = new int[6][2];

        // e. Initialize an array with the given 3x2 matrix values:
        int[][] matrix = {
            {6, 9},
            {2, 5},
            {4, 6}
        };

        // f. Modify the value of the above array to the updated 3x2 matrix:
        matrix[1][1] = 4; // Changes 5 to 4
        matrix[2][0] = 3; // Changes 4 to 3
        matrix[2][1] = 7; // Changes 6 to 7

        // g. Display all the values of an array named contact in separate lines.
        String[] contact = {"Alice", "Bob", "Charlie"}; // Example array
        for (int i = 0; i < contact.length; i++) {
            System.out.println(contact[i]);
        }
    }
}