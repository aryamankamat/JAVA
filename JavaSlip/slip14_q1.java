import java.io.*;
import java.lang.*;

class StringCheck extends Exception
{
	public void display()
	{
		System.out.println("Both the strings are not same.");
	}
}
class Demo
{
	String str1,str2;

	public Demo()
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter first string = ");
			str1 = br.readLine();
			System.out.println("Enter second string = ");
			str2 = br.readLine();
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
			if(str1.equals(str2))
			{
				System.out.println("Both the strings are same.");
			}
			else
			{
				throw new StringCheck();
			}
		}
		catch(StringCheck s)
		{
			s.display();
		}
	}
}
class slip14_q1
{
	public static void main(String args[])
	{
		Demo d = new Demo();
		d.check();
	}
}