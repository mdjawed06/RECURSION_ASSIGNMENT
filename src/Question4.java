
    import java.util.Scanner;

    public class Question4 {
        // Recursive function to reverse string
        public static String reverse(String s) {
            if (s.isEmpty()) {
                return s; // base case
            }
            return reverse(s.substring(1)) + s.charAt(0);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a word: ");
            String str = sc.nextLine();

            String reversed = reverse(str);
            System.out.println("Reversed string: " + reversed);
        }
    }


