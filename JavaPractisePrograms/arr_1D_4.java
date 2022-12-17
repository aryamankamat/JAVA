import java.io.*;
import java.lang.*;

class Demo
{
	int i = 0,n = 0,evencnt = 0,oddcnt = 0,evensum = 0,oddsum = 0;
	public Demo()
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Enter the size of array = ");
			n = Integer.parseInt(br.readLine());

			int arr[] = new int[n];

			System.out.println("Enter the array elements below...");
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
			System.out.println("The odd and even count is displayed below....");
			for(i=0;i<n;i++)
			{
			   if(arr[i] % 2 == 0)
			   {
				   evencnt++;
			   }
			   else
			   {
				   oddcnt++;
			   }
			}
			System.out.println("Even count is = "+evencnt);
			System.out.println("Odd count is = "+oddcnt);
			System.out.println("\n The odd and even sum is displayed below....");
			for(i=0;i<n;i++)
			{
				if(arr[i] % 2 == 0)
				{
					evensum = evensum + arr[i];
				}
				else
				{
					oddsum = oddsum + arr[i];
				}
			}
			System.out.println("Even sum is = "+evensum);
			System.out.println("Odd sum is = "+oddsum);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
class arr_1D_4
{
	public static void main(String args[])
	{
		Demo d = new Demo();
	}
}