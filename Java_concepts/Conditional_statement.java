import java.util.Scanner;

public class Conditional_statement {
    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);
        System.out.print("Enter your age to check whether your are eligible to vote : ");
        int age = S.nextInt();

        if (age > 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("Sorry, you are not eligible to vote!!!");
        }

    }
}
