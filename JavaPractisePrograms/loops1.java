import java.io.*;
import java.lang.*;

class loops1
{
	public static void main(String args[])
	{
		int i = 0, k = 0,n = 0;

		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter the starting value = ");
			k = Integer.parseInt(br.readLine());
			System.out.println("Enter the ending value = ");
			n = Integer.parseInt(br.readLine());

			for(i = k; i <= n; i++)
			{
				if(i % 2 == 0)
				{
					System.out.println("Even is = "+i);
				}
				else
				{
					System.out.println("Odd is = "+i);
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}