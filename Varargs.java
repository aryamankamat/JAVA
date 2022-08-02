public class Varargs {

    // public static int sum(int... args) {
    // int sm = 0;

    // for (int records : args) {
    // sm = sm + records;
    // }

    // return sm;
    // }

    public static int sum(int i, int... args) { // A method can also be written like this to avoid empty arguments to be
                                                // passed to the function
        int sm = 0;

        for (int records : args) {
            sm = sm + records;
        }

        return sm;
    }

    public static void main(String[] args) {

        System.out.println("The sum is = " + sum(1, 2));
        System.out.println("The sum is = " + sum(2, 3, 4));
        System.out.println("The sum is = " + sum(4, 5, 6));
        // System.out.println("The sum is = " + sum()); // Compulsory atleast one
        // argument is required.
    }
}
