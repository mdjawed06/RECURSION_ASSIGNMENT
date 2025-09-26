import java.util.Scanner;

class PrincessLock {
    // Recursive function to calculate factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // base case
        }
        return n * factorial(n - 1); // recursive step
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of locks: ");
        int n = sc.nextInt();

        int result = factorial(n);
        System.out.println("Ways to open locks: " + result);
    }
}



