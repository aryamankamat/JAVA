import java.io.*;
import java.lang.*;

class XYZ
{
	int a = 0,b = 0;

	public XYZ()
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter the value for a = ");
			a = Integer.parseInt(br.readLine());
			System.out.println("Enter the value for b = ");
			b = Integer.parseInt(br.readLine());

			System.out.println("The arithmetic mean = "+ (a+b)/2);
			System.out.println("The arithmetic mean = "+ (a*b)/(a+b));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class const1
{
	public static void main(String args[])
	{
		XYZ x = new XYZ();
	}
}