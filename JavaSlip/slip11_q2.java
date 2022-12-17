import java.io.*;
import java.lang.*;
class XYZ
{
	int i = 0,j = 0,row = 0,col = 0,ch = 0;
	public XYZ()
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
					System.out.print("Enter the element at"+i+"th and "+j+"th position = ");
					arr[i][j] = Integer.parseInt(br.readLine());
				}
			}

			System.out.println("*****MENU*****");
			System.out.println("1.Display two d array ");
			System.out.println("2.Display all even elements from that two d array ");
			System.out.println("3.Display all odd elements from that two d array ");
			System.out.print("Select your choice = ");
			ch = Integer.parseInt(br.readLine());

			switch(ch)
			{
				case 1:
						System.out.println("All 2D array elements are displayed below...");
						for(i = 0;i < row;i++)
						{
							for(j = 0;j < col;j++)
								{
									System.out.print(arr[i][j]);
								}
								System.out.println();
						}
						break;

				case 2:
						System.out.println("All even 2D array elements are displayed below...");
						for(i = 0;i < row;i++)
						{
							for(j = 0;j < col;j++)
							{
								if(arr[i][j] % 2 == 0)
								{
									System.out.print(arr[i][j]);
								}
							}
							System.out.println();
						}
						break;
				case 3:
						System.out.println("All odd 2D array elements are displayed below...");
						for(i = 0;i < row;i++)
						{
							for(j = 0;j < col;j++)
							{
								if(arr[i][j] % 2 != 0)
								{
									System.out.print(arr[i][j]);
								}
							}
							System.out.println();
						}
						break;
				default:
						System.out.println("Invalid Choice...");
						break;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class slip11_q2
{
	public static void main(String args[])
	{
		XYZ x = new XYZ();
	}
}