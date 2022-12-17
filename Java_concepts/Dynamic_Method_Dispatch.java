class Base {
    public void show() {
        System.out.println("Hello from Base class show()!!!");
    }
}

class Derived extends Base {
    public void show() {
        System.out.println("Hello from Derived class show()!!!");
    }
}

class Sub extends Base {
    public void show() {
        System.out.println("Hello from Sub class show()!!!");
    }
}

public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {

        Base obj = new Derived(); // reference is of Base class but the object is of Derived class, this is called
                                  // upcasting.
        Base obj2 = new Sub(); // reference is of Base class but the object is of Sub class, this is called
                               // upcasting.

        obj.show(); // at the run-time it is decided to which version(Base/Derived/Sub) of method to
        obj2.show(); // give a call. This is entirly depend on the type of object not on the referece
                     // of the object.

    }
}
