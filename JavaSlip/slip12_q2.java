import java.io.*;
import java.lang.*;

class Demo
{
	int i =0,j = 0,row = 0, col = 0,evencount = 0,oddcount = 0,poscount = 0,negcount = 0,ch = 0;

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
			System.out.println("1.Display the transpose of the matrix ");
			System.out.println("2.Display the count of all even and odd numbers");
			System.out.println("3.Display the count of all positive and negative numbers");
			System.out.println("Select your choice  = ");
			ch = Integer.parseInt(br.readLine());

			switch(ch)
			{
				case 1:
						System.out.println("2d array is displayed below...");
						for(i = 0;i < row;i++)
						{
							for(j = 0;j < col;j++)
							{
								System.out.print(arr[i][j]);
							}
							System.out.println();
						}
						System.out.println();
						int transpose[][] = new int[row][col];
						for(i = 0;i < row;i++)
						{
							for(j = 0;j < col;j++)
							{
								transpose[j][i] = arr[i][j];
							}
						}
						System.out.println("Transpose of all the matrix is displayed below...");
						for(i = 0;i < row;i++)
						{
							for(j = 0;j < col;j++)
							{
									System.out.print(transpose[i][j]);
							}
							System.out.println();
						}
						break;

				case 2:

						for(i = 0;i < row;i++)
						{
							for(j = 0;j < col;j++)
							{
								if(arr[i][j] % 2 == 0)
								{
									evencount++;
								}
								else
								{
									oddcount++;
								}
							}
						}
						System.out.println("The count of even number is = "+evencount);
						System.out.println("The count of odd number is = "+oddcount);
						break;

				case 3:
						for(i = 0;i < row;i++)
						{
							for(j = 0;j < col;j++)
							{
								if(arr[i][j] > 0)
								{
									poscount++;
								}
								else
								{
									negcount++;
								}
							}
						}
						System.out.println("The count of positive number is = "+poscount);
						System.out.println("The count of Negetive number is = "+negcount);
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
class slip12_q2
{
	public static void main(String args[])
	{
		Demo d = new Demo();
	}
}