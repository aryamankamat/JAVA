class Base {
    int a;

    public Base() {
        System.out.println("In Base class Defalult constructor!!!");
    }

    public Base(int a) {
        this.a = a;
        System.out.println("In Base class Parameterized constructor and value of a is = " + a);
    }
}

class Derived extends Base {
    int y;

    public Derived() {
        System.out.println("In Derived class Default constructor!!!");
    }

    // public Derived(int y) {
    // super(0); // giving a call to base class parametrized constructor and
    // initilizing the
    // // value.
    // this.y = y;
    // System.out.println("In Derived class Parameterized constructor and value of y
    // is = " + y);
    // }

    // Passing values to Base class constructor for Derived class constructor//
    public Derived(int a, int y) {
        super(a); // giving a call to base class parametrized constructor and initilizing the
                  // value.
        this.y = y;
        System.out.println("In Derived class Parameterized constructor and value of y is = " + y);
    }
}

public class Constructer_in_Inheritance {
    public static void main(String[] args) {

        Derived d1 = new Derived(10, 20);
    }
}