import java.io.*;
import java.lang.*;

class Demo
{
	int i = 0,n = 0,ch = 0;
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
			System.out.println("1.Display all array elements.");
			System.out.println("2.Display all even elements from array.");
			System.out.println("3.Display all odd elements from array.");
			System.out.print("Select your choice = ");
			ch = Integer.parseInt(br.readLine());

			switch(ch)
			{
				case 1:
						System.out.println("Displaying all array elements below...");
						for(i = 0;i < n;i++)
						{
							System.out.println(arr[i]);
						}
						break;

				case 2:
						System.out.println("Displaying all even elements from the array...");
						for(i = 0;i < n;i++)
						{
							if(arr[i] % 2 == 0)
							{
								System.out.println(arr[i]);
							}
						}
						break;

				case 3:
						System.out.println("Displaying all odd elements from the array...");
						for(i = 0;i < n;i++)
						{
							if(arr[i] % 2 != 0)
							{
								System.out.println(arr[i]);
							}
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
class slip8_q2
{
	public static void main(String args[])
	{
		Demo d1 = new Demo();
	}
}