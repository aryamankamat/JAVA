import java.util.Scanner;

public class Loop_practise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value for n : ");
        int n = s.nextInt();

        /*
        
         ******
         *****
         *****
         *****
         *****
        
         */
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // System.out.print("*");
        // }
        // System.out.print("\n");
        // }

        /*
         
            *
            **
            ***
            ****
            *****
          
         */

        // for (int i = 0; i <= n; i++) {
        // for (int j = 0; j < i; j++) {
        // System.out.print("*");
        // }
        // System.out.print("\n");
        // }

        /*
        
         ***** 
         **** 
         *** 
         **
         *
         
         */

        // for (int i = n; i >= 0; i--) {
        // for (int j = 0; j < i; j++) {
        // System.out.print("*");
        // }
        // System.out.print("\n");
        // }

        /* Write a program to sum n even numbers using while loop */

        // int i = 0;
        // int sum = 0;

        // while (i <= n) {
        // if (i % 2 == 0) {
        // sum = sum + i;
        // }

        // i++;
        // }
        // System.out.println("The sum of n natural numbers are = " + sum);

        /* Write a program to print Multiplication table of a given number. */

        // for (int i = 0; i <= 10; i++) {
        // System.out.printf("%d X %d = %d", n, i, (n * i));
        // System.out.print("\n");
        // }

        /* Write a program to print Multiplication table of 10 in reverse order. */

        // for (int i = n; i >= 0; i--) {
        // System.out.printf("%d X %d = %d", n, i, (n * i));
        // System.out.print("\n");
        // }

        /* Write a program to find factorial of a given number using for loop. */

        // int fact = 1;

        // for (int i = 1; i <= n; i++) {
        // fact = fact * i;
        // }
        // System.out.println("The Factorial is = " + fact);

        /* Write a program to find factorial of a given number using while loop. */

        // int fact = 1;
        // int i = 1;
        // while (i <= n) {
        // fact = fact * i;

        // i++;
        // }
        // System.out.println("The Factorial is = " + fact);

        /*
         * 
         * Write a program to calculate the sum of the number occuring in the
         * multiplication table of 8
         * 
         */

        // int sum = 0;
        // for (int i = 0; i <= 10; i++) {
        // sum = sum + (n * i);
        // }
        // System.out.println("The sum of numbers are = " + sum);
    }
}
