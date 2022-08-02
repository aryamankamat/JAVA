import java.util.Scanner;

public class swapping {

    static void swapp(int x, int y) {
        int temp;
        temp = x;
        x = y;
        y = temp;

        System.out.println("\nThe values After Swapping...");
        System.out.println("The value of a is = " + x);
        System.out.println("The value of b is = " + y);
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a, b;
        System.out.print("Enter the value for a : ");
        a = s.nextInt();
        System.out.print("Enter the value for b : ");
        b = s.nextInt();

        System.out.println("\nThe values Before Swapping...");
        System.out.println("The value of a is = " + a);
        System.out.println("The value of b is = " + b);

        swapp(a, b);
    }
}
