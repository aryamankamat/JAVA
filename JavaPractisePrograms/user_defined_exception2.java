import java.io.*;
import java.lang.*;

class age extends Exception
{
	public void display()
	{
		System.out.println("Candidate is not eligible for voting.");
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
				throw new age();
			}
			else
			{
				System.out.println("Candidate is eligible to vote.");
			}
		}
		catch(age a)
		{
			a.display();
		}
	}
}
class user_defined_exception2
{
	public static void main(String args[])
	{
		Demo d = new Demo();
		d.check();
	}
}