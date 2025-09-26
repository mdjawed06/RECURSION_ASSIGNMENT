
    import java.util.Scanner;

    public class RabbitsFamily {
        // Recursive function to calculate Fibonacci
        public static int fibonacci(int n) {
            if (n == 1 || n == 2) {
                return 1; // base cases
            }
            return fibonacci(n - 1) + fibonacci(n - 2); // recursive step
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter month number: ");
            int n = sc.nextInt();

            int rabbits = fibonacci(n);
            System.out.println("Number of rabbits in month " + n + ": " + rabbits);
        }
    }


