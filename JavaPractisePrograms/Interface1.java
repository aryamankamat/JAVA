import java.io.*;
import java.lang.*;

interface Demo
{
	final int a = 10;
	public void accept();
	public void calculate();
	public void display();
}
class XYZ implements Demo
{
	int b = 0,ans = 0;

	public void accept()
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Enter the value for b = ");
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
class Interface1
{
	public static void main(String args[])
	{
		XYZ x = new XYZ();
		x.accept();
		x.calculate();
		x.display();
	}
}