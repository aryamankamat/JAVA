import java.io.*;
import java.lang.*;

class slip5_q1
{
	public static void main(String args[])
	{
		int  i = 0,n = 0,j = 0;

		try
		{

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Enter the the value for n = ");
			n = Integer.parseInt(br.readLine());

			for(i = 1;i<=n;i++)
			{
				for(j = 1;j <= i; j++)
				{
					System.out.print(i);
				}
				System.out.println();
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}