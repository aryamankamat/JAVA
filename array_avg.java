import java.util.Scanner;

public class array_avg {
    public static void main(String[] args) {
        /*
         * Calculate the average marks from an array containing marks of all student in
         * physics using foreach loop.
         */

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = s.nextInt();
        float sum = 0;

        float[] marks = new float[n];

        System.out.println("Enter the Marks of subjects below...");
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter the Mark of " + i + " subject : ");
            marks[i] = s.nextFloat();
        }

        for (float Mark : marks) {
            sum = sum + Mark;
        }

        System.out.println("The average Makrks of subjects is =  " + sum / marks.length);
    }
}
