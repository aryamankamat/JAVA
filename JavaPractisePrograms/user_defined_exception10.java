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
	int fd = 0,ld = 0,num = 0,rem = 0,rev = 0;

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
	public void check() throws Zero
	{
		if(num == 0)
		{
			throw new Zero();
		}
		else
		{
			ld = num % 10;

			while(num != 0)
			{
				rem = num % 10;
				rev = (rev * 10)+rem;
				num = num / 10;
			}
			fd = rev % 10;
			System.out.println("The additon of "+fd+" and "+ld+" is = "+(fd+ld));
		}
	}
}
class user_defined_exception10
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