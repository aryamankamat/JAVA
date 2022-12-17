import java.util.Scanner;

public class arrya_muli1 {
    public static void main(String[] args) {
        /* Create a JAVA program to add two matrics of size 2X3. */

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the row length : ");
        int r = s.nextInt();
        System.out.println("Enter the column length : ");
        int c = s.nextInt();

        int[][] arr1 = new int[r][c];
        int[][] arr2 = new int[r][c];
        int[][] ans = new int[r][c];

        System.out.println("Enter the elements for 1st Array...");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr1[i][j] = s.nextInt();
            }
        }

        System.out.println("\n");

        System.out.println("Enter the elements for 2nd Array...");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr2[i][j] = s.nextInt();
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                ans[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println("The addition of two Arrays is displayed below...");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(ans[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
