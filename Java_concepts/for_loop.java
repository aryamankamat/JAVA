import java.util.Scanner;

public class for_loop {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the last number : ");
        int n = s.nextInt();

        // for (int i = 0; i <= n; i++) {
        // System.out.println(i);
        // }

        // Run the loop in Reverse order //
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
