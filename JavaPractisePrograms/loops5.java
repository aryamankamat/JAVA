import java.io.*;
import java.lang.*;

class loops5
{
	public static void main(String args[])
	{
		int i = 0,k = 0,n = 0,evensum = 0, oddsum = 0;

		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Enter the starting number = ");
			k = Integer.parseInt(br.readLine());
			System.out.print("Enter the ending number = ");
			n = Integer.parseInt(br.readLine());

			for(i = k;i <= n;i++)
			{
				if(i % 2 == 0)
				{
					evensum = evensum + i;
				}
				else
				{
					oddsum = oddsum + i;
				}
			}
			System.out.println("The Even sum is = "+evensum);
			System.out.println("The odd sum is = "+oddsum);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}