import java.io.*;
import java.lang.*;

class args_array3
{
	public static void main(String args[])
	{
		int a = 0,b = 0;

		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);

		System.out.println("Values before swapping.....");
		System.out.println("The value of a = "+a);
		System.out.println("The value of b = "+b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("Values After swapping.....");
		System.out.println("The value of a = "+a);
		System.out.println("The value of b = "+b);
	}
}