import java.io.*;
import java.lang.*;
import java.lang.String;

class StringCheck extends Exception {
	public void display() {
		System.out.println("The strings are not same.");
	}
}

class Demo {
	String str1, str2;

	public Demo() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter a first string = ");
			str1 = br.readLine();
			System.out.println("Enter a second string = ");
			str2 = br.readLine();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void check() {
		try {
			if (str1.equalsIgnoreCase(str2)) {
				System.out.println("Both the strings are same.");
			} else {
				throw new StringCheck();
			}
		} catch (StringCheck s) {
			s.display();
		}
	}
}

class user_defined_exception6 {
	public static void main(String args[]) {
		Demo d = new Demo();
		d.check();
	}
}