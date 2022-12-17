import java.io.*;
import java.lang.*;

class Demo
{
	int i = 0,j = 0,row = 0,col = 0;

	public Demo()
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Enter the number rows = ");
			row = Integer.parseInt(br.readLine());
			System.out.print("Enter the number columns = ");
			col = Integer.parseInt(br.readLine());

			int arr[][] = new int[row][col];

			System.out.println("Enter the array elements below....");
			for(i=0;i<row;i++)
			{
				for(j=0;j<col;j++)
				{
					System.out.print("Enter the "+i+"th and "+j+"th element = ");
					arr[i][j] = Integer.parseInt(br.readLine());
				}
			}
			System.out.println("The array elements are displayed below....");
			for(i=0;i<row;i++)
			{
				for(j=0;j<col;j++)
				{
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
			System.out.println("The array elements Lower Triangle is displayed below....");
			for(i=0;i<row;i++)
			{
				for(j=0;j<col;j++)
				{
					if(i > j)
					{
						System.out.print(arr[i][j]);
					}
					else
					{
						System.out.print("0");
					}
				}
				System.out.println();
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class arr_2D_5
{
	public static void main(String args[])
	{
		Demo d = new Demo();
	}
}