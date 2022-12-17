import java.io.*;
import java.lang.*;

class Demo
{
	int i = 0,n = 0,max = 0,min = 0;
	public Demo()
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Enter the size of array = ");
			n = Integer.parseInt(br.readLine());

			int arr[] = new int[n];

			System.out.println("Enter the array elements below....");
			for(i=0;i<n;i++)
			{
				System.out.print("Enter the "+i+"th element = ");
				arr[i] = Integer.parseInt(br.readLine());
			}
			System.out.println("Array elements are displayed below...");
			for(i=0;i<n;i++)
			{
				System.out.println(arr[i]);
			}
			max = arr[0];
			for(i=0;i<n;i++)
			{
				if(max < arr[i])
				{
					max = arr[i];
				}
			}
			System.out.println("The maximum element in an array is = "+max);
			min = arr[0];
			for(i=0;i<n;i++)
			{
				if(min > arr[i])
				{
					min = arr[i];
				}
			}
			System.out.println("The minimun element in an array is = "+min);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class arr_1D_5
{
	public static void main(String args[])
	{
		Demo d = new Demo();
	}
}