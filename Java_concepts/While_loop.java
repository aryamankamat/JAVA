import java.util.Scanner;

public class While_loop {
    public static void main(String[] args) {
        int n, i = 0;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the end number : ");
        n = s.nextInt();

        while (i <= n) {
            System.out.println(i);

            i++;
        }
    }

}