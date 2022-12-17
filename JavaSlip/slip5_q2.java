import java.io.*;
import java.lang.*;

class slip5_q2
{
	public static void main(String args[])
	{
		try
		{
			int i = 0 , k = 0, n = 0,ch = 0;

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Enter the start number = ");
			k = Integer.parseInt(br.readLine());
			System.out.print("Enter the end number = ");
			n = Integer.parseInt(br.readLine());

			System.out.println("*****MENU*****");
			System.out.println("1.Display all the even number.");
			System.out.println("2.Display all the odd numbers.");
			System.out.println("3.Display all the even and odd numbers.");
			System.out.print("Select your choice = ");
			ch = Integer.parseInt(br.readLine());

			switch(ch)
			{
				case 1:
						System.out.println("All the even numbers are displayed below...");
						for(i = k; i <= n; i++)
						{
							if(i % 2 == 0)
							{
								System.out.println("Even number = "+i);
							}
						}
						break;
				case 2:
						System.out.println("All the odd numbers are displayed below...");
						for(i = k; i <= n; i++)
						{
							if(i % 2 != 0)
							{
								System.out.println("odd number = "+i);
							}
						}
						break;
				case 3:
						System.out.println("All the even and odd numbers are displayed below...");
						for(i = k; i <= n; i++)
						{
							if(i % 2 == 0)
							{
								System.out.println("Even number = "+i);
							}
							else
							{
								System.out.println("odd number = "+i);
							}
						}
						break;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}