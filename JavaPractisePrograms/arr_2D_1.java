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

			System.out.print("Enter number of rows = ");
			row = Integer.parseInt(br.readLine());
			System.out.print("Enter number of columns = ");
			col = Integer.parseInt(br.readLine());

			int arr[][] = new int[row][col];

			System.out.println("Enter the array elemetns below....");
			for(i = 0;i < row;i++)
			{
				for(j = 0;j < col;j++)
				{
					System.out.print("Enter "+i+"th and "+j+"th element = ");
					arr[i][j] = Integer.parseInt(br.readLine());
				}
			}
			System.out.println("2D Array elements are displayed below.....");
			for(i = 0;i < row;i++)
			{
				for(j = 0;j < col;j++)
				{
					System.out.print(arr[i][j]);
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
class arr_2D_1
{
	public static void main(String args[])
	{
		Demo d = new Demo();
	}
}