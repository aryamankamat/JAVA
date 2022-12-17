import java.io.*;
import java.lang.*;

class func2
{
	public static void Mean(int a, int b)
	{
		System.out.println("The Arithmatic mean is = "+ (a+b)/2);
		System.out.println("The Harmonic mean is = "+ (a*b)/(a+b));
	}

	public static void main(String args[])
	{
		int a = 0, b = 0;

		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter value for a = ");
			a = Integer.parseInt(br.readLine());
			System.out.println("Enter value for b = ");
			b = Integer.parseInt(br.readLine());

			Mean(a,b);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}