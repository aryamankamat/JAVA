import java.io.*;
import java.lang.*;

class Demo
{
	int i =0,j = 0,row = 0, col = 0,ch = 0;

	public Demo()
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter the row limit = ");
			row = Integer.parseInt(br.readLine());
			System.out.println("Enter the column limit = ");
			col = Integer.parseInt(br.readLine());

			int arr[][] = new int[row][col];

			System.out.println("Enter the array elements below...");
			for(i = 0;i < row;i++)
			{
				for(j = 0;j < col;j++)
				{
					System.out.println("Enter the array element at "+i+"th and "+j+"th position = ");
					arr[i][j] = Integer.parseInt(br.readLine());
				}
			}

			System.out.println();
			System.out.println("*****MENU*****");
			System.out.println("1.Display all diagonal elements  ");
			System.out.println("2.Display all non-diagonal elements");
			System.out.println("3.Display diagonal and non-diagonal elements");
			System.out.println("Select your choice  = ");
			ch = Integer.parseInt(br.readLine());

			switch(ch)
			{
				case 1:
						System.out.println("Arrya elements are displayed below.");
						for(i = 0;i < row;i++)
						{
							for(j = 0;j < col;j++)
							{
								System.out.print(arr[i][j]);
							}
							System.out.println();
						}
						System.out.println();
						System.out.println("Digonal elements are displayed below...");
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
						break;

				case 2:
						System.out.println("Arrya elements are displayed below.");
						for(i = 0;i < row;i++)
						{
							for(j = 0;j < col;j++)
							{
								System.out.print(arr[i][j]);
							}
							System.out.println();
						}
						System.out.println();
						System.out.println("Non-Digonal elements are displayed below...");
						for(i = 0;i < row;i++)
						{
							for(j = 0;j < col;j++)
							{
								if(i != j)
								{
									System.out.print(arr[i][j]);
								}
							}
							System.out.println();
						}
						break;

				case 3:
						System.out.println("Digonal and Non-Digonal elements are displayed below...");
						for(i = 0;i < row;i++)
						{
							for(j = 0;j < col;j++)
							{
								if(i == j)
								{
									System.out.print(arr[i][j]+" ");
								}
								else
								{
									System.out.print(arr[i][j]);
								}
							}
						}
						break;
				default:
						System.out.println("Invalid choice...");
						break;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class slip13_q2
{
	public static void main(String args[])
	{
		Demo d = new Demo();
	}
}