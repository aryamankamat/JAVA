import java.io.*;
import java.lang.*;

class Demo
{
	int i = 0,n = 0;
	public Demo()
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter the size of array = ");
			n = Integer.parseInt(br.readLine());

			int arr[] = new int[n];

			System.out.println("Enter the array elements below...");
			for(i=0;i<n;i++)
			{
				System.out.println("Enter the "+i+"th value = ");
				arr[i] = Integer.parseInt(br.readLine());
			}
			System.out.println("The array elements are displayed below...");
			for(i=0;i<n;i++)
			{
				System.out.println(arr[i]);
			}
			System.out.println("The even and odd elements are displayed below...");
			for(i=0;i<n;i++)
			{
				if(arr[i] % 2 == 0)
				{
					System.out.println("Even number is = "+arr[i]);
				}
				else
				{
					System.out.println("odd number is = "+arr[i]);
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class arr_1D_2
{
	public static void main(String args[])
	{
		Demo d = new Demo();
	}
}