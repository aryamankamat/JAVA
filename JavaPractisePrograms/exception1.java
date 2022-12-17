import java.io.*;
import java.lang.*;

class exception1
{
	public static void main(String args[])
	{
		int a = 0,b = 0,ans = 0;

		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter value for a = ");
			a = Integer.parseInt(br.readLine());
			System.out.println("Enter value for b = ");
			b = Integer.parseInt(br.readLine());


			ans = a / b;

			System.out.println("The Division is = "+ ans);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}