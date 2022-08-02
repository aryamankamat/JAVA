import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int n = s.nextInt();

        int[] arr = new int[n]; // Creating an array //

        // method 1.
        // System.out.println("Enter the Array elements below...");
        // for (int i = 0; i < n; i++) {
        // System.out.print("Enter the value for " + i + " value : ");
        // arr[i] = s.nextInt();
        // }

        // System.out.println("The array elements are displayed...");
        // for (int i = 0; i < n; i++) {
        // System.out.println("The value at " + i + " is = " + arr[i]);
        // }

        // method 2.
        // System.out.println("Enter the Array elements below...");
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print("Enter the value for " + i + " value : ");
        // arr[i] = s.nextInt();
        // }

        // System.out.println("The array elements are displayed...");
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println("The value at " + i + " is = " + arr[i]);
        // }

        // Printing the Array in Reverse order //
        // System.out.println("Enter the Array elements below...\n");
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print("Enter the value for " + i + " value : ");
        // arr[i] = s.nextInt();
        // }

        // System.out.println("The array elements are displayed...\n");
        // for (int i = arr.length - 1; i >= 0; i--) {
        // System.out.println("The value at " + i + " is = " + arr[i]);
        // }

        // foreach loop in JAVA //
        System.out.println("\nEnter the Array elements below...\n");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the value for " + i + " value : ");
            arr[i] = s.nextInt();
        }

        System.out.println("\nThe array elements are displayed below...\n");
        for (int mar : arr) {
            System.out.println(mar);
        }
    }
}
