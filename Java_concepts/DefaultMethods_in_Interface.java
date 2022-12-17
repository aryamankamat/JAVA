//interface 1
interface Demo {
    public void show();

    private void inside() {
        System.out.println("Hello from PRIVATE function inside() of Interce Demo !!!");
    }

    default public void flash() {
        inside();
        System.out.println("Hello from flash() function of Interce Demo !!!");
    }

}

// interface 2
interface Demo2 {
    public void display();
}

class Base {
    public void visible() {
        System.out.println("Hello from Visible function");
    }
}

class child extends Base implements Demo, Demo2 {
    public void show() {
        System.out.println("Hello from show function");
    }

    public void display() {
        System.out.println("Hello from display function");
    }

    // If a default function is redefined in child class, the child class function
    // will override the default function.

    // public void flash() {
    // System.out.println("Hello from flash() function of child class !!!");
    // }
}

public class DefaultMethods_in_Interface {
    public static void main(String[] args) {

        child c1 = new child();
        // c1.show();
        // c1.display();
        // c1.visible();
        c1.flash(); // defalut method.
    }
}
