import java.io.*;
import java.lang.*;

class XYZ
{
	int i = 0, n = 0, k = 0, ch = 0;

	public XYZ()
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter starting number = ");
			k = Integer.parseInt(br.readLine());
			System.out.println("Enter ending number = ");
			n = Integer.parseInt(br.readLine());

			System.out.println("*****MENU*****");
			System.out.println("1.Display all positive numbers.");
			System.out.println("2.Display all Negetive numbers.");
			System.out.println("3.Display all positive and Negetive numbers.");
			System.out.print("Select your choice : ");
			ch = Integer.parseInt(br.readLine());

			switch(ch)
			{
				case 1:
						System.out.println("All positive numbers are displayed below....");
						for(i=k; i <= n; i++)
						{
							if(i > 0)
							{
								System.out.println("Positive number is = "+i);
							}
						}
						break;
				case 2:
						System.out.println("All Negetive numbers are displayed below....");
						for(i=k; i <= n; i++)
						{
							if(i < 0)
							{
								System.out.println("Negetive number is = "+i);
							}
						}
						break;
				case 3:
						System.out.println("All Positive and Negetive numbers are displayed below....");
						for(i=k; i <= n; i++)
						{
							if(i > 0)
							{
								System.out.println("Positive number is = "+i);
							}
							else
							{
								if (i == 0)
								{
									System.out.println("signed numbers");
									continue;
								}
								System.out.println("Negetive number is = "+i);
							}
						}
						break;
				default:
						System.out.println("Invalid choice...");
						break;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class slip6_q2
{
	public static void main(String args[])
	{
		XYZ x1 = new XYZ();
	}
}