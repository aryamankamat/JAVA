public class array_refe {

    static void Change(int[] arr) {
        arr[0] = 44;
    }

    public static void main(String[] args) {

        int[] marks = { 1, 2, 3, 4, 5 };

        Change(marks); // when we pass a array to the method, array of object is created which hold the
                       // reference or address of the elements present inside the array. Due to which
                       // the original values of the array are changed.

        System.out.println("The value at 0th index is = " + marks[0]);
    }
}
