class Student {
    private int roll;
    private String name;

    // Default Constructor//
    // public Student() { // automatically invoked when object of the class is
    // created.
    // roll = 15;
    // name = "Chand";
    // }

    // Parameterized Constructor//
    public Student(String n) { // automatically invoked when object of the class is
        roll = 15;
        name = n;
    }

    public void display() {
        System.out.println("The Student roll number is = " + roll);
        System.out.println("The Student name is = " + name);
    }
}

public class Constructor {
    public static void main(String[] args) {

        Student s1 = new Student("Chad");
        s1.display();
    }
}