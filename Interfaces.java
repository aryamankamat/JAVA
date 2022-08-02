//interface 1
interface Demo {
    public void show();
}

// interface 2
interface Demo2 extends Demo, Demo3 { // A interface can extend multiple interface at a time.

    public void display();
}

// interface 3
interface Demo3 {
    public void flash();
}

class Base {
    public void visible() {
        System.out.println("Hello from Visible function");
    }
}

// a class can implement multiple interface and can only extend one class at a
// time.
class child extends Base implements Demo2 {
    public void show() {
        System.out.println("Hello from show function");
    }

    public void display() {
        System.out.println("Hello from display function");
    }

    public void flash() {
        System.out.println("Hello from flash function");
    }
}

public class Interfaces {
    public static void main(String[] args) {

        child c1 = new child();
        c1.show(); // 1st interface
        c1.display(); // 2nd interface
        c1.visible(); // base class method.
        c1.flash(); // 3rd interface
    }
}
