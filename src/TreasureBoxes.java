 import java.util.Scanner;

    public class TreasureBoxes {
        // Recursive function to calculate sum
        public static int sumArray(int[] arr, int n) {
            if (n == 0) {
                return 0; // base case
            }
            return arr[n - 1] + sumArray(arr, n - 1); // last element + sum of rest
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Input size
            System.out.print("Enter number of treasure boxes: ");
            int n = sc.nextInt();

            int[] coins = new int[n];
            System.out.println("Enter coins in each box: ");
            for (int i = 0; i < n; i++) {
                coins[i] = sc.nextInt();
            }

            int total = sumArray(coins, n);
            System.out.println("Total coins: " + total);
        }
    }


