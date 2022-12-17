import java.util.Scanner;

public class Fibonacci {

    static void printFibonacci(int n, int n1, int n2, int n3) {
        if (n > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            printFibonacci(n - 1, n1, n2, n3);
        }
    }

    public static void main(String[] args) {
        /*
         * Write a Program to print Fibonacci seriers using recursive as well as
         * Iterative approch.
         */

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value upto which you want to print the Fibonacci series : ");
        int n = s.nextInt();

        System.out.println("\nThe Fibonacci Series is Displayed below...");

        /*
         * Iterative Apporch
         * 
         * int n1 = 0, n2 = 1, n3;
         * System.out.print(n1 + " " + n2);// printing 0 and 1
         * 
         * for (int i = 2; i < n; ++i)// loop starts from 2 because 0 and 1 are already
         * printed
         * {
         * n3 = n1 + n2;
         * System.out.print(" " + n3);
         * n1 = n2;
         * n2 = n3;
         * }
         * 
         */

        int n1 = 0, n2 = 1, n3 = 0;
        System.out.print(n1 + " " + n2);// printing 0 and 1
        printFibonacci(n - 2, n1, n2, n3);// n-2 because 2 numbers are already printed
    }
}