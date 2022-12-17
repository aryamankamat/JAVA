import java.io.*;
import java.lang.*;

class XYZ
{
	int i = 0,n = 0;

	public XYZ()
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter the array size = ");
			n = Integer.parseInt(br.readLine());

			int arr[] = new int[n];

			System.out.println("Enter the array elements below...");
			for(i = 0;i < n;i++)
			{
				System.out.println("Enter element at "+i+"th position = ");
				arr[i] = Integer.parseInt(br.readLine());
			}
			System.out.println("The array elements below are displayed below...");
			for(i = 0;i < n;i++)
			{
				System.out.println(arr[i]);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

class arr_1D_1
{
	public static void main(String args[])
	{
		XYZ x = new XYZ();
	}
}