import java.io.*;
import java.lang.*;

class MaxorMin extends Exception
{
	public void display()
	{
		System.out.println("The First number is maximum.");
	}
}
class Demo
{
	int a = 0,b = 0;

	public Demo()
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter first number = ");
			a = Integer.parseInt(br.readLine());
			System.out.println("Enter second number = ");
			b = Integer.parseInt(br.readLine());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void check() throws MaxorMin
	{
		if(a>b)
		{
			throw new MaxorMin();
		}
		else
		{
			if(a == b)
			{
				System.out.println("Both the numbers are same.");
			}
			else
			{
				System.out.println("The second number is maximum.");
			}
		}
	}
}
class user_defined_exception9
{
	public static void main(String args[])
	{
		Demo d = new Demo();

		try
		{
			d.check();
		}
		catch(MaxorMin m)
		{
			m.display();
		}
	}
}