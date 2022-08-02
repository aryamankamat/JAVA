
class Employee {
    // public int eid;
    // public String enmae;
    // public int sal;

    // public void accept(int i, String n, int s) {
    // eid = i;
    // enmae = n;
    // sal = s;
    // }

    // public void Display() {
    // System.out.println("Employee id is = " + eid);
    // System.out.println("Employee name is = " + enmae);
    // System.out.println("Employee salary is = " + sal);
    // }

    // Private data members and methods//
    private int eid;
    private String ename;
    private int sal;

    public void setId(int i) {
        eid = i;
    }

    public void setName(String n) {
        ename = n;
    }

    public void setSal(int s) {
        sal = s;
    }

    public int getId() {
        return eid;
    }

    public String getName() {
        return ename;
    }

    public int getSal() {
        return sal;
    }
}

public class Employee_class {
    public static void main(String[] args) {

        Employee e1 = new Employee();

        e1.setId(101);
        e1.setName("John");
        e1.setSal(50000);
        System.out.println("Employee Details are displayed below...");
        System.out.println("Employee id is = " + e1.getId());
        System.out.println("Employee name is = " + e1.getName());
        System.out.println("Employee salary is = " + e1.getSal());
    }
}
