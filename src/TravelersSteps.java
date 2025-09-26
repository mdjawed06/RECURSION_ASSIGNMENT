
    import java.util.Scanner;

    public class TravelersSteps {
        // Recursive function to count ways
        public static int climbStairs(int n) {
            if (n == 0 || n == 1) {
                return 1; // base cases
            }
            return climbStairs(n - 1) + climbStairs(n - 2);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of steps: ");
            int n = sc.nextInt();

            int ways = climbStairs(n);
            System.out.println("Number of ways to climb: " + ways);
        }
    }


