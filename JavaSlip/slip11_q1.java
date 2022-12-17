import java.io.*;
import java.lang.*;

class Age extends Exception
{
	public void display()
	{
		System.out.println("The candidate is not eligible for voting.");
	}
}

class Demo
{
	int age = 0;

	public Demo()
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter your age = ");
			age = Integer.parseInt(br.readLine());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void check()
	{
		try
		{
			if(age < 18)
			{
				throw new Age();
			}
			else
			{
				System.out.println("The candidate is eligible to vote.");
			}
		}
		catch(Age a)
		{
			a.display();
		}
	}
}
class slip11_q1
{
	public static void main(String args[])
	{
		Demo d = new Demo();
		d.check();
	}
}