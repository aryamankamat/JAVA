import java.io.*;
import java.lang.*;

class Zero extends Exception
{
	public void display()
	{
		System.out.println("The number is Zero.");
	}
}
class Demo
{
	int lastdigit = 0;
	int firstdigit = 0;
	int rem = 0;
	int rev = 0;
	int num = 0;

	public Demo()
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter a number = ");
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
				lastdigit = num % 10;

				while(num != 0)
				{
					rem = num % 10;
					rev = (rev * 10) + rem;
					num = num / 10;
				}

				firstdigit = rev % 10;

				System.out.println("The last digit is = "+lastdigit);
				System.out.println("The first digit is = "+firstdigit);
				System.out.println("The addition of last and first digit is = "+(firstdigit+lastdigit));
			}
		}
		catch(Zero z)
		{
			z.display();
		}
	}
}
class user_defined_exception5
{
	public static void main(String args[])
	{
		Demo d = new Demo();
		d.check();
	}
}