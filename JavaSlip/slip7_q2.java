import java.io.*;
import java.lang.*;

class slip7_q2
{
	public static void main(String args[])
	{
		int i = 0, k = 0, n = 0, ch = 0, sum = 0, evensum = 0, oddsum = 0;

		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter the starting value = ");
			k = Integer.parseInt(br.readLine());
			System.out.println("Enter the ending value = ");
			n = Integer.parseInt(br.readLine());

			System.out.println("*****MENU*****");
			System.out.println("1.Display the sum of all the numbers from start to end.");
			System.out.println("2.Display the sum of only even numbers.");
			System.out.println("3.Display the sum of only odd numbers.");
			System.out.print("Select your choice : ");
			ch = Integer.parseInt(br.readLine());

			switch(ch)
			{
				case 1:
						System.out.println("The sum of all the numbers from start to end is displayed below.");
						for(i=k;i<=n;i++)
						{
							sum = sum + i;
						}
						System.out.println("The sum is = "+sum);
						break;

				case 2:
						System.out.println("The sum of all the even numbers from start to end is displayed below.");
						for(i=k;i<=n;i++)
						{
							if(i % 2 == 0)
							{
								evensum = evensum + i;
							}
						}
						System.out.println("The even numbers sum is = "+evensum);
						break;

				case 3:
						System.out.println("The sum of all the odd numbers from start to end is displayed below.");
						for(i=k;i<=n;i++)
						{
							if(i % 2 != 0)
							{
								oddsum = oddsum + i;
							}
						}
										System.out.println("The odd numbers sum is = "+oddsum);
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