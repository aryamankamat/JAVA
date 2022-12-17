import java.util.Scanner;

class cylinder_calc {
    private int r, h;

    // Default constructor//
    public cylinder_calc() {
        r = 12;
        h = 14;
    }

    // Parameterized constructor//
    public cylinder_calc(int rid, int hig) {
        r = rid;
        h = hig;
    }

    public int getradius() {
        return r;
    }

    public int getheight() {
        return h;
    }
}

public class Cylinder {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the radius of Cylinder = ");
        int r = s.nextInt();
        System.out.println("Enter the height of Cylinder = ");
        int h = s.nextInt();

        cylinder_calc c1 = new cylinder_calc(r, h);

        // area = 2πrh+2πr2 //
        double area = (2 * 3.14 * c1.getradius() * c1.getheight()) + (2 * 3.14 * c1.getradius() * c1.getradius());
        System.out.println("The area of cylinder is = " + area);
    }
}
