import java.io.*;
import java.lang.*;

class Zero extends Exception
{
	public void display()
	{
		System.out.println("This number is Zero.");
	}
}
class Demo
{
	int a = 0;

	public Demo()
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter a number = ");
			a = Integer.parseInt(br.readLine());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void check() throws Zero
	{
		if(a == 0)
		{
			throw new Zero();
		}
		else
		{
			System.out.println("The number is not Zero.");
		}
	}
}
class user_defined_exception8
{
	public static void main(String args[])
	{
		Demo d = new Demo();

		try
		{
			d.check();
		}
		catch(Zero z)
		{
			z.display();
		}
	}
}