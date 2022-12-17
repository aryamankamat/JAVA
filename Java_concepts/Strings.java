public class Strings {
    public static void main(String[] args) {

        // String name = new String("Aryaman"); // method .1 (to create strings in java)
        // String name = "Aryaman"; // method .2 (to create strings in java)
        // System.out.println(name);

        // Different formats to print in JAVA //

        // System.out.print("My name is : "); // ----> No newline at the end.
        // System.out.println(name); // ----> Prints a newline at the end.
        // int a = 99;
        // float f = 1143.55f;
        // System.out.printf("The value of a is %d and the name is %s", a, name);
        // System.out.printf("The value of a is %d and the value of f is %.2f", a, f);
        // System.out.format("The value of a is %d and the name is %s", a, name);
        // System.out.print("\n");
        // System.out.format("The value of a is %d and the value of f is %.2f", a, f);
        // //Two values after the decimal point.
        // System.out.format("The value of a is %d and the value of f is %10.2f", a, f);
        // // It will take 10 spaces to print
        // the value.

        // Methods of Strings //
        // String name = "Aryaman";
        // (1).string_name.lenght();
        // int val = name.length();
        // System.out.println(val);

        // (2). string_name.toLowerCase();
        // String fru = "APPLE";
        // String str = fru.toLowerCase();
        // System.out.println(str);

        // (3). string_name.toUpperCase();
        // String fru = "mango";
        // String str = fru.toUpperCase();
        // System.out.println(str);

        // (4). string_name.trim();
        // String a = " CYCLE ";
        // System.out.println(a);
        // String trimmed = a.trim();
        // System.out.println(trimmed);

        // (5). string_name.substring(int start);
        // String name = "Aryaman";
        // System.out.println(name.substring(3));

        // (6). string_name.substring(int start , int end);
        // String name = "Aryaman";
        // System.out.println(name.substring(1, 5));// end index is excluded
        // System.out.println(name.substring(1, 7));

        // (7). string_name.replace('r','p');
        // String name = "Aryaman";
        // System.out.println(name.replace("r", "p"));

        // (8). string_name.startWith("str");
        // String name = "Aryaman";
        // boolean ans = name.startsWith("Ar");
        // System.out.println(ans);

        // (9). string_name.endstWith("str");
        // String name = "Aryaman";
        // boolean ans = name.endsWith("an");
        // System.out.println(ans);

        // (10). string_name.charAt(index_number);
        // String name = "Aryaman";
        // System.out.println(name.charAt(3));

        // (11). string_name.indexOf("str");
        // String name = "Aryaman";
        // System.out.println(name.indexOf("m"));

        // (12). string_name.indexOf("str",int start);
        // String name = "Aryamanam";
        // System.out.println(name.indexOf("am"));
        // System.out.println(name.indexOf("am", 4));

        // (13). string_name.lastIndexOf("str");
        // String name = "Aryamanam";
        // System.out.println(name.lastIndexOf("am"));

        // (14). string_name.lastIndexOf("str","int before");
        // String name = "Aryamanam";
        // System.out.println(name.lastIndexOf("am", 6));

        // (15). string_name.equals("str");
        // String name = "Aryaman";
        // System.out.println(name.equals("kamat"));
        // System.out.println(name.equals("Aryaman"));

        // (16). string_name.equalsIgnoreCase("str");
        // String name = "Aryaman";
        // System.out.println(name.equalsIgnoreCase("ARYAMAN"));

        // Escape Sequence Characters //

        System.out.println("Trying double quotes \" using escape sequence");
    }
}
