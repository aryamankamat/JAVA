import java.io.*;
import java.lang.*;

class Demo
{
	int a = 0, b = 0;

	public Demo()
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter the value for a = ");
			a = Integer.parseInt(br.readLine());
			System.out.println("Enter the value for b = ");
			b = Integer.parseInt(br.readLine());

			System.out.println("The Division of "+a+" and "+b+" is = "+(a/b));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

class slip3_q1
{
	public static void main(String args[])
	{
		Demo d1 = new Demo();
	}
}