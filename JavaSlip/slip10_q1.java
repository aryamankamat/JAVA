import java.io.*;
import java.lang.*;

class Demo
{
	int i = 0,n = 0,ch = 0,max = 0,min = 0;
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
			System.out.println("1.Display the max value from an array.");
			System.out.println("2.Display the min value from an array.");
			System.out.println("3.Dispaly the reverse of that array.");
			System.out.print("Select your choice = ");
			ch = Integer.parseInt(br.readLine());

			switch(ch)
			{
				case 1:
						max = arr[0];
						for(i = 0;i < n;i++)
						{
							if(max < arr[i])
							{
								max = arr[i];
							}
						}
						System.out.println("The maximum element is = "+max);
						break;

				case 2:
						min = arr[0];
						for(i = 0;i < n;i++)
						{
							if(min > arr[i])
							{
								min = arr[i];
							}
						}
						System.out.println("The minimum element is = "+min);
						break;

				case 3:
						System.out.println("The reverse of array is displayed below...");
						for(i = n-1;i >= 0;i--)
						{
							System.out.println(arr[i]);
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
class slip10_q1
{
	public static void main(String args[])
	{
		Demo d1 = new Demo();
	}
}