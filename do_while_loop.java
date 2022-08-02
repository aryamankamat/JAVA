import java.util.Scanner;

public class do_while_loop {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the last number : ");
        int n = s.nextInt();

        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i <= n);
    }
}
