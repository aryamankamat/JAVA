class Base {
    public void display() {
        System.out.println("Hello from Base ka display()!!!");
    }
}

class Derived extends Base {
    @Override // Notation which implies method overriding
    public void display() { // this will override the parent class display() function.
        // super.display(); // to give call to parent class display() function.
        System.out.println("Hello from Derived ka display()!!!");
    }
}

public class Method_Overriding {
    public static void main(String[] args) {
        Derived d1 = new Derived();
        d1.display();
    }
}