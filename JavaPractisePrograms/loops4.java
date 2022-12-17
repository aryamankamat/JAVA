import java.io.*;
import java.lang.*;

class loops4
{
	public static void main(String args[])
	{
		int i = 0,k = 0,n = 0;

		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Enter the staring number = ");
			k = Integer.parseInt(br.readLine());
			System.out.print("Enter the ending number = ");
			n = Integer.parseInt(br.readLine());

			System.out.println("Numbers in Reverse Order are displayed below...");
			for(i = n;i >= k;i--)
			{
				System.out.println(i);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}