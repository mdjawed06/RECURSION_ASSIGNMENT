import java.util.Scanner;

    public class Question2 {
        // Recursive function to print from n to 1
        public static void printEcho(int n) {
            if (n == 0) {
                return; // base case: stop when n becomes 0
            }
            System.out.print(n + " "); // print current number
            printEcho(n - 1);          // recursive call with n-1
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number: ");
            int n = sc.nextInt();
            printEcho(n);
        }
    }


