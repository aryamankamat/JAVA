import java.util.Scanner;

public class Percentage {
    public static void main(String[] argu) {
        int m1, m2, m3, m4, m5;
        float total, per;

        System.out.println("Enter the Student Subject Marks Details below...");
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the marks of English : ");
        m1 = s.nextInt();
        System.out.print("Enter the marks of Physics : ");
        m2 = s.nextInt();
        System.out.print("Enter the marks of Chemistry : ");
        m3 = s.nextInt();
        System.out.print("Enter the marks of Maths : ");
        m4 = s.nextInt();
        System.out.print("Enter the marks of Computer : ");
        m5 = s.nextInt();

        System.out.println("\n");

        System.out.println("The Student Marks Details are displayed below...");
        System.out.println("The marks of English is : " + m1);
        System.out.println("The marks of Physics is : " + m2);
        System.out.println("The marks of Chemistry is : " + m3);
        System.out.println("The marks of Maths is : " + m4);
        System.out.println("The marks of Computer is : " + m5);

        System.out.println("\n");
        total = m1 + m2 + m3 + m4 + m5;
        per = (total / 5);
        System.out.println("The Percentage of student is = " + per + "\n");
    }
}
