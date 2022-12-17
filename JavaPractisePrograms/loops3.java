import java.io.*;
import java.lang.*;

class loops3
{
	public static void main(String args[])
	{
		int i = 0,k = 0,n = 0,evencnt = 0, oddcnt = 0;

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
					evencnt++;
				}
				else
				{
					oddcnt++;
				}
			}
			System.out.println("The Even count is = "+evencnt);
			System.out.println("The odd count is = "+oddcnt);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
