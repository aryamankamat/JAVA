import java.io.*;
import java.lang.*;

class slip2_q1
{
	public static void main(String args[])
	{
		int a = 0, b = 0,temp = 0;

		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Enter value for a = ");
			a = Integer.parseInt(br.readLine());
			System.out.print("Enter value for b = ");
			b = Integer.parseInt(br.readLine());

			System.out.println("The values before swapping...");
			System.out.println("The value of is a = "+a);
			System.out.println("The value of is b = "+b);

			temp = a;
			a = b;
			b = temp;

			System.out.println("The values After swapping...");
			System.out.println("The value of is a = "+a);
			System.out.println("The value of is b = "+b);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}