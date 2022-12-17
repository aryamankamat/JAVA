import java.io.*;
import java.lang.*;

class Demo
{
	int i = 0,k = 0,n = 0,ch = 0,evencnt = 0,oddcnt = 0,evensum = 0,oddsum = 0;
	public Demo()
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Enter the starting number = ");
			k = Integer.parseInt(br.readLine());
			System.out.print("Enter the ending number = ");
			n = Integer.parseInt(br.readLine());

			System.out.println("*****MENU*****");
			System.out.println("1.Displaye all even numbers.");
			System.out.println("2.Displaye all odd numbers.");
			System.out.println("3.Displaye all positive and Negetive numbers.");
			System.out.println("4.Displaye all even  and odd numbers count.");
			System.out.println("5.Displaye sum of all even  and odd numbers.");
			System.out.print("Select Your Choice = ");
			ch = Integer.parseInt(br.readLine());

			switch(ch)
			{
				case 1:
						System.out.println("All even numbers are displayed below...");
						for(i = k;i <= n;i++)
						{
							if(i % 2 == 0)
							{
								System.out.println(i);
							}
						}
						break;
				case 2:
						System.out.println("All odd numbers are displayed below...");
						for(i = k;i <= n;i++)
						{
							if(i % 2 != 0)
							{
								System.out.println(i);
							}
						}
						break;
				case 3:
						System.out.println("All Positive and Negetive numbers are displayed below...");
						for(i = k;i <= n;i++)
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
						break;
				case 4:
						System.out.println("Count of all even and odd numbers is displayed below...");
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
						System.out.println("Number of even elements are = "+evencnt);
						System.out.println("Number of odd elements are = "+oddcnt);
						break;
				case 5:
						System.out.println("Sum of all even and odd number are displaye below...");
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
						System.out.println("Sum of all even numbers is  = "+evensum);
						System.out.println("Sum of all odd numbers is = "+oddsum);
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
class const2
{
	public static void main(String args[])
	{
		Demo d = new Demo();
	}
}