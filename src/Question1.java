import java.util.Scanner;
   public class Question1 {

        // Recursive function to print from 1 to n
        public static void printBeats(int i, int n) {
            if (i > n) {
                return;
            }
            System.out.print(i + " ");
            printBeats(i + 1, n);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of beats: ");
            int n = sc.nextInt();
            printBeats(1, n); // start from 1
        }
    }



