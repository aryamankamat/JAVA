import java.io.*;
import java.lang.*;

class slip1_q1
{
	public static void add(int a, int b)
	{
		System.out.println("The addition of "+a+" and "+b+" is = "+(a+b));
	}
	public static void sub(int a,int b)
	{
		System.out.println("The subtraction of "+a+" and "+b+" is = "+(a-b));
	}
	public static void main(String args[])
	{
		int a = 0,b = 0;

		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter first number = ");
			a = Integer.parseInt(br.readLine());
			System.out.println("Enter Second number = ");
			b = Integer.parseInt(br.readLine());

			add(a,b);
			sub(a,b);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}