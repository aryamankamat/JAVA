class Student {
    private int roll;
    private String name;

    // CONSTRUCTOR OVERLOADING//

    // Default Constructor//
    public Student() { // automatically invoked when object of the class is created.
        roll = 15;
        name = "Chand";
    }

    // Parameterized Constructor//
    public Student(String n) { // automatically invoked when object of the class is created.
        roll = 15;
        name = n;
    }

    // Parameterized Constructor//
    public Student(int r) { // automatically invoked when object of the class is created.
        roll = r;
        name = "Chand";
    }

    public void display() {
        System.out.println("The Student roll number is = " + roll);
        System.out.println("The Student name is = " + name);
    }
}

public class Constructor_Overloading {
    public static void main(String[] args) {

        // Student s1 = new Student(); // 1st constructor will be invoked.
        // Student s1 = new Student("Chad"); //2nd constructor will be invoked.
        Student s1 = new Student(15); // 3rd constructor will be incoked.
        s1.display();
    }
}
