import java.util.Scanner;

public class Recursion {

    static int factorial(int n) {
        if ((n == 0) || (n == 1)) {

            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number for n : ");
        int n = s.nextInt();

        /*
         * Iterative Approch
         * int fact = 1;
         * 
         * for (int i = 1; i <= n; i++) {
         * fact = fact * i;
         * }
         * 
         * System.out.println(fact);
         * 
         */

        System.out.println("The Factorial of n is = " + factorial(n));
    }
}
