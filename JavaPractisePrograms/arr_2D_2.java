import java.io.*;
import java.lang.*;

class Demo
{
	int i = 0,j = 0,row = 0,col = 0;
	public Demo()
	{
		try
		{
			BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Enter the number of rows = ");
			row = Integer.parseInt(br.readLine());
			System.out.print("Enter the number of colums = ");
			col = Integer.parseInt(br.readLine());

			int arr[][] = new int[row][col];

			System.out.println("Enter the array elements below....");
			for(i = 0;i < row;i++)
			{
				for(j = 0;j < col;j++)
				{
					System.out.print("Enter the "+i+"th and "+j+"th element = ");
					arr[i][j] = Integer.parseInt(br.readLine());
				}
			}
			System.out.println("The Array elements are displayed below....");
			for(i = 0;i < row;i++)
			{
				for(j = 0;j < col;j++)
				{
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println("The even Array elements are displayed below....");
			for(i = 0;i < row;i++)
			{
				for(j = 0;j < col;j++)
				{
					if(arr[i][j] % 2 == 0)
					{
						System.out.print(arr[i][j]+" ");
					}
				}
				System.out.println();
			}
			System.out.println("The odd Array elements are displayed below....");
			for(i = 0;i < row;i++)
			{
				for(j = 0;j < col;j++)
				{
					if(arr[i][j] % 2 != 0)
					{
						System.out.print(arr[i][j]+" ");
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
class arr_2D_2
{
	public static void main(String args[])
	{
		Demo d = new Demo();
	}
}