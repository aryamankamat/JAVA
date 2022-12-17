import java.io.*;
import java.lang.*;
import java.text.SimpleDateFormat.*;
import java.text.ParseException.*;

class NameCheck extends Exception {
	public void display() {
		System.out.println("The date is invalid.");
	}
}

class Demo {
	String date;
	int x = 0;
	int i = 0;
	char ch;

	public Demo() {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter a date = ");
			date = br.readLine();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void check() {
		try {

			DateFormat df = new SimpleDateFormat("dd/MM/YYYY");

			if (date.pattern(["dd/MM/YYYY"])) {
				System.out.println("The date is valid...");
			} else {
				throw new NameCheck();
			}
		} catch (NameCheck n) {
			n.display();
		}
	}
}

class user_defined_exception11 {
	public static void main(String args[]) {
		Demo d = new Demo();
		d.check();
	}
}