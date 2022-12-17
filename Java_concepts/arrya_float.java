import java.util.Scanner;

public class arrya_float {
    public static void main(String[] args) {
        /* Create a array of 5 floats and calculate their sum. */
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = s.nextInt();
        float sum = 0;

        float[] arr = new float[n];

        System.out.println("Enter the Array elements below...");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the value at " + i + " position : ");
            arr[i] = s.nextFloat();
        }

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println("The sum of array elements are = " + sum);
    }
}