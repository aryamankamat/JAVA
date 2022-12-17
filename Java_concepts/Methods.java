import java.util.Scanner;

public class Methods {

    // Static method//
    // static int Maximum(int a, int b) {
    // if (a > b) {
    // return a;
    // } else {
    // return b;
    // }
    // }

    // NON-Static method//
    int Maximum(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a, b;

        System.out.println("\n.....Check the Maximum number.....\n");
        System.out.print("Enter the value for a : ");
        a = s.nextInt();
        System.out.print("Enter the value for b : ");
        b = s.nextInt();

        // int c = Maximum(a, b); // We are giving a direct call to the method which
        // means the only statc methods
        // can be called directly. For non-static methods we have to create objects.

        Methods m1 = new Methods(); // creating an object of class Methods.
        int c = m1.Maximum(a, b); // Giving a call to non-static mehtod Maximum().

        System.out.println("The maximum number is = " + c);
    }
}