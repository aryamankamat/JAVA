import java.io.*;
import java.lang.*;


class slip1_q2
{
	public static void main(String args[])
	{
		int a = 0, b = 0, ch = 0;

		try
		{
			BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Enter first number = ");
			a = Integer.parseInt(br.readLine());
			System.out.print("Enter Second number = ");
			b = Integer.parseInt(br.readLine());

			System.out.println("****MENU****");
			System.out.println("1. Display the max of two numbers.");
			System.out.println("2. Display the min of two numbers.");
			System.out.print("Select your choice = ");
			ch = Integer.parseInt(br.readLine());

			switch(ch)
			{
				case 1:
							System.out.println("\n Maximum value is displayed below...\n");
							if(a > b)
							{
								System.out.println("The maximum value is = "+a);
							}
							else
							{
								System.out.println("The maximum value is = "+b);
							}
							break;
				case 2:
							System.out.println("\n Minimum value is displayed below...\n");
							if(a < b)
							{
								System.out.println("The minimum value is = "+a);
							}
							else
							{
								System.out.println("The minimum value is = "+b);
							}
							break;
				default:
							System.out.println("Invalid choice...");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}