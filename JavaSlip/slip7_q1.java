import java.io.*;
import java.lang.*;

class one
{
	int a = 0;
}
class two extends one
{
	int b = 0;

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
	public void add()
	{
		System.out.println("The addition of "+a+" and "+b+" is = "+(a+b));
	}
}
class slip7_q1
{
	public static void main(String args[])
	{
		two t1 = new two();
		t1.accept();
		t1.add();
	}
}