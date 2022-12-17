import java.io.*;
import java.lang.*;

interface abc
{
	public void accept();
	public void calculate();
	public void display();
}

class Demo implements abc
{
	int a = 0,b = 0,ans = 0;

	public void accept()
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter the value for a = ");
			a = Integer.parseInt(br.readLine());
			System.out.println("Enter the value for b = ");
			b = Integer.parseInt(br.readLine());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void calculate()
	{
		ans = a + b;
	}
	public void display()
	{
		System.out.println("The addition of "+a+" and "+b+" is = "+ans);
	}
}
class slip9_q1
{
	public static void main(String args[])
	{
		Demo d1 = new Demo();
		d1.accept();
		d1.calculate();
		d1.display();
	}
}