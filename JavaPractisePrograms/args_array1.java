import java.io.*;
import java.lang.*;

class args_array1
{
	public static void main(String args[])
	{
		int a = 0 , b = 0;

		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);

		System.out.println("Addition is = "+(a+b));
	}
}