import java.io.*;
import java.lang.*;

class loops2
{
	public static void main(String args[])
	{
		int i = 0,k = 0,n = 0;

		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Enter the starting number = ");
			k = Integer.parseInt(br.readLine());
			System.out.print("Enter the ending number = ");
			n = Integer.parseInt(br.readLine());

			for(i = k; i <= n; i++)
			{
				if(i > 0)
				{
					System.out.println("Positive number is = "+i);
				}
				else
				{
					if(i == 0)
					{
						System.out.println("Signed Number...");
						continue;
					}
					System.out.println("Negetive number is = "+i);
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}