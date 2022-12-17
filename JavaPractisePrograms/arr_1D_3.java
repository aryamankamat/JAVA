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

			System.out.print("Enter the size of array = ");
			n = Integer.parseInt(br.readLine());

			int arr[] = new int[n];

			System.out.println("Enter the array elemetns below...");
			for(i=0;i<n;i++)
			{
				System.out.println("Enter the element at "+i+"th position = ");
				arr[i] = Integer.parseInt(br.readLine());
			}
			System.out.println("The array elements are displayed below...");
			for(i=0;i<n;i++)
			{
				System.out.println(arr[i]);
			}
			System.out.println("Positive numbers for array is displayed below...");
			for(i=0;i<n;i++)
			{
			  if(arr[i] > 0)
			  {
				  System.out.println("Positive element is = "+arr[i]);
			  }
			  else
			  {
				  if(arr[i] == 0)
				  {
					  System.out.println("Signed Number.");
					  continue;
				  }
				  System.out.println("negetive element is = "+arr[i]);
			  }
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

class arr_1D_3
{
	public static void main(String args[])
	{
		Demo d = new Demo();
	}
}