import java.io.*;
import java.lang.*;

class Demo
{
	int i = 0,n = 0,ch = 0,sum = 0,evensum = 0,oddsum = 0;
	public Demo()
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter the size of array = ");
			n = Integer.parseInt(br.readLine());

			int arr[] = new int[n];

			System.out.println();
			System.out.println("Enter the array elements below....");
			for(i = 0;i < n;i++)
			{
				System.out.print("Enter the "+i+"th element = ");
				arr[i] = Integer.parseInt(br.readLine());
			}

			System.out.println();
			System.out.println("*****MENU*****");
			System.out.println("1.Display sum of all array elements.");
			System.out.println("2.Display sum of all even elements from array.");
			System.out.println("3.Display sum of all odd elements from array.");
			System.out.print("Select your choice = ");
			ch = Integer.parseInt(br.readLine());

			switch(ch)
			{
				case 1:
						for(i = 0;i < n;i++)
						{
							sum = sum + arr[i];
						}
						System.out.println("The sum of all elements is = "+sum);
						break;

				case 2:
						for(i = 0;i < n;i++)
						{
							if(arr[i] % 2 == 0)
							{
								evensum = evensum + arr[i];
							}
						}
						System.out.println("The sum of all even elements is = "+evensum);
						break;

				case 3:
						for(i = 0;i < n;i++)
						{
							if(arr[i] % 2 != 0)
							{
								oddsum = oddsum + arr[i];
							}
						}
						System.out.println("The sum of all odd elements is = "+oddsum);
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
class slip9_q2
{
	public static void main(String args[])
	{
		Demo d1 = new Demo();
	}
}