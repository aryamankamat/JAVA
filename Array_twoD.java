import java.util.Scanner;

public class Array_twoD {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the row size : ");
        int r = s.nextInt();
        System.out.print("Ente the column size : ");
        int c = s.nextInt();

        int[][] arr = new int[r][c];

        // 1st Logic
        // System.out.println("Enter the Array elements below...");
        // for (int i = 0; i < r; i++) {
        // for (int j = 0; j < c; j++) {
        // arr[i][j] = s.nextInt();
        // }
        // }

        // System.out.println("The array elements are displayed below...");
        // for (int i = 0; i < r; i++) {
        // for (int j = 0; j < c; j++) {
        // System.out.print(arr[i][j]);
        // System.out.print(" ");
        // }
        // System.out.println("");
        // }

        // 2nd Logic
        System.out.println("Enter the Array elements below...");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = s.nextInt();
            }
        }

        System.out.println("The array elements are displayed below...");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
