import java.io.*;
import java.lang.*;

class slip4_q2
{
	public static void main(String args[])
	{
		int i = 0,n = 0,k = 0,ch = 0;

		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter the start number = ");
			k = Integer.parseInt(br.readLine());
			System.out.println("Enter the end number = ");
			n = Integer.parseInt(br.readLine());

			System.out.println("*****MENU*****");
			System.out.println("1.Display all the numbers from start to end.");
			System.out.println("2.Display all the numbers from end to start.");
			System.out.print("Select your choice = ");
			ch = Integer.parseInt(br.readLine());

			switch(ch)
			{
				case 1:
						System.out.println("The numbers from start to end are displayed below.");
						for(i = k; i <= n; i++)
						{
							System.out.println(i);
						}
						break;

				case 2:
						System.out.println("The numbers from end to start are displayed below.\n");
						for(i = n; i >= 1; i--)
						{
							System.out.println(i);
						}
						break;
				default:
						System.out.println("Invalid choice....");
						break;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
