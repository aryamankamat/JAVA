import java.io.*;
import java.lang.*;

class NameCheck extends Exception {
	public void display() {
		System.out.println("The name is invalid.");
	}
}

class Demo {
	String name;
	int x = 0;
	int i = 0;
	char ch;

	public Demo() {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter a name = ");
			name = br.readLine();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void check() {
		try {
			if (name.matches("[a-zA-Z ,]+")) {
				System.out.println("The Name is valid...");
			} else {
				throw new NameCheck();
			}
		} catch (NameCheck n) {
			n.display();
		}
	}
}

class user_defined_exception7 {
	public static void main(String args[]) {
		Demo d = new Demo();
		d.check();
	}
}