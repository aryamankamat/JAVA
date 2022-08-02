import java.util.Scanner;

class Student {
    public int roll;
    public String name;

    public void setData(int r, String n) {
        roll = r;
        name = n;
    }

    public void Display() {
        System.out.println("The Student roll number is = " + roll);
        System.out.println("The Student name is = " + name);
    }

}

public class Student_Custom_class {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Student s1 = new Student(); // Instatiating the object of class Student
        Student s2 = new Student(); // Instatiating the object of class Student

        // Manually setting the values to attributes//
        // s1.roll = 15;
        // s1.name = "Aryaman";
        // s1.Display();

        // Asking user for values//
        // System.out.print("Enter the Student name : ");
        // s1.name = s.nextLine();
        // System.out.print("Enter the Student roll number : ");
        // s1.roll = s.nextInt();
        // s1.Display();

        // Setting values using parameters//
        s1.setData(15, "John");
        s1.Display();
        s2.setData(11, "Chad");
        s2.Display();

    }
}