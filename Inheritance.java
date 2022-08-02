class Human {
    private int age;
    private String name;

    public Human() { // Constrictor in Inheritance
        age = 15;
        name = "Chad";
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

class Student extends Human {
    private int roll;
    private String course;

    public Student() { // Constrictor in Inheritance
        roll = 15;
        course = "BBACA";
    }

    public int getroll() {
        return roll;
    }

    public String getCourse() {
        return course;
    }
}

public class Inheritance {
    public static void main(String[] args) {

        Student s1 = new Student();

        System.out.println("The Student roll number is = " + s1.getroll());
        System.out.println("The Student name is = " + s1.getName());
        System.out.println("The Student age is = " + s1.getAge());
        System.out.println("The Student Course is = " + s1.getCourse());
    }
}
