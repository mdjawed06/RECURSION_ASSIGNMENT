import java.util.Scanner;
    public class Question3 {

        // Recursive function to find sum of first n numbers
        public static int sumCoins(int n) {
            if (n == 0) {
                return 0; // base case: sum of 0 is 0
            }
            return n + sumCoins(n - 1); // current chest + sum of previous chests
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of chests: ");
            int n = sc.nextInt();
            int total = sumCoins(n);
            System.out.println("Total coins = " + total);
        }
    }


