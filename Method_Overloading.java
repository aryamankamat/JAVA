import java.util.Scanner;

public class Method_Overloading {

    static void area(int r) {
        double area;

        area = (3.14) * (r * r);
        System.out.println("The area of circle = " + area);
    }

    static void area(float b, Scanner s) {
        double area;
        System.out.println("Enter the height of triangle : ");
        float h = s.nextFloat();

        area = (0.5) * (b * h);
        System.out.println("The area of Triangle is = " + area);
    }

    static void area(float l, float b) {
        float area;
        area = l * b;
        System.out.println("The area of Rectangle is = " + area);
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int ch;
        float l, b;

        while (true) {
            System.out.println("\n*****MENU*****");
            System.out.println("1.Area of Circle");
            System.out.println("2.Area of Triangle");
            System.out.println("3.Area of Rectangle");

            System.out.println("Enter Your Choice : ");
            ch = s.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter the radius of circle : ");
                    int r = s.nextInt();
                    area(r);
                    break;

                case 2:
                    System.out.println("Enter the base of triangle : ");
                    b = s.nextFloat();

                    area(b, s);
                    break;

                case 3:
                    System.out.println("Enter the lenght of rectangle : ");
                    l = s.nextFloat();
                    System.out.println("Enter the base of rectangle : ");
                    b = s.nextFloat();
                    area(l, b);
                    break;
                default:
                    System.out.println("Please enter a valid choice....");
                    break;
            }
        }
    }
}
