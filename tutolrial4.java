public class tutolrial4 {
    public static void main (String[] args){
 // 1a
    int n = 1;
while (Math.pow(n + 1, 3) < 2000) {
        n++;
    }
System.out.println("Largest n: " + n); // n = 12 (12^3 = 1728)
   // 1b
    for (int i = 1; i <= 12; i++) {
        System.out.println(i + "^2 = " + (i * i));
    }
   // 1c
    java.util.Random rand = new java.util.Random();

for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 5; j++) {
            System.out.print(rand.nextInt(101) + "\t");
        }
        System.out.println();
    }
//1d
    java.util.Scanner scanner = new java.util.Scanner(System.in);
System.out.print("Enter a number: ");
    int num = scanner.nextInt();

    int sum = 0;
for (int i = 1; i <= num; i++) {
        sum += i;
    }
System.out.println("Sum: " + sum);
//1e
        double sum = 0.0;
for (int i = 1; i <= 25; i++) {
        sum += (double) i / (26 - i);
    }
System.out.printf("Sum: %.2f\n", sum);
  //2a
    int sum = 0;
for (int x = 10; x > 0; x--) {
        sum += x;
    }
  //2b
  int x = 0, y = 0;
do {
        x += 2;
        y += x;
        System.out.println(x + " and " + y);
    } while (x < 100);
  //2c
    for (int x = 1, y = 20; x < y; x++, y--) {
        System.out.println(x + " " + y);
    }
    //2d
        int i = 1;
while (i < 10) {
        System.out.println(i);
        i++;
    }
System.out.println("Program End");
//3
        int f1 = 1, f2 = 1;
System.out.print(f1 + " " + f2 + " ");

for (int i = 3; i <= 10; i++) {
        int fn = f1 + f2;
        System.out.print(fn + " ");
        f1 = f2;
        f2 = fn;
    }
System.out.println();
//4
        String str = "Hello World"; // Replace with your input string

for (int i = str.length() - 1; i >= 0; i--) {
        System.out.print(str.charAt(i));
    }
System.out.println();
        {

