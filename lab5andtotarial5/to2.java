public class to2 {
    public static void main(String[] args) {
        // a. Error: Strings in Java must use double quotes (" "), not single quotes (' ').
        String[] code = {"AAA", "AAB", "AAC", "AAD"};

        // b. Errors:
        //    1. Data type after 'new' should be 'int', not the variable name 'num'.
        //    2. Array length is a property (num.length), not a method (num.length()).
        int[] num = new int[10];
        int sum = 0;
        for (int k = 0; k < num.length; k++) {
            sum += num[k];
        }

        // c. Error: The second dimension was not instantiated before assigning a value.
        int[][] t = new int[3][3]; // Or specify at least 3 columns (e.g., new int[3][3])
        t[1][2] = 5;

        // d. Errors:
        //    1. Use a semicolon (;) instead of a colon (:) after 'int i = 4'.
        //    2. Missing semicolon after 'score[1] = 78'.
        //    3. '++i' increments i to 5, which causes an ArrayIndexOutOfBoundsException (valid indices are 0 to 4).
        int i = 4;
        int[] score = new int[5];
        score[1] = 78;
        score[i] = 100; // Changed ++i to i so it stays within index 4
    }
}