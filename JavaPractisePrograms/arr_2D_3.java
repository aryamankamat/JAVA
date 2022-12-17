import java.io.*;
import java.lang.*;

class Demo
{
	int i = 0,j = 0,row = 0,col = 0,dsum = 0;
	public Demo()
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Enter the number of rows = ");
			row = Integer.parseInt(br.readLine());
			System.out.print("Enter the number of columns = ");
			col = Integer.parseInt(br.readLine());

			int arr[][] = new int[row][col];

			System.out.println("Enter the array elemets below....");
			for(i = 0;i < row;i++)
			{
				for(j = 0;j < col;j++)
				{
					System.out.print("Enter the "+i+"the and "+j+"the element = ");
					arr[i][j] = Integer.parseInt(br.readLine());
				}
			}
			System.out.println("The array elements are displayed below....");
			for(i = 0;i < row;i++)
			{
				for(j = 0;j < col;j++)
				{
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
			System.out.println("The array digonal elements are displayed below....");
			for(i = 0;i < row;i++)
			{
				for(j = 0;j < col;j++)
				{
					if(i == j)
					{
						System.out.print(arr[i][j]);
					}
				}
				System.out.println();
			}
			System.out.println("The addition of digonal elements are displayed below....");
			for(i = 0;i < row;i++)
			{
				for(j = 0;j < col;j++)
				{
					if(i == j)
					{
						dsum = dsum + arr[i][j];
					}
				}
			}
			System.out.println("The sum of digonal elements are = "+dsum);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class arr_2D_3
{
	public static void main(String args[])
	{
		Demo d = new Demo();
	}
}