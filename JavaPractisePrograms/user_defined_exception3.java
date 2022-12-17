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
	int num = 0;
	int rev = 0;
	int rem = 0;
	int n = 0;

	public Demo()
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Enter a number = ");
			num = Integer.parseInt(br.readLine());
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
			if(num == 0)
			{
				throw new Zero();
			}
			else
			{
				n = num;

				while(num != 0)
				{
					rem = num % 10;
					rev = (rev*10)+rem;
					num = num / 10;
				}
				if(rev == n)
				{
					System.out.println("The number is a palindrom number.");
				}
				else
				{
					System.out.println("The number is not a palindrom number.");
				}
			}
		}
		catch(Zero z)
		{
			z.display();
		}
	}
}
class user_defined_exception3
{
	public static void main(String args[])
	{
		Demo d = new Demo();
		d.check();
	}
}