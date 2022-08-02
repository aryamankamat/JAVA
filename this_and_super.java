class Demo {
    int a;

    public Demo(int a) {
        this.a = a; // this refers to the object which is responsible for invocation of property or
                    // method.
    }

    public void display() {
        System.out.println("The value of a is = " + a);
    }
}

class Test extends Demo {
    int b;

    public Test(int b) {
        // super(0); // giving a call to the parent class Demo.
        super(b); // giving a call to the parent class Demo.
        System.out.println("Inside Test class constructor!!!");
    }
}

public class this_and_super {
    public static void main(String[] args) {

        // Demo d1 = new Demo(10);
        // d1.display();

        // Test t1 = new Test(40);
        // t1.display();
    }
}
