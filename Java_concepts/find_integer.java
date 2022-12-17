import java.util.Scanner;

public class find_integer {
    /*
     * Write a array to find out whether a given integer is present in an array or
     * not.
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int n = s.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the array at " + i + " position : ");
            arr[i] = s.nextInt();
        }

        System.out.println("\nEnter the element you want to find : ");
        int num = s.nextInt();
        boolean flag = false;

        for (int element : arr) {
            if (num == element) {
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println("The enterd value is present inside the array!!!");
        } else {
            System.out.println("The entered value is not present inside the array!!!");
        }
    }
}
